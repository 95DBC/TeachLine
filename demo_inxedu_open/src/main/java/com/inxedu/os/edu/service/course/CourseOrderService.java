package com.inxedu.os.edu.service.course;

import com.inxedu.os.edu.entity.course.CourseOrder;

import java.util.Map;


/**
 * 课程订单管理接口
 *
 */
public interface CourseOrderService {
	/**
	 * 添加课程订单
	 * @param co
	 */
	public void createCourseOrder(CourseOrder co);

	/**
	 * 删除课程订单
	 * @param id
	 *
	 */
	public void deleteCourseOrderById(int id);

	/**
	 * 检测用户是否买过
	 *
	 * @return int
	 */
	public boolean checkOrder(int userId,int courseId);

	/**
	 * 修改订单
	 * @param co 用户ID
	 *
	 * @return CourseOrder
	 */
	public void updateOrderCourse(CourseOrder co);
    
    
}