package org.example;

public class Main {
    public static void main(String[] args) {
        WarrantyService service = WarrantyService.getInstance();
        service.registerWarranty("Laptop", "2024-12-31");
        System.out.println(service.checkWarranty("Laptop"));

        WarrantyService service2 = WarrantyService.getInstance();
        System.out.println(service == service2);
    }
}
