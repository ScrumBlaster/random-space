package com.meerkats.frontendservice.api;

import com.meerkats.frontendservice.CalculationItemDTO;
import com.meerkats.frontendservice.CalculationItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/viewData")
@RestController
public class CalculationController{

    private final CalculationItemService calculationItemService;

    @Autowired
    public CalculationController(CalculationItemService calculationItemService) {
        this.calculationItemService = calculationItemService;
    }


    public void addCalculationItemDTO(@RequestBody CalculationItemDTO calculationItemDTO){
        calculationItemService.addCalculationItemDTO(calculationItemDTO);
    }

    @GetMapping
    public List<CalculationItemDTO>getAllData(){
        return calculationItemService.getAllData();
    }

}
