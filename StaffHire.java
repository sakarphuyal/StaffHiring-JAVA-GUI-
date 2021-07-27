public class StaffHire{    //public class where progran starts
    /* declare the instance variable 
     *    where attributes are private
     */
    private int vacancyNumber;        
    private String designation;   
    private String jobType; 
    StaffHire(int vacancyNumber, String designation, String jobType){//this constructor passes the parameter
        this.vacancyNumber=vacancyNumber;// set instance variable for vacancyNumber
        this.designation=designation;//set instance variable for the designation
        this.jobType=jobType;//set instance variable for jobType
    }
    void setvacancyNumber(int vacancyNumber){//method to set the vacancyNumber as string type
        this.vacancyNumber=vacancyNumber;//instance varaiable
    }
    
    void setdesignation(String designation){//method to set the designation as String type
        this.designation=designation;//instance varaiable
    }
    
    void setjobType(String jobType){//method to set the jobType as string type
        this.jobType=jobType;//instance varaible
    }
    
    int getvacancyNumber(){//method to get the value from private
        return vacancyNumber;//returns the value that is extracted by get method to the jobType
    }
    String getdesignation(){// method to get the value from private
        return designation;// returns the value that is extracted by get method to the designation
    }
    String getjobType(){// method to get the value from private
        return jobType;// returns the value that is extracted by get method to the jobType
    }
    void display(){//method to display 
        System.out.println("Job Type for staffhire is" +getjobType());//prints the statement
        System.out.println("The Vacancy number is" +getvacancyNumber());//prints the statement
        System.out.println("The Designation for staffhire is " +getdesignation()+"\n");//prints the statement
        
    }
    
    
}
