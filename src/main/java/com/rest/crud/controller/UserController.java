package com.rest.crud.controller;

import com.rest.crud.model.User;
import com.rest.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//import javax.validation.;




//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @GetMapping("/user/{User_Id}")
    public Optional<User> getAllEmployeeById(@PathVariable(value="User_Id") String userId) {
        return userRepository.findById(userId);
    }
    /*@PostMapping("/user/{User_Id}")
    public  User createEmployee( @RequestBody User user) {
        return userRepository.save(user);
    }*/
    @PostMapping("/user")
    public  User createEmployee(@RequestBody User user_id) {
        return userRepository.save(user_id);
    }

   @PutMapping("/user/{user_id}")
   User replaceEmployee(@RequestBody User newEmployee, @PathVariable String user_id) {

       return userRepository.findById(user_id)
               .map(User -> {
                   User.setUSER_NAME(newEmployee.getUSER_NAME());
                   User.setUSER_ID(newEmployee.getUSER_ID());
                   return userRepository.save(User);
               })
               .orElseGet(() -> {
                   newEmployee.setUSER_ID(user_id);
                   return userRepository.save(newEmployee);
               });
   }


    @DeleteMapping("/user/{user_id}")
    void deleteEmployee(@PathVariable String user_id) {
        userRepository.deleteById(user_id);

    }

}

