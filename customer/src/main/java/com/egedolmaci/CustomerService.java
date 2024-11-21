package com.egedolmaci;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName)
                .lastName(customerRegistrationRequest.lastName)
                .email(customerRegistrationRequest.email)
                .build();

        // TODO: check if email valid
        // TODO: checkif email not taken

        customerRepository.save(customer);

    }

}
