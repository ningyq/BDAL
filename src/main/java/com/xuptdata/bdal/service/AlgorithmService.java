package com.xuptdata.bdal.service;

import com.github.pagehelper.PageInfo;
import com.xuptdata.bdal.entity.Algorithm;

/**
 * @Author: slicing
 * @Date: 2019/4/25 19:28
 */
public interface AlgorithmService {
    PageInfo getAll(int pageNum, int pageSize);

    PageInfo getTitle(int pageNum, int pageSize, String title);

    PageInfo getClassify(int pageNum, int pageSize, String classify);

    int insert(Algorithm algorithm);

    int delete(Integer id);

    Algorithm getOne(Integer id);

    int update(Algorithm algorithm);
}
