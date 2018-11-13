package com.idress.service;

import com.idress.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public void test01(){
        System.out.println("牛逼");
    }

    public Student test02(Student student){
        System.out.println(student.toString());
        student.setName("执行test02");
        return student;
    }

} 