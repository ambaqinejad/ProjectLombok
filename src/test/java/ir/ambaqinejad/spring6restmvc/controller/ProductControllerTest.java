package ir.ambaqinejad.spring6restmvc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductControllerTest {

    @Autowired
    ProductController productController;

    @Test
    void getProduct() {
        System.out.println(productController.getProduct(UUID.randomUUID()));
    }
}