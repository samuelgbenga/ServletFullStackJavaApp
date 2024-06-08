package org.Tesing;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        String url = "jdbc:mysql://localhost:3306/person";
        String user = "samuel";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("connection established: "+ url);

            Statement stmt = con.createStatement();
            String query = "SELECT * FROM person_info";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(2) + " " + rs.getString(4));
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
