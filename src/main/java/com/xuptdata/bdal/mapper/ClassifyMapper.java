package com.xuptdata.bdal.mapper;

import com.xuptdata.bdal.entity.Algorithm;
import com.xuptdata.bdal.entity.Classify;
import com.xuptdata.bdal.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: slicing
 * @Date: 2019/5/6 11:10
 */
@Mapper
public interface ClassifyMapper extends BaseMapper<Classify> {

    @Select("select * from classify where value like concat('%', #{value}, '%')")
    Classify selectByValue(String title);
}
