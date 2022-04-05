package com.hamitmizrak.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    //Nesne değişkeni
    private int adminId;
    private Date createdDate;
}
