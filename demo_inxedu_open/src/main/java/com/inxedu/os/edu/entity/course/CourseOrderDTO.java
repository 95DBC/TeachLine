package com.inxedu.os.edu.entity.course;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Data
@EqualsAndHashCode(callSuper = false)
public class CourseOrderDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String courseName; // 课程名字
	private int courseId; // 课程id
	private int userId;//用户id
	private int orderId; //订单id
	private int orderState;//订单状态
	private Date addTime;//订单创建时间时间

}
