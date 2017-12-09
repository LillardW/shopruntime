package org.shop.shopruntime.dao;

import org.shop.shopruntime.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<Customer, Long>{
    public Customer findByCustomerName(String customerName);

    public Customer save(Customer customer);


}
