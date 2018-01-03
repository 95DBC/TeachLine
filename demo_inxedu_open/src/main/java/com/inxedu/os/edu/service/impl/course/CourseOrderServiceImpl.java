package com.inxedu.os.edu.service.impl.course;

import com.inxedu.os.edu.dao.course.CourseOrderDao;
import com.inxedu.os.edu.entity.course.CourseOrder;
import com.inxedu.os.edu.service.course.CourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service("courseOrderService")
public class CourseOrderServiceImpl implements CourseOrderService {

    @Autowired
    private CourseOrderDao courseOrderDao;
    @Override
    public void createCourseOrder(CourseOrder co) {
        courseOrderDao.createCourseOrder(co);
    }

    @Override
    public void deleteCourseOrderById(int id) {
        courseOrderDao.deleteCourseOrderById(id);
    }

    @Override
    public boolean checkOrder(int userId, int courseId) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userId", userId);
        map.put("courseId", courseId);
        int count = courseOrderDao.checkOrder(map);
        if(count>0){
            return true;
        }
        return false;

    }


    @Override
    public void updateOrderCourse(CourseOrder co) {
        courseOrderDao.updateOrderCourse(co);
    }
}
