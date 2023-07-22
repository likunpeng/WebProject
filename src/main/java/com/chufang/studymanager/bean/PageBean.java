package com.chufang.studymanager.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    private long total;
    private List<Emp> list;
}
