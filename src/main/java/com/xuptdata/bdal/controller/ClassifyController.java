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
@RequestMapping("/classify")
public class ClassifyController {
    @Autowired
    private ClassifyService classifyService;

    @GetMapping("/list")
    public Result getAll(){
        List<Classify> classifies = classifyService.getAll();
        return new Result("success","查询成功",classifies);
    }

    @GetMapping("/id")
    public Result getOne(Integer id){
        Classify classify = classifyService.getOne(id);
        return new Result("success","查询成功",classify);
    }

    @GetMapping("/value")
    public Result getByValue(String value){
        Classify classify = classifyService.getByValue(value);
        return new Result("success","查询成功",classify);
    }

    @PostMapping("/insert")
    public Result insert(Classify classify){
        int result = classifyService.insert(classify);
        if (result == 0){
            return new Result("error", "增加失败");
        }
        return new Result("success", "增加成功");
    }

    @PutMapping("/update")
    public Result update(Classify classify){
        int result = classifyService.update(classify);
        if (result == 0){
            return new Result("error", "更新失败");
        }
        return new Result("success", "更新成功");
    }

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
