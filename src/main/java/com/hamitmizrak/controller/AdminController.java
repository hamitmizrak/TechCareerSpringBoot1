package com.hamitmizrak.controller;


import com.hamitmizrak.dao.AdminDao;
import com.hamitmizrak.dao.IDaoConnection;
import com.hamitmizrak.dto.AdminDto;

import java.util.ArrayList;

public class AdminController implements IDaoConnection<AdminDto> {

    private AdminDao adminDao;

    public AdminController() {
        adminDao = new AdminDao();
    }

    @Override
    public void create(AdminDto adminDto) {
        adminDao.create(adminDto);
    }

    @Override
    public void update(AdminDto adminDto) {
        adminDao.update(adminDto);
    }

    @Override
    public void delete(AdminDto adminDto) {
        adminDao.delete(adminDto);
    }

    @Override
    public ArrayList<AdminDto> list() {
        return adminDao.list();
    }
}
