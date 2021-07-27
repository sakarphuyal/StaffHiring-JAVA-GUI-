 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

public class INGNepal implements ActionListener{
    //Declaring the label, textfield and button of PartTimeStaff
    private JFrame frame;
    private JLabel lblTitle;
    private JLabel lblVacancyNumber;
    private JTextField txtVacancyNumber;
    private JLabel lblDesignation;
    private JTextField txtDesignation;
    private JLabel lblJobType;
    private JTextField txtJobType;
    private JLabel lblWorkingHour;
    private JTextField txtWorkingHour;
    private JLabel lblStaffName;
    private JTextField txtStaffName;
    private JLabel lblQualification;
    private JTextField txtQualification;
    private JLabel lblJoiningDate;
    private JTextField txtJoiningDate;
    private JLabel lblAppointedBy;
    private JTextField txtAppointedBy;
    private JLabel lblWorkingShifts;
    private JTextField txtWorkingShifts;
    private JLabel lblWagesPerHour;
    private JTextField txtWagesPerHour;
    private JLabel lblVacancyNumber1;
    private JTextField txtVacancyNumber1;
    private JButton btnAdd;
    private JButton btnAppoint;
    private JButton btnTerminate;
    private JButton btnClear;
    private JButton btnDisplay;
    
    //Declaring label , textfield and buttonfulltimeStaff
    private JLabel lblFullTitle;
    private JLabel lblFullVacancyNumber;
    private JTextField txtFullVacancyNumber;
    private JLabel lblFullDesignation;
    private JTextField txtFullDesignation;
    private JLabel lblFullJobType;
    private JTextField txtFullJobType;
    private JLabel lblFullSalary;
    private JTextField txtFullSalary;
    private JLabel lblFullWorkingHour;
    private JTextField txtFullWorkingHour;
    private JLabel lblFullStaffName;
    private JTextField txtFullStaffName;
    private JLabel lblFullJoiningDate;
    private JTextField txtFullJoiningDate;
    private JLabel lblFullQualification;
    private JTextField txtFullQualification;
    private JLabel lblFullAppointedBy;
    private JTextField txtFullAppointedBy;
    private JLabel lblFullWorkingShifts;
    private JTextField txtFullWorkingShifts;
    private JLabel lblFullWagesPerHour;
    private JTextField txtFullWagesPerHour;
    private JButton btnFullAdd;
    private JButton btnFullAppoint;
    private JLabel lblFullVacancyNumber1;
    private JTextField txtFullVacancyNumber1;
   
    
    private ArrayList<StaffHire> staffHireArrayList;
    
    
    public INGNepal(){
        JFrame frame = new JFrame("form");
        staffHireArrayList = new ArrayList<StaffHire>();
        //Initializating adding to frame and Giving set bound 
        lblTitle = new JLabel("PART TIME STAFFF");
        lblTitle.setBounds(250,10,150,30);
        frame.add(lblTitle);
        
        
        
        lblFullTitle = new JLabel("Full TIME STAFF");
        lblFullTitle.setBounds(850,10,150,30);
        frame.add(lblFullTitle);
        
        lblVacancyNumber = new JLabel("Vacancy Number:");
        lblVacancyNumber.setBounds(10,50,150,30);
        frame.add(lblVacancyNumber);
        
        
        txtVacancyNumber = new JTextField();
        txtVacancyNumber.setBounds(120,50,150,30);
        frame.add(txtVacancyNumber);
        
        lblDesignation = new JLabel("Designation:");
        lblDesignation.setBounds(350,50,150,30);
        frame.add(lblDesignation);
        
        
        txtDesignation = new JTextField();
        txtDesignation.setBounds(450,50,150,30);
        frame.add(txtDesignation);
        
        
        lblJobType = new JLabel("JobType:");
        lblJobType.setBounds(10,110,150,30);
        frame.add(lblJobType);
        
        
        txtJobType = new JTextField();
        txtJobType.setBounds(120,110,150,30);
        frame.add(txtJobType);
        
        
        
        lblWorkingHour = new JLabel("Working Hour:");
        lblWorkingHour.setBounds(10,170,150,30);
        frame.add(lblWorkingHour);
        
        
        txtWorkingHour = new JTextField();
        txtWorkingHour.setBounds(120,170,150,30);
        frame.add(txtWorkingHour);
        
        
        
        lblStaffName = new JLabel("Staff Name:");
        lblStaffName.setBounds(10,340,150,30);
        frame.add(lblStaffName);
        
        
        txtStaffName = new JTextField();
        txtStaffName.setBounds(110,340,150,30);
        frame.add(txtStaffName);
        
        
        lblJoiningDate = new JLabel("Joining Year:");
        lblJoiningDate.setBounds(350,340,150,30);
        frame.add(lblJoiningDate);
        
        
        txtJoiningDate = new JTextField();
        txtJoiningDate.setBounds(430,340,150,30);
        frame.add(txtJoiningDate);
        
        
        lblQualification = new JLabel("Qualification:");
        lblQualification.setBounds(350,290,150,30);
        frame.add(lblQualification);
        
        
        txtQualification = new JTextField();
        txtQualification.setBounds(430,290,150,30);
        frame.add(txtQualification);
        
        lblAppointedBy = new JLabel("Appointed By:");
        lblAppointedBy.setBounds(10,400,150,30);
        frame.add(lblAppointedBy);
        
        
        txtAppointedBy = new JTextField();
        txtAppointedBy.setBounds(110,400,150,30);
        frame.add(txtAppointedBy);
        
        
        lblWorkingShifts = new JLabel("Working Shifts:");
        lblWorkingShifts.setBounds(350,110,150,30);
        frame.add(lblWorkingShifts);
        
        
        txtWorkingShifts = new JTextField();
        txtWorkingShifts.setBounds(450,110,150,30);
        frame.add(txtWorkingShifts);
        
        lblWagesPerHour = new JLabel("Wages Per Hour:");
        lblWagesPerHour.setBounds(350,170,150,30);
        frame.add(lblWagesPerHour);
        
        
        txtWagesPerHour = new JTextField();
        txtWagesPerHour.setBounds(450,170,150,30);
        frame.add(txtWagesPerHour);
        
        lblVacancyNumber1 = new JLabel("Vacancy Number:");
        lblVacancyNumber1.setBounds(10,290,150,30);
        frame.add(lblVacancyNumber1);
        
        
        txtVacancyNumber1 = new JTextField();
        txtVacancyNumber1.setBounds(110,290,150,30);
        frame.add(txtVacancyNumber1);
        
        
        btnAdd=new JButton("ADD VACANCY");
        btnAdd.addActionListener(this);
        btnAdd.setBounds(250,230,150,30);
        frame.add(btnAdd);
        
        
        btnAppoint=new JButton("APPOINT");
        btnAppoint.addActionListener(this);
        btnAppoint.setBounds(150,450,150,30);
        frame.add(btnAppoint);
        
        btnTerminate=new JButton("TERMINATE");
        btnTerminate.addActionListener(this);
        btnTerminate.setBounds(310,450,150,30);
        frame.add(btnTerminate);
        
        btnClear=new JButton("CLEAR ");
        btnClear.addActionListener(this);
        btnClear.setBounds(450,500,300,30);
        frame.add(btnClear);
        
        btnDisplay=new JButton("DISPLAY");
        btnDisplay.addActionListener(this);
        btnDisplay.setBounds(450,550,300,30);
        frame.add(btnDisplay);
        
        lblFullVacancyNumber = new JLabel("Vacancy Number:");
        lblFullVacancyNumber.setBounds(650,50,150,30);
        frame.add(lblFullVacancyNumber);
        
        txtFullVacancyNumber = new JTextField();
        txtFullVacancyNumber.setBounds(760,50,150,30);
        frame.add(txtFullVacancyNumber);
        
        lblFullDesignation = new JLabel("Designation:");
        lblFullDesignation.setBounds(1000,50,150,30);
        frame.add(lblFullDesignation);
        
        txtFullDesignation = new JTextField();
        txtFullDesignation.setBounds(1100,50,150,30);
        frame.add(txtFullDesignation);
        
        lblFullJobType = new JLabel("JobType:");
        lblFullJobType.setBounds(650,100,150,30);
        frame.add(lblFullJobType);
        
        txtFullJobType = new JTextField();
        txtFullJobType.setBounds(760,100,150,30);
        frame.add(txtFullJobType);
        
        lblFullSalary = new JLabel("Salary:");
        lblFullSalary.setBounds(1000,100,150,30);
        frame.add(lblFullSalary);
        
        txtFullSalary = new JTextField();
        txtFullSalary.setBounds(1100,100,150,30);
        frame.add(txtFullSalary);
        
        lblFullWorkingHour = new JLabel("Working Hour:");
        lblFullWorkingHour.setBounds(650,150,150,30);
        frame.add(lblFullWorkingHour);
        
        txtFullWorkingHour = new JTextField();
        txtFullWorkingHour.setBounds(760,150,150,30);
        frame.add(txtFullWorkingHour);
        
        btnFullAdd = new JButton("ADD VACANCY");
        btnFullAdd.addActionListener(this);
        btnFullAdd.setBounds(880,230,150,30);
        frame.add(btnFullAdd);
        
        
        lblFullVacancyNumber1 = new JLabel("Vacancy Number:");
        lblFullVacancyNumber1.setBounds(650,280,150,30);
        frame.add(lblFullVacancyNumber1);
        
        txtFullVacancyNumber1 = new JTextField();
        txtFullVacancyNumber1.setBounds(760,280,150,30);
        frame.add(txtFullVacancyNumber1);
        
        
        lblFullStaffName = new JLabel("Staffname:");
        lblFullStaffName.setBounds(1000,280,150,30);
        frame.add(lblFullStaffName);
        
        txtFullStaffName = new JTextField();
        txtFullStaffName.setBounds(1100,280,150,30);
        frame.add(txtFullStaffName);
        
        lblFullJoiningDate = new JLabel("Joining Year:");
        lblFullJoiningDate.setBounds(650,330,150,30);
        frame.add(lblFullJoiningDate);
        
        txtFullJoiningDate = new JTextField();
        txtFullJoiningDate.setBounds(760,330,150,30);
        frame.add(txtFullJoiningDate);
        
        lblFullQualification = new JLabel("Qualification:");
        lblFullQualification.setBounds(1000,330,150,30);
        frame.add(lblFullQualification);
        
        txtFullQualification = new JTextField();
        txtFullQualification.setBounds(1100,330,150,30);
        frame.add(txtFullQualification);
        
        
        lblFullAppointedBy = new JLabel("AppointedBy:");
        lblFullAppointedBy.setBounds(650,380,150,30);
        frame.add(lblFullAppointedBy);
        
        txtFullAppointedBy = new JTextField();
        txtFullAppointedBy.setBounds(760,380,150,30);
        frame.add(txtFullAppointedBy);
        
        btnFullAppoint = new JButton("APPOINT");
        btnFullAppoint.addActionListener(this);
        btnFullAppoint.setBounds(900,450,150,30);
        frame.add(btnFullAppoint);
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1300,1300);
        frame.setVisible(true);
    }
    public static void main(String[]args){
        new INGNepal();
    } 
    //mutator methods for PartTimeStaffHire TextField
    // to get text from the textField
    
    public String getDesignation(){
        return txtDesignation.getText();
    }
    public String getJobType(){
        return txtJobType.getText();
    }
    public String getStaffName(){
        return txtStaffName.getText();
    }
    public String getAppointedBy(){
        return txtAppointedBy.getText();
    }
    public String getWorkingShifts(){
        return txtWorkingShifts.getText();
    }
    public String getVacancyNumber1(){
        int vacancyNumber1 = 0;
        try{
            vacancyNumber1 = Integer.parseInt(txtVacancyNumber1.getText());
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(frame,"Invalid Input Type for VacancyNumber !!!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return String.valueOf(vacancyNumber1);
    }
    public String getQualification(){
        return txtQualification.getText();
    }
    
    public int gettxtJoiningDate(){
        int joiningDate =0;
        try{
            joiningDate = Integer.parseInt(txtJoiningDate.getText());
        }
        catch(NumberFormatException exp){
            JOptionPane.showMessageDialog(frame,"Invalid Input Type for Joining date!!!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return joiningDate;
    }
    public int gettxtVacancyNumber(){
        int vacancyNumber = 0;
        try{
            vacancyNumber = Integer.parseInt(txtVacancyNumber.getText());
        }
        catch(NumberFormatException exep){
            JOptionPane.showMessageDialog(frame,"Invalid Input Type For Vacancy number","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return vacancyNumber; 
    }
    public int gettxtWorkingHour(){
        int workingHour = 0;
        try{
            workingHour = Integer.parseInt(txtWorkingHour.getText());
        }
        catch(NumberFormatException exep){
            JOptionPane.showMessageDialog(frame,"Invalid Input Type For Working hour","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return workingHour;
    }
    public int gettxtWagesPerHour(){
        int wagesPerHour = 0;
        try{
            wagesPerHour = Integer.parseInt(txtWagesPerHour.getText());
        }
        catch(NumberFormatException exep){
            JOptionPane.showMessageDialog(frame,"Invalid Input Type For Wages per hour","ERROR",JOptionPane.ERROR_MESSAGE);
        }     
        return wagesPerHour;
    }
    ////muator methods for FullTimeStaffHire
    // to get text from text field 
    public int gettxtFullVacancyNumber(){
        int fullVacancyNumber = 0;
        try{
            fullVacancyNumber = Integer.parseInt(txtFullVacancyNumber.getText());
        }
        catch(NumberFormatException exp){
            JOptionPane.showMessageDialog(frame,"Inavlid Input Type for Vacancy Number!!!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return fullVacancyNumber;
    }
    public int gettxtFullSalary(){
        int fullSalary =0;
        try{
            fullSalary = Integer.parseInt(txtFullSalary.getText());
        }
        catch(NumberFormatException exp){
            JOptionPane.showMessageDialog(frame,"Invalid Input Type for Salary!!!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return fullSalary;
    }
    public int gettxtFullJoiningDate(){
        int fullJoiningDate =0;
        try{
            fullJoiningDate = Integer.parseInt(txtFullJoiningDate.getText());
        }
        catch(NumberFormatException exp){
            JOptionPane.showMessageDialog(frame,"Invalid Input Type for joining date!!!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return fullJoiningDate;
    }
    public int gettxtFullWorkingHour(){
        int fullWorkingHour = 0;
        try{
                fullWorkingHour = Integer.parseInt(txtFullWorkingHour.getText());
        }
        catch(NumberFormatException exep){
                JOptionPane.showMessageDialog(frame,"Invalid Input type for workingHour!!!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return fullWorkingHour;    
    }
    public String getFullDesignation(){
        return txtFullDesignation.getText();
    }
    public String getFullJobType(){
        return txtFullJobType.getText();
    }
    public String getFullStaffName(){
        return txtFullStaffName.getText();
    }
    public String getFullQualification(){
        return txtFullQualification.getText();
    }
    public String getFullAppointedBy(){
        return txtFullAppointedBy.getText();
    }
    public int getFullVacancyNumber1(){
        int fullVacancyNumber1 = 0;
        try{
            fullVacancyNumber1 = Integer.parseInt(txtFullVacancyNumber1.getText());
        }
        catch(NumberFormatException exp){
            JOptionPane.showMessageDialog(frame,"Inavlid Input Type For Vacancy Number!!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return fullVacancyNumber1;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnFullAdd){//if btnFullAdd is clicked 
            //setting and initialization the instance variable
            int fullVacancyNumber = 0;
            int fullSalary = 0;
            int fullWorkingHour = 0;
            String fullDesignation = getFullDesignation();
            String fullJobType = getFullJobType();
            //if any variable IgnoreCase message dialog appers
            if(fullDesignation.equalsIgnoreCase("") || fullJobType.equalsIgnoreCase("") || txtFullVacancyNumber.getText().equalsIgnoreCase("") || txtFullWorkingHour.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(frame,"Fill all the required TextField","EMPTY TEXTFIELD",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //initializng the instance variable
                int fullTimeVacancyNumber = gettxtFullVacancyNumber();
                int fullTimeSalary = gettxtFullSalary();
                int fullTimeWorkingHour = gettxtFullWorkingHour();
                //condition satisfiees message box appers
                if(fullTimeVacancyNumber !=0 && fullTimeSalary !=0){
                    staffHireArrayList.add(new FullTimeStaffHire(fullTimeVacancyNumber,fullDesignation,fullJobType,fullSalary,fullWorkingHour));
                    JOptionPane.showMessageDialog(frame," Full times staff Added!!","SUCESS!!",JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
        if(e.getSource() == btnFullAppoint){//when button appoint is clicked perform following task
            //initialze and set the value for instance variable
            int fullVacancyNumber1  = 0;
            int c=0;
            
            String staffName = getFullStaffName();
            String qualification = getFullQualification();
            String appointedBy = getFullAppointedBy();
            //when variable ignorecase message box appers
            if(txtFullVacancyNumber1.getText().equalsIgnoreCase("") || txtFullJoiningDate.getText().equalsIgnoreCase("") || staffName.equalsIgnoreCase("") || qualification.equalsIgnoreCase("") || appointedBy.equalsIgnoreCase("") ){
                JOptionPane.showMessageDialog(frame,"Fill all the text field!!!!","EMPTY TEXTFIELD!!!",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //initializing 
                fullVacancyNumber1 = getFullVacancyNumber1();
            }
            if(fullVacancyNumber1 !=0){
                for(int a=0;a<staffHireArrayList.size();a++){
                    if(staffHireArrayList.get(a) instanceof FullTimeStaffHire){
                        FullTimeStaffHire fulltimestaff = (FullTimeStaffHire) staffHireArrayList.get(a);
                        boolean joined = fulltimestaff.getisjoined();
                        int Vacancy_Number = fulltimestaff.getvacancyNumber();
                        if(Vacancy_Number == fullVacancyNumber1){
                            if(joined){
                                JOptionPane.showMessageDialog(frame,"The staff is already appointed!!","WARNING",JOptionPane.WARNING_MESSAGE);
                                c=c+1;
                                break;
                            }
                            else{
                                String joiningDate = String.valueOf(gettxtFullJoiningDate());
                                fulltimestaff.FullTimeStaffHire(staffName,joiningDate,qualification,appointedBy);
                                JOptionPane.showMessageDialog(frame,"Fulltimestaff appointed succesfully!!","SUCESSFUL",JOptionPane.PLAIN_MESSAGE);
                                c=c+1;
                                break;
                            }
                       }
                    }
                }
                if(c==0){
                    JOptionPane.showMessageDialog(frame,"Invalid vacancy Number!!","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if(e.getSource() == btnAdd){
            //int vacancyNumber = 0;
            //int wagesPerHourbtn = 0;
            //int workingHourbtn = 0;
            
            String designation = getDesignation();
            String jobType = getJobType();
            String workingShifts =  getWorkingShifts();
            if(designation.equalsIgnoreCase("") || jobType.equalsIgnoreCase("") || txtVacancyNumber.getText().equalsIgnoreCase("") || txtWagesPerHour.getText().equalsIgnoreCase("") || txtWorkingHour.getText().equalsIgnoreCase("") || workingShifts.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(frame,"Fill all textField the form","EMPTY!!", JOptionPane.INFORMATION_MESSAGE);
             }
            else{
                int vacancyNumber = gettxtVacancyNumber();
                int workingHour = gettxtWorkingHour();
                int wagesPerHour = gettxtWagesPerHour();
                if(vacancyNumber !=0 && wagesPerHour !=0){
                    staffHireArrayList.add(new PartTimeStaffHire(vacancyNumber,designation,jobType,wagesPerHour,workingHour,workingShifts));
                    JOptionPane.showMessageDialog(frame," Part Time Staff Added!!","SUCESSFUL!!",JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
        if(e.getSource() == btnAppoint){
            int vacancyNumber1=0;
            int b=0 ;
            String staffName = getStaffName();
            String qualification = getQualification();
            String appointedBy = getAppointedBy();
           
            if(txtVacancyNumber1.getText().equalsIgnoreCase("") || staffName.equalsIgnoreCase("") || qualification.equalsIgnoreCase("") || appointedBy.equalsIgnoreCase("") || txtJoiningDate.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(frame,"Fill all the textField!!!!","EMPTY",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                vacancyNumber1 = Integer.parseInt(getVacancyNumber1());
                if(vacancyNumber1!=0){
                    for(int a=0;a<staffHireArrayList.size();a++){
                        if(staffHireArrayList.get(a) instanceof PartTimeStaffHire){
                            PartTimeStaffHire parttimeStaffHire = (PartTimeStaffHire) staffHireArrayList.get(a);
                            boolean joined = parttimeStaffHire.getisjoined();
                            int vcnyNumber = parttimeStaffHire.getvacancyNumber();
                            if(vcnyNumber == vacancyNumber1){
                                if(joined){
                                    JOptionPane.showMessageDialog(frame,"Following Staff is already appointed!!","WARNING",JOptionPane.WARNING_MESSAGE);
                                    b=b+1;
                                    break;
                                    }
                                else{
                                     String joiningDate = String.valueOf(gettxtJoiningDate());
                                     parttimeStaffHire.PartTimeStaff(staffName,joiningDate,qualification,appointedBy);
                                     JOptionPane.showMessageDialog(frame,"PartTimeStaff appointed!!!","SUCESS",JOptionPane.PLAIN_MESSAGE);
                                     b=b+1;
                                     break;
                                }
                            }     
                        }
                    }
                    if(b==0){
                            JOptionPane.showMessageDialog(frame,"The vacancy number is invalid!!","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        if(e.getSource() == btnTerminate){
            int vacancyNumber1 = 0;
            int c =0;
            vacancyNumber1=Integer.parseInt(getVacancyNumber1());
            if(vacancyNumber1 !=0){
                for(int a=0; a<staffHireArrayList.size();a++){
                    if(staffHireArrayList.get(a) instanceof PartTimeStaffHire){
                        PartTimeStaffHire parttimestaff =(PartTimeStaffHire) staffHireArrayList.get(a);
                        int vcNumber = parttimestaff.getvacancyNumber();
                        boolean terminated = parttimestaff.getisterminated();
                        if(vcNumber == vacancyNumber1){
                            if(terminated){
                                JOptionPane.showMessageDialog(frame,"The staff is already terminated!!!","WARNING",JOptionPane.WARNING_MESSAGE);
                                c += 1;
                                break;
                            }
                            else{
                                parttimestaff.staffTerminated();
                                JOptionPane.showMessageDialog(frame,"Staff termminated!!!","SUCESS!!!",JOptionPane.PLAIN_MESSAGE);
                                c += 1;
                                break;
                            }
                        }
                    }
                }
                if(c==0){
                    JOptionPane.showMessageDialog(frame,"There is no Vacancy with this VacancyNuber in partTimeStaff","WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        if(e.getSource()==btnClear){
            //setting all the text field as empty string
            txtVacancyNumber.setText("");
            txtDesignation.setText("");
            txtJobType.setText("");
            txtWorkingHour.setText("");
            txtStaffName.setText("");
            txtQualification.setText("");
            txtJoiningDate.setText("");
            txtAppointedBy.setText("");
            txtWorkingShifts.setText("");
            txtWagesPerHour.setText("");
            txtVacancyNumber1.setText("");
            txtFullVacancyNumber.setText("");
            txtFullVacancyNumber1.setText("");
            txtFullDesignation.setText("");
            txtFullJobType.setText("");
            txtFullSalary.setText("");
            txtFullWorkingHour.setText("");
            txtFullStaffName.setText("");
            txtFullJoiningDate.setText("");
            txtFullQualification.setText("");
            txtFullAppointedBy.setText("");
            txtFullWorkingShifts.setText("");           
        }
        if(e.getSource() == btnDisplay){
            for(int a=0;a<staffHireArrayList.size();a++){
                if(staffHireArrayList.get(a) instanceof FullTimeStaffHire){
                    //making object and calling the method of fulltimestaffhire
                    FullTimeStaffHire fTS =(FullTimeStaffHire) staffHireArrayList.get(a);
                    fTS.display();
                }
                else{
                    //making object and calling disppaly method of parttimestaffhire
                    PartTimeStaffHire pTS=(PartTimeStaffHire) staffHireArrayList.get(a);
                    pTS.display();
                }
            }
        }
    }
}
 