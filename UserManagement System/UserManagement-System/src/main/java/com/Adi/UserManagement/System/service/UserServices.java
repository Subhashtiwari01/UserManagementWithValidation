package com.Adi.UserManagement.System.service;

import com.Adi.UserManagement.System.model.User;
import com.Adi.UserManagement.System.repositorry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServices {
    @Autowired

    UserRepo userRepo;
    public  List<User> getAllUsers() {

        return userRepo.getUser();
    }

    public String creatUsers(List<User> users) {
        List<User>originalList=getAllUsers();
        originalList.addAll(users);
        return "New User Added";
    }
    public String creatUsers(User users) {
        List<User>originalList=getAllUsers();
        originalList.add(users);
        return "New User Added";
    }


    public String updtaeUser(int userid, User user) {
        User user1=userRepo.getUserById(userid);
        if(user1!=null){
            user1.setName(user.getName());
            user1.setUserDob(user.getUserDob());
            user1.setUserType(user.getUserType());
            user1.setDate(user.getDate());
            user1.setTime(user.getTime());
            user1.setContactNumber(user.getContactNumber());
            user1.setName(user.getName());
            user1.setContactNumber(user.getContactNumber());


        }
        return "Information Updated";


    }

    public String removeUser(int userid) {
        return userRepo.removeUser(userid);

    }
}
