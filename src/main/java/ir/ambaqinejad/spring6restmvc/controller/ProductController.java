package ir.ambaqinejad.spring6restmvc.controller;

import ir.ambaqinejad.spring6restmvc.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class ProductController {
    private final ProductService productService;
}
