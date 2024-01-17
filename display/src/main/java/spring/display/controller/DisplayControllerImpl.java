package spring.display.controller;

import org.springframework.web.bind.annotation.RestController;
import spring.display.service.DisplayService;

@RestController
public class DisplayControllerImpl implements DisplayController {

    private final DisplayService displayService;

    public DisplayControllerImpl(DisplayService displayService) {
        this.displayService = displayService;
    }

    @Override
    public String displayItem(String displayId) {
        String productId = displayService.getProductItem("1111");
        return "[displayItem = " + displayId + " at " + System.currentTimeMillis() + " " + productId + "]";
    }
}
