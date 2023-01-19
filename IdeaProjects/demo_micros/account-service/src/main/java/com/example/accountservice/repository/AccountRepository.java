package com.example.accountservice.repository;

import com.example.accountservice.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
