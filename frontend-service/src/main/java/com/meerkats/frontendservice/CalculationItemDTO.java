package com.meerkats.frontendservice;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;



public class CalculationItemDTO {

    private  String ip;

    private long timeFrontEnd;

    @NotBlank
    private int length;

    @NotBlank
    private int width;


    public CalculationItemDTO() {

    }


    public void setWidth(int width) {
        this.width = width;
    }


    public CalculationItemDTO(@JsonProperty("ip") String ip,
                              @JsonProperty("length") int length,
                              @JsonProperty("timeFrontEnd") long timeFrontEnd,
                              @JsonProperty("width") int width) {
        this.ip = ip;
        this.timeFrontEnd = timeFrontEnd;
        this.length = length;
        this.width = width;
    }

    public String getUserIP() {
        return ip;
    }
    public void setUserIP(String userIP) {
        this.ip = userIP;
    }

    public long getTime() {
        return timeFrontEnd;
    }

    public void setTime(long timeFrontEnd) {
        this.timeFrontEnd = timeFrontEnd;
    }


    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }


    @Override
    public String toString() {
        return "UserInput{" +
                "ip='" + ip + '\'' +
                ", timeFrontEnd=" + timeFrontEnd +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

}
