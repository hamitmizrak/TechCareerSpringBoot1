package com.hamitmizrak.dao;

import com.hamitmizrak.dto.AdminDto;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Log4j2
public class AdminDao implements IDaoConnection<AdminDto> {


    @Override
    public void create(AdminDto adminDto) {
        try (Connection connection = getInterfaceConnection()) {
            String sql = "insert into admin (admin_name,admin_surname) values (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,adminDto.getAdminName());
            preparedStatement.setString(2,adminDto.getAdminSurname());
            int rowEffected=preparedStatement.executeUpdate();

            if(rowEffected>0){
                log.info(AdminDao.class+ " Ekleme başarılı");
            }else{
                log.error(AdminDao.class+ " EKLEME BAŞARISIZ");
            }
        } catch (SQLException sql) {
            log.error(AdminDao.class+ " connection failed");
            sql.printStackTrace();
        }
    }

    @Override
    public void update(AdminDto adminDto) {
        try (Connection connection = getInterfaceConnection()) {
            String sql = "update admin set admin_name=?,admin_surname=? where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,adminDto.getAdminName());
            preparedStatement.setString(2,adminDto.getAdminSurname());
            preparedStatement.setInt(3,adminDto.getAdminId());
            int rowEffected=preparedStatement.executeUpdate();

            if(rowEffected>0){
                log.info(AdminDao.class+ " Güncelleme başarılı");
            }else{
                log.error(AdminDao.class+ " GÜNCELLEME BAŞARISIZ");
            }
        } catch (SQLException sql) {
            log.error(AdminDao.class+ " connection failed");
            sql.printStackTrace();
        }
    }


    @Override
    public void delete(AdminDto adminDto)  {
        try (Connection connection = getInterfaceConnection()) {
            String sql = "delete from admin  where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,adminDto.getAdminId());
            int rowEffected=preparedStatement.executeUpdate();

            if(rowEffected>0){
                log.info(AdminDao.class+ " Silme başarılı");
            }else{
                log.error(AdminDao.class+ " Silme BAŞARISIZ");
            }
        } catch (SQLException sql) {
            log.error(AdminDao.class+ " connection failed");
            sql.printStackTrace();
        }
    }

    @Override
    public ArrayList<AdminDto> list() {
        ArrayList<AdminDto> list=new ArrayList<>();
        AdminDto adminDto;
        try (Connection connection = getInterfaceConnection()) {
            String sql = "select * from admin";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                adminDto=new AdminDto();
                adminDto.setAdminId(resultSet.getInt("id"));
                adminDto.setAdminName(resultSet.getString("admin_name"));
                adminDto.setAdminSurname(resultSet.getString("admin_surname"));
                adminDto.setCreatedDate(resultSet.getDate("created_date"));
                list.add(adminDto);
            }
        } catch (SQLException sql) {
            log.error(AdminDao.class+ " connection failed");
            sql.printStackTrace();
        }
        return list;
    }
}
