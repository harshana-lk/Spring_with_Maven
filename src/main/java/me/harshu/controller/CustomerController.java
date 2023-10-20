package me.harshu.controller;

import me.harshu.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getAllCustomers(){
        return new CustomerDTO("C001","Harshana","Badulla",15000.00);
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO searchCustomer(){
        return new CustomerDTO("C002","Harshana","Badulla",15000.00);
    }

    @PostMapping
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        return "Json Data : "+customerDTO;
    }

    @GetMapping(headers = {"Content-Type=text/css","Accept=application/json"})
    public CustomerDTO deleteCustomer(){
        return new CustomerDTO("C003","Harshana","Badulla",15000.00);
    }

}
