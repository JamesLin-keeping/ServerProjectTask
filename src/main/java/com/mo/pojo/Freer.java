package com.mo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Freer {

    private Integer fid;
    private String fname;
    private Integer ftype;
    private Integer phone;
    private String email;
    private String schedule;


}
