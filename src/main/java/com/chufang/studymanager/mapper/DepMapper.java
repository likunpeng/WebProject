package com.chufang.studymanager.mapper;

import com.chufang.studymanager.bean.Dep;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepMapper {
    /**
     * 查询部门表
     * @return
     */
    @Select("select * from dept")
    List<Dep> list();

    /**
     * 删除部门
     * @param id
     */
    @Delete("delete from dept where id = #{id}")
    void delete(Integer id);

    /**
     * 新增部门
     * @param dep
     */
    @Insert("insert into dept(name, create_time, update_time) values (#{name}, #{createTime}, #{updateTime})")
    void insert(Dep dep);
}
