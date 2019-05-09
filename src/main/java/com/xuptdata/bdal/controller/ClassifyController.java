package com.xuptdata.bdal.controller;

import com.xuptdata.bdal.entity.Classify;
import com.xuptdata.bdal.entity.Result;
import com.xuptdata.bdal.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: slicing
 * @Date: 2019/5/6 11:33
 */
@RestController
@RequestMapping("/api/classify")
public class ClassifyController {
    @Autowired
    private ClassifyService classifyService;

    /**
     * 查询全部
     * @return
     */
    @GetMapping("/all")
    public Result getAll(){
        List<Classify> classifies = classifyService.getAll();
        return new Result("success","查询成功",classifies);
    }

    /**
     * 根据编号查询
     * @param id
     * @return
     */
    @GetMapping("/id")
    public Result getOne(Integer id){
        Classify classify = classifyService.getOne(id);
        return new Result("success","查询成功",classify);
    }

    /**
     * 根据名称查询
     * @param value
     * @return
     */
    @GetMapping("/value")
    public Result getByValue(String value){
        Classify classify = classifyService.getByValue(value);
        return new Result("success","查询成功",classify);
    }

    /**
     * 插入数据
     * @param classify
     * @return
     */
    @PostMapping("/insert")
    public Result insert(Classify classify){
        int result = classifyService.insert(classify);
        if (result == 0){
            return new Result("error", "增加失败");
        }
        return new Result("success", "增加成功");
    }

    /**
     * 更新数据
     * @param classify
     * @return
     */
    @PutMapping("/update")
    public Result update(Classify classify){
        int result = classifyService.update(classify);
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
    public Result delete(int id){
        Classify classify = classifyService.getOne(id);
        int result = classifyService.delete(classify);
        if (result == 0){
            return new Result("error", "删除失败");
        }
        return new Result("success", "删除成功");
    }
}
