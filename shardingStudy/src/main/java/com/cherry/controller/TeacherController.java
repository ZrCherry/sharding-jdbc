package com.cherry.controller;

import com.cherry.po.Teacher;
import com.cherry.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhangruijs on 2019/12/20
 */

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/get/{id}")
    public Object get(@PathVariable String id){
        //分割url
        String[] str = id.split("=|,");
        List<Long> list = new ArrayList<>();//保存拆分的id数组
        for (int i=1;i<str.length;i++){
            list.add(Long.parseLong(str[i]));
        }
        List<Teacher> l = new ArrayList<>();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Teacher t = teacherService.selectById((Long)iterator.next());
            l.add(t);
            iterator.remove();
        }
        return l;
    }

    @RequestMapping("/add")
    public Object add(){
        for (int i=0;i<100;i++){
            Teacher teacher = new Teacher();
            teacher.setName("mafei");
            teacher.setSex("girl");
            teacherService.add(teacher);
        }
        return "success";
    }

    @RequestMapping("/update/{s}")
    public Object update(@PathVariable String s){
        String[] str = s.split(",");
        Long id = Long.parseLong(str[0]);
        String sex = str[1];
        String name = str[2];
        teacherService.update(id,sex,name);
        return "success";
    }

    @RequestMapping("/delete/{id}")
    public Object delete(@PathVariable Long id){
        teacherService.delete(id);
        return "success";
    }

}
