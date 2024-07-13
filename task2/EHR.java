package com.akash.task2;

import java.util.HashMap;
import java.util.Map;

class EHR {
    private Map<String, String> records = new HashMap<>();

    public void addRecord(String patientId, String record) {
        records.put(patientId, record);
    }

    public String getRecord(String patientId) {
        return records.get(patientId);
    }

    @Override
    public String toString() {
        return "EHR{" +
                "records=" + records +
                '}';
    }
}

