package com.example.accountservice.service;

import com.example.accountservice.entity.Account;
import com.example.accountservice.exception.AccountNotFindException;
import com.example.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccountById (Long AccountId) {
        return accountRepository.findById(AccountId)
                .orElseThrow(() -> new AccountNotFindException("Unable to find account"));
    }

    public Long createAccount(String name, String email, String phone, List<Long> bills) {
        Account account = new Account(name, email, phone, OffsetDateTime.now(), bills);
        return accountRepository.save(account).getAccountId();
    }

    public Account accountUpdate (Long accountId, String name, String email, String phone, List<Long> bills) {
        Account account = new Account();
        account.setAccountId(accountId);
        account.setName(name);
        account.setEmail(email);
        account.setPhone(phone);
        account.setBills(bills);
        return accountRepository.save(account);
    }

    public Account deleteAccount(Long accountId){
       Account deletedAccount = getAccountById(accountId);
       accountRepository.deleteById(accountId);
       return deletedAccount;
    }


}
