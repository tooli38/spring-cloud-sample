package spring.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/products")
public interface ProductController {

    @GetMapping("/{productId}")
    String getProductInfo(@PathVariable String productId);
}
