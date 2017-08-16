package com;

import java.sql.*;

/**
 * Create By Bridge On 2017/8/11
 * Function: MySQLDemo
 * Description:
 */

/**
 * 总结连接MySQL驱动：
 * 1.注册MySQL驱动
 * 2.传递DB，USERNAME,PASSWORD
 * 3.
 */
public class MySQLDemo {

    // JDBC 驱动名及数据库 URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/runoob?characterEncoding=utf8&useSSL=true";

    // 数据库的用户名与密码，需要根据自己的设置
    private static final String USER = "root";
    private static final String PASS = "123456";

    public static void main(String[] args){

        Connection conn = null;
        Statement statement = null;

        // 注册 JDBC 驱动
        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("连接数据库...");
            //使用DriverManager获取数据库连接
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("实例化Statement...");

            //使用Connection来创建一个Statment对象
            statement = conn.createStatement();

            String sql = "";

            sql = "select id, name ,url from websites";

            //
            ResultSet resultSet = statement.executeQuery(sql);

            //展开结果集数据库 or //执行查询语句并且保存结果
            while (resultSet.next()){

                // 通过字段检索
                int id  = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String url = resultSet.getString("url");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }

            // 完成后关闭
            resultSet.close();
            statement.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {

            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally {
            // 关闭资源
            try{
                if(statement!=null){
                    statement.close();
                }
            }catch(SQLException se2){
                // do nothing
            }// 什么都不做
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
