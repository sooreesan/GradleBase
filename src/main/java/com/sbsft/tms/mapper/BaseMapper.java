package com.sbsft.tms.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseMapper {

    String getTestKey();
}
