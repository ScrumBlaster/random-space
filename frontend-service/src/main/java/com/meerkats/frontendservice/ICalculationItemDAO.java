package com.meerkats.frontendservice;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public interface ICalculationItemDAO {

    CalculationItemDTO insertData(String userIP, long timeFrontEnd, CalculationItemDTO calculationItemDTO);

    default CalculationItemDTO insertData(CalculationItemDTO calculationItemDTO) {
        long timeFrontEnd = System.currentTimeMillis();
        HttpServletRequest request = null;
        InetAddress ip = null;

        try {
            ip = InetAddress.getLocalHost();
        } catch (
                UnknownHostException e) {

            e.printStackTrace();
        }

        String userIP = ip.toString();
        return insertData(userIP, timeFrontEnd, calculationItemDTO);
    }

    List<CalculationItemDTO> selectAllData();

}
