package ir.ambaqinejad.spring6restmvc.controller;

import ir.ambaqinejad.spring6restmvc.model.Product;
import ir.ambaqinejad.spring6restmvc.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class ProductController {
    private final ProductService productService;

    public Product getProduct(UUID id) {
        log.debug("Get product by id: {} in controller.", id);
        // log.info("Get product by id: {} in controller.", id);

        return productService.getProductById(id);
    }
}
