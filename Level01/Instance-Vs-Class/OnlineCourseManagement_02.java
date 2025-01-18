public class OnlineCourseManagement_02{
	
	public static void main(String[] args){
		
		//Calling methods:
		Course course1=new Course("JAVA", "3 Weeks", 5000, "TIT");
		course1.displayCourseDetails();
		Course course2=new Course("C++", "2 Weeks", 3500, "RGPV");
		course2.displayCourseDetails();
		
		Course.updateInstituteName();
		
		//Calling methods after update:
		course1.displayCourseDetails();
		course2.displayCourseDetails();
	}
}
//Creating Course class
class Course{
	//Instance Variables: 
	String courseName, duration;
    int	fee;
	//Class Variable:
    static String instituteName;
	
	//Constructor
	Course(String courseName, String duration, int fee, String instituteName){
		this.courseName=courseName;
		this.duration=duration;
		this.fee=fee;
		Course.instituteName=instituteName;
	}

    //Instance method
    public void displayCourseDetails(){
		System.out.println("------Course Details-----");
		System.out.println("Course Name : "+courseName);
		System.out.println("Duration    : "+duration);
		System.out.println("fees        : "+fee+" $");
		System.out.println("Institute   : "+instituteName);
		System.out.println("-------------------------");
	}

    //class method 
	public static void updateInstituteName(){
		System.out.println("-------------------------");
		instituteName="BRIDGELABZ";
		System.out.println("Modified the institute name :"+instituteName);
	}		
}
