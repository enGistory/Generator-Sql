package com.example.demo.generator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * mybatis generator生成注释插件 (SqlServer专用方法)
 * <p>
 * Created by huhaichao on 2017/5/15.
 */
public class MyCommentGenerator2 extends DefaultCommentGenerator {
    /**
     * properties配置文件
     */
    private Properties properties;
    /**
     * properties配置文件
     */
    private Properties systemPro;
    /**
     * 父类时间
     */
    private boolean suppressDate;
    /**
     * 父类所有注释
     */
    private boolean suppressAllComments;
    /**
     * 当前时间
     */
    private String currentDateStr;

    public static Connection getMySQLConnection() {
        Connection conn = null;
        try {
            Properties pro = new Properties();
            pro.load(MyCommentGenerator2.class.getResourceAsStream("/jdbc.properties"));
//            System.out.println();
            String driverClass = pro.getProperty("driver");
            String url = pro.getProperty("url");
            String username = pro.getProperty("username");
            String password = pro.getProperty("password");
            Class.forName(driverClass);
            conn = DriverManager
                    .getConnection(url, username, password);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("连接失败");
            e.printStackTrace();
        }
        return conn;
    }

    public MyCommentGenerator2() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
    }

    /**
     * 为字段添加注释
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        Connection conn;
        try {
            conn = getMySQLConnection();
            Statement stmt = conn.createStatement();
			 System.out.println("【" + introspectedTable.getFullyQualifiedTable() + "】");
			 System.out.println("【" + introspectedColumn.getActualColumnName() + "】");
            ResultSet rs = stmt.executeQuery(
                    "select cast(isnull(e.[value],'') as nvarchar(100)) as remark from  sys.columns a inner join sys.objects c on a.object_id=c.object_id and c.type='u' left join sys.extended_properties e on e.major_id=c.object_id  and e.minor_id=a.column_id and e.class=1 where c.name= '"+introspectedTable.getFullyQualifiedTable()+"'"+"and a.name = '"+introspectedColumn.getActualColumnName()+"'");
            while (rs.next()) {
                introspectedColumn.setRemarks(rs.getString("remark"));
                StringBuilder sb = new StringBuilder();
                field.addJavaDocLine("/**");
                sb.append(" * ");
                sb.append(introspectedColumn.getRemarks());
                field.addJavaDocLine(sb.toString().replace("\n", " "));
                field.addJavaDocLine(" */");
                //swagger注释
//                field.addAnnotation("@ApiModelProperty(value = \"" + introspectedColumn.getRemarks() + "\")");
            }

            // }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}