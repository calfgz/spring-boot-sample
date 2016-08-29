package org.springboot.sample.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.sample.entity.Student;
import org.springboot.sample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public List<Student> getList() {
		List<Student> list = studentService.getListByJdbcTemplate();
		return list;
	}
	
	@RequestMapping("/likeName")
    public List<Student> likeName(@RequestParam String name){
        return studentService.likeName(name);
    }

}
