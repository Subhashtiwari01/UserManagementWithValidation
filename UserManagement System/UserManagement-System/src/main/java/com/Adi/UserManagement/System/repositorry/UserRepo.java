package com.Adi.UserManagement.System.repositorry;

import com.Adi.UserManagement.System.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {



    private List<User> userList=new ArrayList<>();


    public List<User> getUser(){

        return userList;
    }

    public User getUserById(int userid){
        for(User user:userList){
            if(user.getUserId()==userid){
                return user;
            }
        }
        return null;

    }


    public String removeUser(int userid) {
        for(User user:userList){
            if(user.getUserId()==userid){
                userList.remove(user);
                return "User deleted ";
            }
        }
        return "User with given id is not found";
    }
}
