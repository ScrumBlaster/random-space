package com.meerkats.frontendservice;

import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class HistoryResponse {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(HistoryItem.class);


    static RestTemplate restTemplate = new RestTemplate();


    public static HistoryItem[] getHistoryList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);


        ResponseEntity<HistoryItem[]> response =
                restTemplate.exchange(
                        "http://ip-10-1-12-69.eu-central-1.compute.internal:8090/history?amount", HttpMethod.GET, entity, HistoryItem[].class);
        HistoryItem[] item = response.getBody();


     /*   HistoryItem[] item = new HistoryItem[]{
                new HistoryItem("322", "ree", "hfhfh", "fere", "deege", "5tgt")
        }; */
        return item;
    }


}
