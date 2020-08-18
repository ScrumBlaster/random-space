package com.example.accessingdatamysql;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class History {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String length;
    private String width;
    private String square;
    private String ip;
    private String timestamp;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLength() {
        return length;
    }
    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }
    public void setWidth(String width) {
        this.width = width;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) { this.ip = ip;
    }

    public String getSquare() {
        return square;
    }
    public void setSquare(String square) {
        this.square = square;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}