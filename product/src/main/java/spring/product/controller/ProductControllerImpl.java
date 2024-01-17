package spring.product.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerImpl implements ProductController {
    @Override
    public String getProductInfo(String productId) {
        return "[productId = " + productId + " at " + System.currentTimeMillis() + "]";
    }
}
