package com.Adi.UserManagement.System.Configration;

import com.Adi.UserManagement.System.model.Type;
import com.Adi.UserManagement.System.model.User;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static com.Adi.UserManagement.System.model.Type.Admin;

@Configuration
public class BeenManager {

    @Bean
    public List<User> getInitializedList(){
        User initUser=new User(1,"Subhash",LocalDate.of(2001,10,15),"subh@gmail.com","9876543210", LocalTime.of(11,12,55),LocalDate.of(2023,05,11) ,Type.Admin);
        List<User>initList=new ArrayList<>();
        initList.add(initUser);
        return initList;
    }



}
