package com.meerkats.frontendservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private final CalculationItemService calculationItemService;

    @Autowired
    RestTemplate restTemplate;

    public HomeController(CalculationItemService calculationItemService) {
        this.calculationItemService = calculationItemService;
    }

    @GetMapping("/form")
    public String calculationForm(Model model) {
        List<CalculationItemDTO> calculationItemDTOList = calculationItemService.getAllData();
        model.addAttribute("calculationItemDTOList", calculationItemDTOList);
        model.addAttribute("item", new CalculationItemDTO());

        model.addAttribute("historyItems", HistoryResponse.getHistoryList());
        model.addAttribute("result", CalculationItemResponse.getResult());
        return "form";


    }


    @PostMapping("/form")
    public String saveFormData (@ModelAttribute CalculationItemDTO item, Model model){
        CalculationItemDTO savedItem = calculationItemService.addCalculationItemDTO(item);
        model.addAttribute("item", item);

        return "redirect:/form";
    }




}

