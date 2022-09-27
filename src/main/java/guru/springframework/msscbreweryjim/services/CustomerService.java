package guru.springframework.msscbreweryjim.services;

import guru.springframework.msscbreweryjim.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-21.
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
