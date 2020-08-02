package com.rest.crud.controller;

import com.rest.crud.model.WireRecipt;
import com.rest.crud.repository.WireReciptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//import javax.validation.Valid;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class WireReciptController {
    @Autowired
    WireReciptRepository accountRepository;

    @GetMapping("/wire_rec")
    public List<WireRecipt> getAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/wire_rec/{wire_id}")
    public Optional<WireRecipt> getAllAccountById(@PathVariable(value="wire_id") String wire_id) {
        return accountRepository.findById(wire_id);
    }
    @DeleteMapping("/wire_rec/{wire_id}")
    void deleteEmployee(@PathVariable String wire_id) {
        accountRepository.deleteById(wire_id);

    }
    @PostMapping("/wire_rec")
    public WireRecipt newEmployee(@RequestBody WireRecipt accounts) {

        return accountRepository.save(accounts);
    }
    @PutMapping("/wire_rec/{wire_id}")
    WireRecipt replaceEmployee(@RequestBody WireRecipt newEmployee, @PathVariable String wire_id) {

        return accountRepository.findById(wire_id)
                .map(WireRecipt -> {
                    WireRecipt.setWIRE_ID(newEmployee.getWIRE_ID());
                    WireRecipt.setACCOUNT_ID(newEmployee.getACCOUNT_ID());
                    WireRecipt.setACC_TXN_ID(newEmployee.getACC_TXN_ID());
                    return accountRepository.save(WireRecipt);
                })
                .orElseGet(() -> {
                    newEmployee.setWIRE_ID(wire_id);
                    return accountRepository.save(newEmployee);
                });
    }
}


