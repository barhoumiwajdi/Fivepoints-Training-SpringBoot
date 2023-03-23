package com.example.jpatraining.service;

import com.example.jpatraining.Exception.CustomerNotFoundException;
import com.example.jpatraining.dao.CustomerDAO;
import com.example.jpatraining.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;


@Component
public class CustomerService {
    @Autowired
    private CustomerDAO customerdao ;

    private List<Customer> customerList = new CopyOnWriteArrayList<>();
    private int customerIdCount = 1 ;
    public Customer addcustomer (Customer customer ){
    /*********    customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerList.add(customer);
        customerIdCount ++ ;*/
        return customerdao.save(customer);
       // return customer;
    }
    public List<Customer> getcustomerlist(){

            return  customerdao.findAll();


    //  return customerList;
    }
    public Customer  getCustomer (int customerId){

       /** return customerList
                .stream()
                .filter(c->c.getCustomerId()==customerId)
                .findFirst()
                .get();*/
        Optional<Customer> OptionalCustomer = this.customerdao.findById(customerId);

        if(OptionalCustomer.isPresent())
        {
            return OptionalCustomer.get();
        }
        else
        {
            throw new CustomerNotFoundException("customer not found........ ");
        }
    }
    public Customer updateCustomer (int customerId , Customer  customer ){

        customer.setCustomerId(customerId);
       /** customerList
                .stream()
                .forEach(c-> {
                    if (c.getCustomerId() == customerId) {
                        c.setCustomerFirstname(customer.getCustomerFirstname());
                        c.setCustomerLastname(customer.getCustomerLastname());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                } );
        return customerList
                .stream()
                .filter(c->c.getCustomerId()==customerId)
                .findFirst()
                .get();
*/
       return customerdao.save(customer);

    }

    public void deleteCustomer(int customerId) {
      /**  customerList
                .stream()
                .forEach(c ->
                        {
                            if (c.getCustomerId() == customerId) {
                                customerList.remove(c);
                            }
                        }
                );*/
        customerdao.deleteById(customerId);
    }
}
