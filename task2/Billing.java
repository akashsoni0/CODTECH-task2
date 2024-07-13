package com.akash.task2;

import java.util.HashMap;
import java.util.Map;

class Billing {
    private Map<String, Double> bills = new HashMap<>();

    public void generateBill(String patientId, double amount) {
        bills.put(patientId, amount);
    }

    public Double getBill(String patientId) {
        return bills.get(patientId);
    }

    @Override
    public String toString() {
        return "Billing{" +
                "bills=" + bills +
                '}';
    }
}
