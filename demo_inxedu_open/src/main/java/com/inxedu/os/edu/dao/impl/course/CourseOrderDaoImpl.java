package com.inxedu.os.edu.dao.impl.course;

import com.inxedu.os.common.dao.GenericDaoImpl;
import com.inxedu.os.edu.dao.course.CourseOrderDao;
import com.inxedu.os.edu.entity.course.CourseOrder;
import org.springframework.stereotype.Repository;
import java.util.Map;


 @Repository("courseOrderDao")
public class CourseOrderDaoImpl extends GenericDaoImpl implements CourseOrderDao {



	 @Override
	 public void createCourseOrder(CourseOrder co) {
		 this.insert("CourseOrderMapper.createCourseOrder",co);
	 }

	 @Override
	 public void deleteCourseOrderById(int id) {
		 this.delete("CourseOrderMapper.deleteCourseOrderById", id);
	 }

	 @Override
	 public int checkOrder(Map<String, Object> map) {
		 return this.selectOne("CourseOrderMapper.checkOrder", map);
	 }

	 @Override
	 public void updateOrderCourse(CourseOrder co) {
		this.update("CourseOrderMapper.checkOrder",co);
	 }
 }
