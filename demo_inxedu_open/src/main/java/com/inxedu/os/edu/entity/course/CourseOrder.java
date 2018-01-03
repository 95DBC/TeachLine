package com.inxedu.os.edu.entity.course;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class CourseOrder implements Serializable {
    private static final long serialVersionUID = 5055812991457774890L;
    private int orderId;
    private int courseId;
    private int userId;
    private int  orderState;
    private Date addTime;
}
