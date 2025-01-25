package com.Multilevel_Inheritance.EducationalCourseHierarchy;

class Course {

    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        setDuration(duration);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 12) {
            this.duration = 12;
        } else if (duration < 1) {
            this.duration = 1;
        } else {
            this.duration = duration;
        }
    }

    public void displayCoursedetails() {
        System.out.println("\n-----Course Details-----");
        System.out.println("Title       : " + courseName);
        System.out.println("Duration    : " + duration+ " months");
        System.out.println("------------------------");
    }
}
