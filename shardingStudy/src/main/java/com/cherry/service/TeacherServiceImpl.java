package com.cherry.service;

import com.cherry.dao.TeacherMapper;
import com.cherry.po.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangruijs on 2019/12/20
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> get(List<Long> list) {
        List<Teacher> l = teacherMapper.selectByIds(list);
        System.out.println(l);
        return l;
    }

    @Override
    public void add(Teacher teacher) {
        teacherMapper.insert(teacher);
    }

    @Override
    public void update(Long id, String sex, String name) {
        teacherMapper.update(id,sex,name);
    }

    @Override
    public Teacher selectById(Long id) {
        return teacherMapper.selectById(id);
    }

    @Override
    public void delete(Long id) {
        teacherMapper.delete(id);
    }
}
