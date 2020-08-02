package com.rest.crud.controller;

import com.rest.crud.model.BillPayee;
import com.rest.crud.repository.BillPayeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class BillPayeeController {
    @Autowired
    BillPayeeRepository accountRepository;

    @GetMapping("/bill_payee")
    public List<BillPayee> getAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/bill_payee/{Bill_Payee_Id}")
    public Optional<BillPayee> getAllAccountById(@PathVariable(value="Bill_Payee_Id") String Billpayeeid) {
        return accountRepository.findById(Billpayeeid);
    }
    @PostMapping("/bill_payee")
    public BillPayee newEmployee(@RequestBody BillPayee accounts) {

        return accountRepository.save(accounts);
    }
    @DeleteMapping("/bill_payee/{Bill_Payee_Id}")
    void deleteEmployee(@PathVariable String Billpayeeid) {
       accountRepository.deleteById(Billpayeeid);

    }
    @PutMapping("/bill_payee/{Bill_Payee_Id}")
    BillPayee replaceEmployee(@RequestBody BillPayee newEmployee, @PathVariable String Bill_Payee_Id) {

        return accountRepository.findById(Bill_Payee_Id)
                .map(BillPayee -> {
                    BillPayee.setBILL_PAYEE_ID(newEmployee.getBILL_PAYEE_ID());
                    BillPayee.setACC_BILL_PAYEE_ID(newEmployee.getACC_BILL_PAYEE_ID());
                    return accountRepository.save(BillPayee);
                })
                .orElseGet(() -> {
                    newEmployee.setBILL_PAYEE_ID(Bill_Payee_Id);
                    return accountRepository.save(newEmployee);
                });

    }
}


