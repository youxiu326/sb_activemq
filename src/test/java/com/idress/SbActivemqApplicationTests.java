package com.idress;

import com.idress.entity.Student;
import com.idress.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbActivemqApplicationTests {

	@Autowired
	private StudentService service;

	@Test
	public void test01() {

		service.test01();
	}

	@Test
	public void test02() {
		Student stu = new Student();
		stu.setName("哈哈哈哈");
		service.test02(stu);
	}

}
