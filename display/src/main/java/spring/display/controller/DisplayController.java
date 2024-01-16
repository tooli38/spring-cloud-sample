package spring.display.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/displays")
public interface DisplayController {

    @GetMapping("/{displayId}")
    String displayItem(@PathVariable String displayId);
}
