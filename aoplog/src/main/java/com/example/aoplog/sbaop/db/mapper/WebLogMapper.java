package com.example.aoplog.sbaop.db.mapper;


import com.example.aoplog.sbaop.db.example.WebLogExample;
import com.example.aoplog.sbaop.db.model.WebLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WebLogMapper {
    long countByExample(WebLogExample example);

    int deleteByExample(WebLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebLog record);

    int insertSelective(WebLog record);

    List<WebLog> selectByExampleWithBLOBs(WebLogExample example);

    List<WebLog> selectByExample(WebLogExample example);

    WebLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebLog record, @Param("example") WebLogExample example);

    int updateByExampleWithBLOBs(@Param("record") WebLog record, @Param("example") WebLogExample example);

    int updateByExample(@Param("record") WebLog record, @Param("example") WebLogExample example);

    int updateByPrimaryKeySelective(WebLog record);

    int updateByPrimaryKeyWithBLOBs(WebLog record);

    int updateByPrimaryKey(WebLog record);
}