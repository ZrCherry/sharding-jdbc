package com.cherry.service;

import com.cherry.po.Teacher;

import java.util.List;

/**
 * Created by zhangruijs on 2019/12/20
 */
public interface TeacherService {
    List<Teacher> get(List<Long> list);

    void add(Teacher teacher);

    void update(Long id, String sex, String name);

    Teacher selectById(Long id);

    void delete(Long id);
}
