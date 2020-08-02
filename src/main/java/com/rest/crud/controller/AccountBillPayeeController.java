package com.rest.crud.controller;

//import com.rest.crud.model.Account;

import com.rest.crud.model.AccountBillPayee;
import com.rest.crud.repository.AccountBillPayeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class AccountBillPayeeController {
    @Autowired
    AccountBillPayeeRepository accountRepository;

    @GetMapping("/account_bill_payee")
    public List<AccountBillPayee> getAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/account_bill_payee/{acc_bill_pay_id}")
    public Optional<AccountBillPayee> getAllAccountById(@PathVariable(value="acc_bill_pay_id") String acc_bill_pay_id) {
        return accountRepository.findById(acc_bill_pay_id);
    }
    @PostMapping("/account_bill_payee")
    public AccountBillPayee newEmployee(@RequestBody AccountBillPayee acc_bill_pay_id) {

        return accountRepository.save(acc_bill_pay_id);
    }
    @DeleteMapping("/account_bill_payee/{acc_bill_pay_id}")
    void deleteEmployee(@PathVariable String acc_bill_pay_id) {
        accountRepository.deleteById(acc_bill_pay_id);

    }
    @PutMapping("/account_bill_payee/{acc_bill_pay_id}")
    AccountBillPayee replaceEmployee(@RequestBody AccountBillPayee newEmployee, @PathVariable String acc_bill_pay_id) {

        return accountRepository.findById(acc_bill_pay_id)
                .map(AccountBillPayee -> {
                    AccountBillPayee.setACCOUNT_ID(newEmployee.getACCOUNT_ID());
                    AccountBillPayee.setACC_BILL_PAY_ID(newEmployee.getACC_BILL_PAY_ID());
                    AccountBillPayee.setACC_TXN_ID(newEmployee.getACC_TXN_ID());
                    AccountBillPayee.setBILL_PAYEE_ID(newEmployee.getBILL_PAYEE_ID());
                    return accountRepository.save(AccountBillPayee);
                })
                .orElseGet(() -> {
                    newEmployee.setACC_BILL_PAY_ID(acc_bill_pay_id);
                    return accountRepository.save(newEmployee);
                });
    }
}


