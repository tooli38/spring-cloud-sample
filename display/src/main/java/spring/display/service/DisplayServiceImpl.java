package spring.display.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DisplayServiceImpl implements DisplayService {

    private final RestTemplate restTemplate;

    public DisplayServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getProductItem(String productId) {
        return restTemplate.getForObject("http://localhost:8082/products/" + productId, String.class);
    }
}
