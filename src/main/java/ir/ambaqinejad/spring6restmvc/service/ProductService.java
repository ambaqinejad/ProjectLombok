package ir.ambaqinejad.spring6restmvc.service;

import ir.ambaqinejad.spring6restmvc.model.Product;

import java.util.UUID;

public interface ProductService {
    Product getProductById(UUID id);
}
