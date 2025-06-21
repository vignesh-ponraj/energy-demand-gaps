package com.energygap.service;
import java.util.*;

public interface EnergyService {
    List<Map<String, Object>> getAvgDailyDemand(){ return new ArrayList<>(); }
    List<Map<String, Object>> getRenewableShare(){ return new ArrayList<>(); }
    List<Map<String, Object>> getTopUndersupplied(int topN){ return new ArrayList<>(); }
}
