package com.mo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    private int mid;
    private String mpassword;
    private String mpusername;
}
