public class FullTimeStaffHire extends StaffHire{///publis class where program starts
    /* declaration of private variable*/
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean isjoined;
    /*constructor where super class variable are called 
     * instance variable fopr salary and workingHour is passed
     * String are set as empty String
     */
    FullTimeStaffHire(int vacancyNumber, String designation, String jobType,int salary, int workingHour){
        super(vacancyNumber,designation,jobType);
        this.salary=salary;
        this.workingHour=workingHour;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        isjoined=false;
    } 
    
    void setsalary(int salary){//method declaration
        if (isjoined==false){//if statement if joined is false
            this.salary=salary;//instance varaiable
        }
        else{//else print the statement
            System.out.println("the staff" +staffName+" has alredy joined salary cannot be changed");  
        }
    }
    /* getter method
     * extracting the value 
     * returning the the value extracted by getter method
     */ 
    int getsalary(){
        return salary;
    }
    int getworkingHour(){
        return workingHour;
    }
    String getstaffName(){
        return staffName;
    }
    String getjoiningDate(){
        return joiningDate;
    }
    String getqualification(){
        return qualification;
    }
    String getappointedBy(){
        return appointedBy;
    }
    boolean getisjoined(){
        return isjoined;
    }
    void setworkingHour(int workingHour){//method declaration
        this.workingHour=workingHour;// instance variable
    }
    void FullTimeStaffHire(String staffName,String joiningDate,String qualification, String appointedBy){//method declaration and parameter passing
        /* using if else statement if not joined set a instance variable
         * else printing the joining date
         */
        if (!isjoined){ 
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.isjoined=true;
        }
        else{
            System.out.println(staffName+ "has alredy joined on the date" +joiningDate);
        }
    }
    void display(){//dispaly method declaration
        super.display();//calldisplay method from super class
        if(isjoined){//if joined then printing the statements
            System.out.println("The name is" +getstaffName());
            System.out.println("The salary is" +getsalary());
            System.out.println("The working hour per day is" +getworkingHour());
            System.out.println("The Joining Date of the staff is" +getjoiningDate());
            System.out.println("Qualification of a Staff is" +getqualification());
            System.out.println("Staff is appointed by "+getappointedBy()+"\n");
        }
   }
}