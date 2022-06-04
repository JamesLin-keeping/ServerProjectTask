package com.mo.mapper;

import com.mo.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface ManagerMapper {

    String getPassword(String username);

}
