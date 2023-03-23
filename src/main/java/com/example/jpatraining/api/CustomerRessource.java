package com.example.jpatraining.api;

import com.example.jpatraining.model.Customer;
import com.example.jpatraining.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/customers")
public class CustomerRessource {

    @Autowired
    public CustomerService customerservice ;


    @PostMapping
    public Customer addCustomer (@RequestBody Customer customer ){
        return customerservice.addcustomer(customer);
    }
    @GetMapping
    public List<Customer> getcustomers(){
        return customerservice.getcustomerlist();
    }
    @GetMapping("/{customerId}")
    public Customer getcustomer(@PathVariable("customerId") int customerId){
        return customerservice.getCustomer(customerId);
    }
    @PutMapping("/{customerId}")
    public Customer putcustomer(@PathVariable ("customerId") int customerId ,@RequestBody Customer customer){
        return customerservice.updateCustomer(customerId , customer);
    }
    @DeleteMapping("/{customerId}")
    public void deletecust(@PathVariable ("customerId") int customerId){
        customerservice.deleteCustomer(customerId);
    }
}
