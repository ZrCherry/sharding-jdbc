package com.cherry.dao;

import com.cherry.po.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhangruijs on 2019/12/20
 */

@Mapper
public interface TeacherMapper {
    List<Teacher> selectByIds(List<Long> list);

    void insert(Teacher teacher);

    void update(Long id, String sex, String name);

    Teacher selectById(Long id);

    void delete(Long id);
}
