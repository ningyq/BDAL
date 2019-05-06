package com.xuptdata.bdal.service;

import com.xuptdata.bdal.entity.Classify;

import java.util.List;

/**
 * @Author: slicing
 * @Date: 2019/5/6 11:20
 */
public interface ClassifyService {
    List<Classify> getAll();

    Classify getOne(Integer id);

    Classify getByValue(String value);

    int insert(Classify classify);

    int delete(Classify classify);

    int update(Classify classify);
}
