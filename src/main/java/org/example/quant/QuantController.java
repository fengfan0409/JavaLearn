package org.example.quant;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quant")
public class QuantController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
