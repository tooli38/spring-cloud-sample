package spring.display.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DisplayServiceImpl implements DisplayService {

    private final RestTemplate restTemplate;

    public DisplayServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getProductItemFallback")
    public String getProductItem(String productId) {
        return restTemplate.getForObject("http://product/products/" + productId, String.class);
    }

    public String getProductItemFallback(String productId, Throwable t) {
        System.out.println("t = " + t);
        return "[This Product is sold out :" + productId +  "]";
    }
}
