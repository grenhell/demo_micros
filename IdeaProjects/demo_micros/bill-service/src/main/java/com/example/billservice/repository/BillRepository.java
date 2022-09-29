package com.example.billservice.repository;

import com.example.billservice.entity.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill, Long> {

}
