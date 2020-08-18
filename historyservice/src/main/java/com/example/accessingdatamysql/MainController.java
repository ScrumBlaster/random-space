package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/history")
public class MainController {
    private HistoryRepository historyRepository;
    @Autowired
    MainController(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody String addNewHistory (@RequestParam String length, @RequestParam String width, @RequestParam String square, @RequestParam String ip, @RequestParam String timestamp) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        History n = new History();
        n.setLength(length);
        n.setWidth(width);
        n.setSquare(square);
        n.setIp(ip);
        n.setTimestamp(timestamp);
        historyRepository.save(n);
        return "Saved";
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Iterable<History> getAllHistory(@RequestParam String amount) {
        // This returns a JSON or XML with the History
        return historyRepository.findFirst10ByOrderByIdDesc();
    }
}

