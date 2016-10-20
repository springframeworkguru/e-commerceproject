package com.springframework.ecommerce.controllers;

import com.springframework.ecommerce.domain.Customer;
import com.springframework.ecommerce.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by steven on 10/19/16.
 */
@Controller
public class CustomerController {


    private CustomerService customerService;

    @RequestMapping("/customers")
    public String listAllCustomers(Model model) {
        model.addAttribute("customers", customerService.listAllCustomers());
        return "customers";
    }

    @RequestMapping("/customer/{id}")
    public String getCustomerById(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customer";
    }

    @RequestMapping("/customer/new")
    public String createNewCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customerform";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public String saveOrUpdateCustomer(Customer customer) {
        Customer saveCustomer = customerService.saveOrUpdateCustomer(customer);
        return "redirect:/customer" + saveCustomer.getId();
    }

    @RequestMapping("/customer/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customerform";
    }

    @RequestMapping("/customer/delete/{id}")
    public String delete(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers";
    }
    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}
