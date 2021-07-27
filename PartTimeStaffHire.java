 public class PartTimeStaffHire extends StaffHire{// Public class where program starts
     /* declaration of the instance varaiable
      * where all the varaiable are private
      */
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean isjoined;
    private boolean isterminated;
    
    PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts){//constructor to pass the parameter
        super(vacancyNumber,designation,jobType);//calls from super classes
        this.workingHour=workingHour;// instance variable
        this.wagesPerHour=wagesPerHour;// instance variable
        this.shifts=shifts;// instance variable
        staffName="";//set empty String
        joiningDate="";//set empty String
        qualification="";// sets empty String
        appointedBy="";// set empty String
        isjoined=false;//set the empty string
        isterminated=false;
    }
    /* method to get the value from the private string 
     * returning the value to the varaiable extracted by getter 
     */ 
    int getworkingHour(){
        return workingHour;
    }
    int getwagesPerHour(){
        return wagesPerHour;
    }
    String getstaffName(){
        return staffName;
    }
    String getqualification(){
        return qualification;
    }
    String getappointedBy(){
        return appointedBy;
    }
    String getshifts(){
        return shifts;
    }
    String getjoiningDate(){
        return joiningDate;
    }
    boolean getisjoined(){
        return isjoined;
    }
    boolean getisterminated(){
        return isterminated;
    }
    void setshifts(String shifts){//method to set shifts as String type
        /* using if-else statement to check the joined status
         * if joined is false pass instance variable
         * else print the shifts is already fixed
         */
        if(isjoined==false){
            this.shifts=shifts;
        }
        else{
            System.out.print("The shifts is already fixed");
        }
    }
    /* method to pass the parameter and check the appointment status
     * if the staff hasnt joined set some instance variable
     * else print staff is alredy hired
     */
    void PartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if(appointedBy.length()>=0){
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            isjoined=true;
            isterminated=false;
        }
        else{
            System.out.println(staffName+ "is already appointed on the date" +joiningDate);
        }
    }
    /*method using if-else
     * if terminated is true print ""
     * else set string as empty String joined as False and terminated as false
     */
    void staffTerminated(){
        if(isterminated==true){
            System.out.println("The staff is already terminated");
        }
        else{
            staffName="";
            joiningDate="";
            qualification="";
            appointedBy="";
            isjoined=false;
            isterminated=true;
        }
    }
    void dispaly(){//dispaly method
        super.display();// calls display method from super class
        if(isjoined==true){// using if ststement if joined is true print the following statement
            System.out.println("Name of a Staff is" +getstaffName());
            System.out.println("The Wages per hour is " +getwagesPerHour());
            System.out.println("Working hour is" +getworkingHour());
            System.out.println("Joined date is" +getjoiningDate());
            System.out.println("The qualification of the staff is" +getqualification());
            System.out.println(getstaffName()+ "is appointed by" +getappointedBy());
            int incomePerDay=wagesPerHour * workingHour;
            System.out.println("The income per day of the part time staff is" +incomePerDay+"\n");
        }
    }
}