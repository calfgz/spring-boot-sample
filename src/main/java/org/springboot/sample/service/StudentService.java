package org.springboot.sample.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springboot.sample.entity.Student;
import org.springboot.sample.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service
public class StudentService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private StudentMapper studentMapper;
	
	public List<Student> getList() {
		return studentMapper.selectAll();
	}
    public List<Student> likeName(String name){
    	PageHelper.startPage(1, 1);
        return studentMapper.likeName(name);
    }
	
	public List<Student> getListByJdbcTemplate() {
		String sql = "SELECT id, name, sum_score, avg_score, age FROM student";
		return jdbcTemplate.query(sql, new RowMapper<Student> (){

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setSumScore(rs.getString("sum_score"));
				student.setAvgScore(rs.getString("avg_score"));
				student.setAge(rs.getInt("age"));
				return student;
			}
			
		});
	}
}
