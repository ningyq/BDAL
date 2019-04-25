package com.xuptdata.bdal.controller;

import com.github.pagehelper.PageInfo;
import com.xuptdata.bdal.entity.Algorithm;
import com.xuptdata.bdal.entity.Result;
import com.xuptdata.bdal.service.impl.AlgorithmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: slicing
 * @Date: 2019/4/25 19:47
 */
@RestController
@RequestMapping("/algorithm")
public class AlgorithmController {
    @Autowired
    private AlgorithmServiceImpl algorithmService;

    /**
     * 查询所有算法
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/getAll")
    public Result getAll(int pageNum, int pageSize){
        PageInfo pageInfo = algorithmService.getAll(pageNum,pageSize);
        return new Result("success", "查询成功", pageInfo);
    }

    /**
     * 查询某一个
     * @param id
     * @return
     */
    @GetMapping("/getOne")
    public Result getOne(int id){
        Algorithm algorithm = algorithmService.getOne(id);
        return new Result("success","查询成功",algorithm);
    }

    /**
     * 根据标题查询
     * @param pageNum
     * @param pageSize
     * @param title
     * @return
     */
    @GetMapping("/getTitle")
    public Result getTitle(int pageNum, int pageSize,String title){
        PageInfo pageInfo = algorithmService.getTitle(pageNum,pageSize,title);
        return new Result("success", "查询成功", pageInfo);
    }

    /**
     * 根据类别查询
     * @param pageNum
     * @param pageSize
     * @param classify
     * @return
     */
    @GetMapping("/getClassify")
    public Result getClassify(int pageNum, int pageSize,String classify){
        PageInfo pageInfo = algorithmService.getTitle(pageNum,pageSize,classify);
        return new Result("success", "查询成功", pageInfo);
    }

    /**
     * 增加数据
     * @param algorithm
     * @return
     */
    @PostMapping("/insert")
    public Result insert(Algorithm algorithm){
        int ret = algorithmService.insert(algorithm);
        return new Result("success","增加成功",algorithm);
    }


    /**
     * 更新数据
     * @param algorithm
     * @return
     */
    @PutMapping("/update")
    public Result update(Algorithm algorithm){
        int ret = algorithmService.update(algorithm);
        return new Result("success","更新成功",algorithm);
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @PutMapping("/delete")
    public Result delete(int id){
        int ret = algorithmService.delete(id);
        return new Result("success","删除成功",ret);
    }





}
