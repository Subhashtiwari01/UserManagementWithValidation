package com.Adi.UserManagement.System.Controller;

import com.Adi.UserManagement.System.model.User;
import com.Adi.UserManagement.System.service.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserServices userservices;


    @GetMapping("users")
    List<User> getAllusers() {

        return userservices.getAllUsers();
    }

    @PostMapping("UserPost")
    String addusers(@Valid @RequestBody List<User> users ){

        return userservices.creatUsers(users);
    }
    @PostMapping("user")
    String addUser(@Valid @RequestBody User user){

        return userservices.creatUsers((List<User>) user);
    }

    @PutMapping("User/{userid}")

    String updateUser(@PathVariable int userid, @Valid @RequestBody User user){
        return userservices.updtaeUser(userid,user);
    }

    @DeleteMapping("Remove/{userid}")

    String removeuser(@PathVariable int userid){

        return userservices.removeUser(userid);
    }









}
