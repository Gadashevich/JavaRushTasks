package com.javarush.task.sql.task07.task0707;

import java.sql.*;

/* 
Метод wasNull
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("Select name,weight FROM employee");
        ) {
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Double weight = resultSet.getDouble("weight");
                if (resultSet.wasNull()) {
                    weight = null;
                }
                System.out.println(name + " " + weight);
            }
        }
    }
}
