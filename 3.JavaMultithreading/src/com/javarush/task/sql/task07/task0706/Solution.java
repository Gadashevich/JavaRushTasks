package com.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
task0706
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from employee limit 1");
        ){
            ResultSetMetaData metaData = resultSet.getMetaData();
            for (int i = 1; i <= metaData.getColumnCount() ; i++) {
                System.out.println(metaData.getColumnName(i) +"(" + metaData.getColumnTypeName(i)+")");
            }

        }

    }
}
