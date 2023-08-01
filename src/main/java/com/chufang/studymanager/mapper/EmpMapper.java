package com.chufang.studymanager.mapper;

import com.chufang.studymanager.bean.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select count(*) from emp")
    public Long count();
//
//
//    @Select("select * from emp limit #{start}, #{pageSize}")
//    public List<Emp> page(Integer start, Integer pageSize);

//    @Select("select * from emp")
    public List<Emp> page(String name, Short gender, LocalDate begin, LocalDate end);

    /**
     * 批量删除员工
     * @param ids
     */
     void delete(List<Integer> ids);

    /**
     * 新增员工
     * @param emp
     */
     @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
             "values(#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime}) ")
    void insert(Emp emp);

     @Select("select * from emp where username = #{username} and password = #{password}")
    Emp getEmpByUserNameAndPassword(Emp emp);
}
