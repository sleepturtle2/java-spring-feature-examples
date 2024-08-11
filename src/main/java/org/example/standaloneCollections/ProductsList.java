package org.example.standaloneCollections;

import java.util.HashMap;
import java.util.List;

public class ProductsList {

    List<String> productNames;
    HashMap<String,Integer> productPrices;
    public List<String> getProductNames() {
        return productNames;
    }

    public void setProductNames(List<String> productNames) {
        this.productNames = productNames;
    }

    public HashMap<String, Integer> getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(HashMap<String, Integer> productPrices) {
        this.productPrices = productPrices;
    }

    @Override
    public String toString() {
        return "ProductsList{" +
                "productNames=" + productNames +
                ", productPrices=" + productPrices +
                '}';
    }
}
