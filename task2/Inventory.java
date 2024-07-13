package com.akash.task2;

import java.util.HashMap;
import java.util.Map;

class Inventory {
    private Map<String, Integer> supplies = new HashMap<>();

    public void addSupply(String item, int quantity) {
        supplies.put(item, quantity);
    }

    public Integer getSupply(String item) {
        return supplies.get(item);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "supplies=" + supplies +
                '}';
    }
}
