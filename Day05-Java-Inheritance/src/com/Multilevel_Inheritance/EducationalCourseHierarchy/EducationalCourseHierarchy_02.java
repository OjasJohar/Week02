package com.Multilevel_Inheritance.EducationalCourseHierarchy;

public class EducationalCourseHierarchy_02 {
    public static void main(String[] args) {
        Course course =new Course("Learning Java",2);
        course.displayCoursedetails();

        OnlineCourse onlineCourse=new OnlineCourse(course.getCourseName(), course.getDuration(), "BridgeLabz", false);
        onlineCourse.displayCoursedetails();

        PaidOnlineCourse paidOnlineCourse=new PaidOnlineCourse(onlineCourse.getCourseName(), onlineCourse.getDuration(), onlineCourse.getPlatform(),
                onlineCourse.isRecorded(), 12500, 5);
        paidOnlineCourse.displayCoursedetails();
    }
}
