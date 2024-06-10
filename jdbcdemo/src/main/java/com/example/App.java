package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import com.example.Models.Worker;

public class App {
    public Connection getFileFromResources() {
        Properties prop = new Properties();
        try {
            // prop.load(getClass().getResourceAsStream("./resources/ds-connection.properties"));
            /*String dbName = (String) prop.getProperty("ds.url");

            String connUrl = (String) prop.getProperty("ds.url");
            String username = (String) prop.getProperty("ds.username");
            String password = (String) prop.getProperty("ds.password");*/

            String dbName = "com.mysql.cj.jdbc.Driver";
            String connUrl = "jdbc:mysql://localhost:3306/demo";
            String username = "root";
            String password = "root";
            Class.forName(dbName);
            Connection conn = DriverManager.getConnection(connUrl, username, password);
            if(conn != null) {
                System.out.println("Connection Successfull");
            } else {
                System.out.println("Connection Failed");
            }
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main( String[] args ) {
        WorkerQueries wq = new WorkerQueries();
        List<Worker> list = wq.listWorker();
        if(list.size() == 0) {
            System.out.println("No data exist");
        } else {
            list.forEach(System.out::println);
        }
        
    }
}
