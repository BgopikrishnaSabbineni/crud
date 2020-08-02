package com.rest.crud.controller;

import com.rest.crud.model.AccountTransaction;
import com.rest.crud.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class AccountTransactionController {
    @Autowired
    AccountTransactionRepository accountRepository;
    @GetMapping("/account_txn")
    public List<AccountTransaction> getAllUsers() {

        return accountRepository.findAll();
    }

    @GetMapping("/account_txn/{acc_txn_id}")
    public Optional<AccountTransaction> getAllEmployeeById(@PathVariable(value="acc_txn_Id") String acc_txn_id) {
        return accountRepository.findById(acc_txn_id);
    }
    @PostMapping("/account_txn")
    public AccountTransaction newEmployee(@RequestBody AccountTransaction accounts) {

        return accountRepository.save(accounts);
    }
    @DeleteMapping("/account_txn/{acc_txn_id}")
    void deleteEmployee(@PathVariable String acc_txn_id) {
        accountRepository.deleteById(acc_txn_id);

    }
    @PutMapping("/account_txn/{acc_txn_id}")
    AccountTransaction replaceEmployee(@RequestBody AccountTransaction newEmployee, @PathVariable String acc_txn_id) {

        return accountRepository.findById(acc_txn_id)
                .map(AccountTransaction -> {
                    AccountTransaction.setACC_TXN_ID(newEmployee.getACC_TXN_ID());
                    AccountTransaction.setWIRE_ID(newEmployee.getWIRE_ID());
                    //AccountTransaction.setACC_TXN_ID(newEmployee.getACC_TXN_ID());
                    AccountTransaction.setACC_BILL_PAYEE_ID(newEmployee.getACC_BILL_PAYEE_ID());
                    return accountRepository.save(AccountTransaction);
                })
                .orElseGet(() -> {
                    newEmployee.setACC_TXN_ID(acc_txn_id);
                    return accountRepository.save(newEmployee);
                });

}
}


