package com.xuptdata.bdal.service.impl;

import com.xuptdata.bdal.entity.Classify;
import com.xuptdata.bdal.mapper.ClassifyMapper;
import com.xuptdata.bdal.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: slicing
 * @Date: 2019/5/6 11:22
 */
@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    private ClassifyMapper classifyMapper;

    @Override
    public List<Classify> getAll() {
        return classifyMapper.selectAll();
    }

    @Override
    public Classify getOne(Integer id) {
        return classifyMapper.selectByPrimaryKey(id);
    }

    @Override
    public Classify getByValue(String value) {
        return classifyMapper.selectByValue(value);
    }

    @Override
    public int insert(Classify classify) {
        classify.setUrl("/classify/" + classify.getValue());
        return classifyMapper.insertSelective(classify);
    }

    @Override
    public int delete(Classify  classify) {
        return classifyMapper.delete(classify);
    }

    @Override
    public int update(Classify classify) {
        return classifyMapper.updateByPrimaryKeySelective(classify);
    }
}
