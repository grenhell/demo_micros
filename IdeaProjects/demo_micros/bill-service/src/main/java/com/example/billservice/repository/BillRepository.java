package com.example.billservice.repository;

import com.example.billservice.entity.Bill;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BillRepository extends CrudRepository<Bill, Long> {

    List<Bill> getBillsByAccountId(Long accountId);
}
