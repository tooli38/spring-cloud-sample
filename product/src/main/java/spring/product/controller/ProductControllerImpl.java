package spring.product.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerImpl implements ProductController {
    @Override
    public String getProductInfo(String productId) {
//        throw new RuntimeException("I/O Exception"); // 에러를 반환해도 fallback실행
//        try{
//            Thread.sleep(2000);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("Called product id " + productId);
        return "[productId = " + productId + " at " + System.currentTimeMillis() + "]";
    }
}
