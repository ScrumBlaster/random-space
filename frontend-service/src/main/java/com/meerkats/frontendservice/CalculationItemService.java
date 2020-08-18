package com.meerkats.frontendservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CalculationItemService {


    private final ICalculationItemDAO calculationItemDAO;

    @Autowired
    public CalculationItemService(@Qualifier("first") ICalculationItemDAO calculationItemDAO) {
        this.calculationItemDAO = calculationItemDAO;
    }


    public CalculationItemDTO addCalculationItemDTO(CalculationItemDTO calculationItemDTO){
        //calculationItemDTO.setTime(System.currentTimeMillis());
        return calculationItemDAO.insertData(calculationItemDTO);
    }

    public List<CalculationItemDTO>getAllData(){
        return calculationItemDAO.selectAllData();
    }

}
