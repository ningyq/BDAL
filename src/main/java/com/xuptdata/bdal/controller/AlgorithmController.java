package com.xuptdata.bdal.controller;

import com.github.pagehelper.PageInfo;
import com.xuptdata.bdal.entity.Algorithm;
import com.xuptdata.bdal.entity.Result;
import com.xuptdata.bdal.service.AlgorithmService;
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
    private AlgorithmService algorithmService;

    /**
     * 查询所有算法
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/all")
    public Result getAll(int pageNum, int pageSize){
        PageInfo pageInfo = algorithmService.getAll(pageNum, pageSize);
        return new Result("success", "查询成功", pageInfo);
    }

    /**
     * 查询某一个
     * @param id
     * @return
     */
    @GetMapping("/one")
    public Result getOne(Integer id){
        Algorithm algorithm = algorithmService.getOne(id);
        return new Result("success", "查询成功", algorithm);
    }

    /**
     * 根据标题查询
     * @param pageNum
     * @param pageSize
     * @param title
     * @return
     */
    @GetMapping("/title")
    public Result getTitle(int pageNum, int pageSize, String title){
        PageInfo pageInfo = algorithmService.getTitle(pageNum, pageSize, title);
        return new Result("success", "查询成功", pageInfo);
    }

    /**
     * 根据类别查询
     * @param pageNum
     * @param pageSize
     * @param classify
     * @return
     */
    @GetMapping("/classify")
    public Result getClassify(int pageNum, int pageSize, String classify){
        PageInfo pageInfo = algorithmService.getClassify(pageNum, pageSize, classify);
        return new Result("success", "查询成功", pageInfo);
    }


    /**
     *根据内容查询
     * @param pageNum
     * @param pageSize
     * @param context
     * @return
     */
    @GetMapping("/context")
    public Result getContext(int pageNum, int pageSize, String context){
        PageInfo pageInfo = algorithmService.getContext(pageNum, pageSize, context);
        return new Result("success", "查询成功", pageInfo);
    }

    /**
     * 增加数据
     * @param algorithm
     * @return
     */
    @PostMapping("/insert")
    public Result insert(Algorithm algorithm){
        int result = algorithmService.insert(algorithm);
        if (result == 0){
            return new Result("error", "增加失败");
        }
        return new Result("success", "增加成功");
    }


    /**
     * 更新数据
     * @param algorithm
     * @return
     */
    @PutMapping("/update")
    public Result update(Algorithm algorithm){
        int result = algorithmService.update(algorithm);
        if (result == 0){
            return new Result("error", "更新失败");
        }
        return new Result("success", "更新成功");
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @PutMapping("/delete")
    public Result delete(Integer id){
        int result = algorithmService.delete(id);
        if (result == 0){
            return new Result("error", "删除失败");
        }
        return new Result("success", "删除成功");
    }
}
