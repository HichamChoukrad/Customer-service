package org.sid.repositories;

import org.sid.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource   //Api RestFull
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
