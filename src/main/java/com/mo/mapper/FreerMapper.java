package com.mo.mapper;

import com.mo.pojo.Freer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Mapper
@Repository
public interface FreerMapper {

    Collection<Freer> getAll();

    Collection<Freer> getFreerByName(String name);

    Freer getFreerById(int id);

    int addFreer(Freer freer);

    int removeFreer(int id);

    int updateFreer(Freer freer);


}
