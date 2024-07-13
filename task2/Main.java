package com.akash.task2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       
        Patient patient1 = new Patient("P1", "Akash Soni", 30, "123 Main St", "555-1234");
        System.out.println(patient1);

   
        Appointment appointment1 = new Appointment("P1", "D001", new Date());
        System.out.println(appointment1);

        
        EHR ehr = new EHR();
        ehr.addRecord("P1", "Record 1: Diagnosis details");
        System.out.println(ehr.getRecord("P1"));

      
        Billing billing = new Billing();
        billing.generateBill("P1", 150.00);
        System.out.println("Bill for P001: $" + billing.getBill("P1"));

        
        Inventory inventory = new Inventory();
        inventory.addSupply("Bandage", 100);
        System.out.println("Bandage stock: " + inventory.getSupply("Bandage"));

      
        Staff staff1 = new Staff("S001", "Dr. Smith", "Doctor");
        System.out.println(staff1);
    }
}
