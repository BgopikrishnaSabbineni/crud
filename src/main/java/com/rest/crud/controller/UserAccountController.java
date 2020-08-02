package com.rest.crud.controller;

import com.rest.crud.model.UserAccount;
import com.rest.crud.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class UserAccountController {
    @Autowired
    UserAccountRepository accountRepository;

    @GetMapping("/user_account")
    public List<UserAccount> getAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/user_account/{user_id}")
    public Optional<UserAccount> getAllAccountById(@PathVariable(value="user_id") String accountId) {
        return accountRepository.findById(accountId);
    }
    @DeleteMapping("/user_account/{user_id}")
    void deleteEmployee(@PathVariable String user_id) {
        accountRepository.deleteById(user_id);

    }
    @PostMapping("/user_account")
    public UserAccount newEmployee(@RequestBody UserAccount accounts) {

        return accountRepository.save(accounts);
    }
    @PutMapping("/user_account/{user_id}")
    UserAccount replaceEmployee(@RequestBody UserAccount newEmployee, @PathVariable String user_id) {

        return accountRepository.findById(user_id)
                .map(UserAccount -> {
                    UserAccount.setACCOUNT_ID(newEmployee.getACCOUNT_ID());
                    UserAccount.setUSER_ID(newEmployee.getUSER_ID());
                    return accountRepository.save(UserAccount);
                })
                .orElseGet(() -> {
                    newEmployee.setUSER_ID(user_id);
                    return accountRepository.save(newEmployee);
                });
    }
}


