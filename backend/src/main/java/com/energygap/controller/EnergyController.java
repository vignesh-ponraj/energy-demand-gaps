package com.energygap.controller;

import com.energygap.service.EnergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // CORS for all (safe for hackathon)
public class EnergyController {

    @Autowired
    private EnergyService energyService;

    @GetMapping("/demand/state")
    public List<Map<String, Object>> getDemandByState() {
        // Placeholder—replace with real DTO/model later
        return energyService.getAvgDailyDemand();
    }

    @GetMapping("/renewable/share")
    public List<Map<String, Object>> getRenewableShare() {
        return energyService.getRenewableShare();
    }

    @GetMapping("/undersupplied")
    public List<Map<String, Object>> getUndersupplied(
            @RequestParam(defaultValue = "5") int topN) {
        return energyService.getTopUndersupplied(topN);
    }
}