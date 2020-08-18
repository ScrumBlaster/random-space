package com.meerkats.frontendservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CalculationItemResponse {

    public static String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private static String result;
}