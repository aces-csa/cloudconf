package com.blueyonder.apiwalaexample.repostiory;

import org.springframework.data.repository.CrudRepository;

import com.blueyonder.apiwalaexample.model.Customer;

public interface CustomerRepo  extends CrudRepository<Customer, Integer>{

}
