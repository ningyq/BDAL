package com.xuptdata.bdal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuptdata.bdal.entity.Algorithm;
import com.xuptdata.bdal.mapper.AlgorithmMapper;
import com.xuptdata.bdal.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: slicing
 * @Date: 2019/4/25 19:30
 */
@Service
public class AlgorithmServiceImpl implements AlgorithmService {
    @Autowired
    private AlgorithmMapper algorithmMapper;

    @Override
    public PageInfo getAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Algorithm> ret = algorithmMapper.selectList();
        PageInfo pageInfo = new PageInfo(ret);
        return pageInfo;
    }

    @Override
    public PageInfo getTitle(int pageNum, int pageSize, String title) {
        PageHelper.startPage(pageNum, pageSize);
        List<Algorithm> ret = algorithmMapper.selectByTitle(title);
        PageInfo pageInfo = new PageInfo(ret);
        return pageInfo;
    }

    @Override
    public PageInfo getClassify(int pageNum, int pageSize, String classify) {
        PageHelper.startPage(pageNum, pageSize);
        List<Algorithm> ret = algorithmMapper.selectByClassify(classify);
        PageInfo pageInfo = new PageInfo(ret);
        return pageInfo;
    }

    @Override
    public int insert(Algorithm algorithm) {
        return  algorithmMapper.insertSelective(algorithm);
    }

    @Override
    public int delete(Integer id) {
        return algorithmMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Algorithm getOne(Integer id) {
        return algorithmMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Algorithm algorithm) {
        return algorithmMapper.updateByPrimaryKeySelective(algorithm);
    }
}
