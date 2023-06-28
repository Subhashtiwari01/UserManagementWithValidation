package com.Adi.UserManagement.System.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotNull
    private Integer UserId;
    @NotEmpty
    private String Name;
    public LocalDate UserDob;
    private String EmailAddress;
    private String ContactNumber;
    private LocalTime Time;
    private LocalDate Date;



    private Type UserType;


}
