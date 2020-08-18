package com.meerkats.frontendservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoryItem {
    @JsonProperty("id")
    private String id;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("length")
    private String length;
    @JsonProperty("width")
    private String width;
    @JsonProperty("square")
    private String square;
    @JsonProperty("timestamp")
    private String timestamp;

    public HistoryItem(String id, String ip, String length, String width, String square, String timestamp) {
        super();
        this.id=id;
        this.ip = ip;
        this.timestamp = timestamp;
        this.length = length;
        this.width = width;
        this.square = square;
    }

    public HistoryItem(){}



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTime() {
        return timestamp;
    }

    public void setTime(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
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


}


