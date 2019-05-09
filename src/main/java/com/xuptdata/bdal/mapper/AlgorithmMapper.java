package com.xuptdata.bdal.mapper;

import com.xuptdata.bdal.entity.Algorithm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AlgorithmMapper {
    @Select("select * from algorithm")
    List<Algorithm> selectList();

    @Select("select * from algorithm where title like concat('%', #{title}, '%')")
    List<Algorithm> selectByTitle(String title);

    @Select("select * from algorithm where classify like concat('%', #{classify}, '%')")
    List<Algorithm> selectByClassify(String classify);

    @Select("select * from algorithm where context like concat('%', #{context},'%')")
    List<Algorithm> selectByContext(String context);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Algorithm record);

    Algorithm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Algorithm record);


}