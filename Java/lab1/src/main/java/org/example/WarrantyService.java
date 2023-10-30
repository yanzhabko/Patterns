package org.example;
import java.util.HashMap;

public class WarrantyService {
    private static WarrantyService instance;
    private HashMap<String, String> warrantyInfo;
    private WarrantyService() {
        warrantyInfo = new HashMap<>();
    }

    public static WarrantyService getInstance() {
        if (instance == null)
            instance = new WarrantyService();
        return instance;
    }

    public void registerWarranty(String productId, String warrantyPeriod) {
        warrantyInfo.put(productId, warrantyPeriod);
    }

    public String checkWarranty(String productId) {
        if (warrantyInfo.containsKey(productId)) {
            return "Гарантія на товар " + productId + " дійсна до " + warrantyInfo.get(productId);
        } else {
            return "Гарантія на товар " + productId + " не знайдена";
        }
    }
}
