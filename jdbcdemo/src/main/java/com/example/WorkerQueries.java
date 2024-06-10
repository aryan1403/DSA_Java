package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.Models.Worker;

public class WorkerQueries {
    //return the worker
    public List<Worker> listWorker() {
        App app = new App();
        Connection con = app.getFileFromResources();
        List<Worker> workerList = new ArrayList<>();
        Worker w = null;
        ResultSet rs = null;
        Statement st = null;
        String query = "select * from worker";

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                w = new Worker();
                w.setWorkerId(rs.getString(1));
                w.setName(rs.getString("name"));
                w.setSalary(rs.getFloat(3));
                w.setType(rs.getString("type"));

                workerList.add(w);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return workerList;
    }
}
