package com.example.Models;

import lombok.Data;

@Data
public class Worker {
    private String workerId;
    private String name;
    private float salary;
    private String type;
    private int pricePerHour;
}
