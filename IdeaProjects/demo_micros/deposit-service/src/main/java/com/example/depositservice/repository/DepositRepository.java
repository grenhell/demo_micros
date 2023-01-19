package com.example.depositservice.repository;


import com.example.depositservice.entity.Deposit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DepositRepository extends CrudRepository<Deposit, Long> {

    List<Deposit> findDepositsByEmail(String email);
}
