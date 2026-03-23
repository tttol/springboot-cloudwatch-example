package io.github.tttol.springboot_cloudwatch_example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleController {

    @GetMapping("/demo")
    public String demo() {
        log.info("demo endpoint called");
        log.info("Hello World!");
        return "demo";
    }
}
