package ir.ambaqinejad.spring6restmvc.service;

import ir.ambaqinejad.spring6restmvc.model.Product;
import ir.ambaqinejad.spring6restmvc.model.ProductStyle;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProductById(UUID id) {
        return Product.builder()
                .id(id)
                .version(1)
                .beerName("Test")
                .productStyle(new ProductStyle())
                .upc("123456")
                .price(new BigDecimal("12.55"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
    }
}
