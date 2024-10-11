package com.example.costumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
@Slf4j
public record CustomerController(CustomerService customerService) {
    @PostMapping("save")
    public void saveCustomer(@RequestBody CustomerRequest request) {
        log.info("New customer registration {}", request);
        customerService.save(request);
    }
}