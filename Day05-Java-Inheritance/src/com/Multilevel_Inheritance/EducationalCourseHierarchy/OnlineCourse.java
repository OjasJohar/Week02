package com.Multilevel_Inheritance.EducationalCourseHierarchy;

class OnlineCourse extends Course {

    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        setPlatform(platform);
        setRecorded(isRecorded);
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    public void setRecorded(boolean isRecorded) {
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCoursedetails() {
        System.out.println("\n-----Online Course Details-----");
        System.out.println("Title       : " + courseName);
        System.out.println("Duration    : " + duration+ " months");
        System.out.println("Platform    : " + platform);
        System.out.println("Recorder    : " + isRecorded);
        System.out.println("-------------------------------");
    }
}

