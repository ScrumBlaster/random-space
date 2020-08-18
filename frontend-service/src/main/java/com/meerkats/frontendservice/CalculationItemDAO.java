package com.meerkats.frontendservice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository("first")
public class CalculationItemDAO implements ICalculationItemDAO {

    private static List<CalculationItemDTO> calculationItemDTO = new ArrayList<>();


    @Override
    public CalculationItemDTO insertData(@RequestBody String userIP, long timeFrontEnd, CalculationItemDTO itemDTO) {

        calculationItemDTO.add(new CalculationItemDTO(userIP, itemDTO.getLength(), timeFrontEnd, itemDTO.getWidth()));

        CalculationItemDTO calc = new CalculationItemDTO();
        String ip = userIP;
        String length = String.valueOf(itemDTO.getLength());
        String width = String.valueOf(itemDTO.getWidth());
        String time = String.valueOf(timeFrontEnd);
        RestTemplate resttemplate = new RestTemplate();
        String URL = "http://ip-10-1-12-117.eu-central-1.compute.internal:8080/calculate?ip=" + ip+ "&timestamp=" + time + "&width=" + width + "&length=" + length;
        ResponseEntity<String> answer = resttemplate.getForEntity(URL, String.class, itemDTO);
        String result = answer.getBody();
        CalculationItemResponse response = new CalculationItemResponse();
        response.setResult(result);
        return itemDTO;
    }


    @Override
    public List<CalculationItemDTO> selectAllData() {
        return calculationItemDTO;
    }
}
