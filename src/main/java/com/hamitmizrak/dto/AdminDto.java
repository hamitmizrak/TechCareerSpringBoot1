package com.hamitmizrak.dto;

import lombok.*;

import java.util.Date;

@Getter @Setter

public class AdminDto extends BaseEntity {
    private String adminName;
    private String adminSurname;

    //parametresiz constructo
    public AdminDto() {
    }

    //parametreli constructor
    public AdminDto(int adminId, Date createdDate, String adminName, String adminSurname) {
        super(adminId, createdDate);
        this.adminName = adminName;
        this.adminSurname = adminSurname;
    }

    @Override
    public String toString() {
        return "AdminDto{" +
                "adminName='" + adminName + '\'' +
                ", adminSurname='" + adminSurname + '\'' +
                "} " + super.toString();
    }



}
