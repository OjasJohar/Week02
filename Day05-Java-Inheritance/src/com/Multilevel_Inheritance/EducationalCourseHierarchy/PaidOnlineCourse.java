package com.Multilevel_Inheritance.EducationalCourseHierarchy;

class PaidOnlineCourse extends OnlineCourse {

    protected double fees;
    protected double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fees,
                            double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fees = fees;
        this.discount = discount;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void displayCoursedetails() {
        System.out.println("\n-----Paid Online Course Details-----");
        System.out.println("Title       : " + courseName);
        System.out.println("Duration    : " + duration+ " months");
        System.out.println("Platform    : " + platform);
        System.out.println("Recorder    : " + isRecorded);
        System.out.println("Recorder    : " + fees + "Rs");
        System.out.println("Recorder    : " + discount + "%");
        System.out.println("-------------------------------------");
    }
}

