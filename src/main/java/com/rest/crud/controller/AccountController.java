package com.rest.crud.controller;
import com.rest.crud.model.Account;
import com.rest.crud.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/accounts/{account_Id}")
    public Optional<Account> getAllAccountById(@PathVariable(value="account_Id") String account_Id) {
        return accountRepository.findById(account_Id);
    }
    @PostMapping("/accounts")
    public Account newEmployee(@RequestBody Account accounts) {

        return accountRepository.save(accounts);
    }
    @PutMapping("/accounts/{account_id}")
    Account replaceEmployee(@RequestBody Account newEmployee, @PathVariable String account_id) {

        return accountRepository.findById(account_id)
                .map(Account -> {
                    Account.setACCOUNT_ID(newEmployee.getACCOUNT_ID());
                    Account.setACCOUNT_TYPE(newEmployee.getACCOUNT_TYPE());
                    return accountRepository.save(Account);
                })
                .orElseGet(() -> {
                    newEmployee.setACCOUNT_ID(account_id);
                    return accountRepository.save(newEmployee);
                });
    }
    @DeleteMapping("/accounts/{account_id}")
    void deleteEmployee(@PathVariable String account_id) {
        accountRepository.deleteById(account_id);

    }
}


