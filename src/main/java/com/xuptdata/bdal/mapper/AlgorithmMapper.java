package com.xuptdata.bdal.mapper;

import com.xuptdata.bdal.entity.Algorithm;

public interface AlgorithmMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Algorithm record);

    Algorithm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Algorithm record);
}