package com.hamitmizrak.main;

import com.hamitmizrak.controller.AdminController;
import com.hamitmizrak.dto.AdminDto;

import java.util.ArrayList;
import java.util.List;

public class AdminMainTest {
    public static void main(String[] args) {
        AdminController adminController=new AdminController();
        AdminDto adminDto= new AdminDto();

        //CREATE
        //adminDto.setAdminName("HamitAdmin");
        //adminDto.setAdminSurname("MızrakAdmin");
        //adminController.create(adminDto);

        //UPDATE
       // adminDto.setAdminId(1);
       // adminDto.setAdminName("Hamit44");
       // adminDto.setAdminSurname("Mızrak44");
        //adminController.update(adminDto);

        //DELETE
        //adminDto.setAdminId(1);
        //adminController.delete(adminDto);

        //LIST
        List<AdminDto> list=adminController.list();
        list.forEach(System.out::println);


    }
}
