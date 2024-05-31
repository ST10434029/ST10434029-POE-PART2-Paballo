/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10434029.poe.part.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class Task_Class {

    private String TaskName;
    private String TaskDescription;
    private String DeveloperFirstName;
    private String DeveloperLastName;
    private String TaskID;
    private String TaskStatus = null;
    private int TaskNumber = -1 ;
    private int id = 0;
    private int TaskDuration = 0;
    private int TotalHours = 0;
    private int AccumulatedHours = 0;
   

    //Constructor class to fill the contents of the task
    //Constructor is for assignment only
    public Task_Class() {

        
       

    }

    //Generate Task ID  
    public String createTaskID(String taskName, String DeveloperFirstName, int taskNumber) {
        String IDname;
        String IDdeveloperFirstName;
        int IDtaskNumber;
        
        IDtaskNumber = TaskNumber;

        //Takes the first two character from the task name    
        IDname = taskName.substring(0, 2);

        //Code Attribution
        //This method was taken from Stack overflow
        //https://stackoverflow.com/questions/15253406/get-the-last-three-chars-from-any-string-java
        //Egor
        //https://stackoverflow.com/users/543539/egor
        IDdeveloperFirstName = DeveloperFirstName.substring(DeveloperFirstName.length() - 3);

        //Task ID is generated by combining IDname with a colon and then the task number followed by another colon and then taskDeveloper while converting bothto upper case
     return   TaskID = IDname.toUpperCase() + ":" + IDtaskNumber + ":" + IDdeveloperFirstName.toUpperCase();

    }
    
    public String TaskID(){
        
        return TaskID;
    }

    //Generate Task Number  
    public void TaskNumber() {
        TaskNumber++;
    }
   

    //Method to enable user to add a task
    public void AddTask() {


        String taskName = JOptionPane.showInputDialog("Enter Task Name: ");
        this.TaskName = taskName;
        
        TaskNumber();
        TaskDescription();
        DeveloperDetails();
        TaskDuration();
        createTaskID(TaskName, DeveloperFirstName, TaskNumber);
        TaskStatus();
        JOptionPane.showMessageDialog(null,  printTaskDetails(), "Task " + TaskNumber + " Details", 1);
        
        
            
        }
        
    
    public void TaskDescription(){
        //Prompt user to write a task description and then capture it
        String TSKDescription = JOptionPane.showInputDialog("Enter a description of the task (it should not exceed 50 characters): ");
        this.TaskDescription = TSKDescription;

        //Call method that will check the length of the description        
        int count = 0;
        while(count < 1){
            //checkTaskDescription(TSKDescription);
                if (checkTaskDescription(TSKDescription) != true){
                         TSKDescription = JOptionPane.showInputDialog("Enter a description of the task (it should not exceed 50 characters): ");
                         this.TaskDescription = TSKDescription; 
                }
                else{
                    count++;
                }
        
        }  
    }
        
    public void DeveloperDetails(){
        //Prompt user to add the details of the developer and then capture it
        String dvlpr_first_name = JOptionPane.showInputDialog("Enter developer first name: ");
        this.DeveloperFirstName = dvlpr_first_name;
        
        String dvlpr_last_name = JOptionPane.showInputDialog("Enter developer last name: ");
        this.DeveloperLastName = dvlpr_last_name;
    }
    
    public String TaskStatus(){
        String taskStatus = JOptionPane.showInputDialog("Enter the status of the task: " + "\n" + "1. To Do" + "\n" + "2. Doing" + "\n" + "3. Done");
   
        if (taskStatus.equals("1") ){
           this.TaskStatus = "To do";
           }
           else if(taskStatus.equals("2")){
            this.TaskStatus =  "Doing";
            }         
            else if (taskStatus.equals("3")){
            this.TaskStatus =  "Done";
            }
       return TaskStatus;
    }



    //Boolean method that checks the length of the variable stored in it and checks if it's less than 50 then returns true or false
    public boolean checkTaskDescription(String DescriptionLength) {
        DescriptionLength = TaskDescription;
        
            if (DescriptionLength.length() > 50) {
               JOptionPane.showMessageDialog(null, "Please ensure your description does not exceed 50 characters", "Invalid Description Length",1);
               return false;
            }   
            else { 
                JOptionPane.showMessageDialog(null, "Task succesfully captured.", "Add Task",1);   
            }
       
        return true;
    }

    //Method that prompts user to enter the estimated hours for the task
    public void TaskDuration() {
        String EstimatedHours = JOptionPane.showInputDialog("Enter the estimated hours for task: ");
        this.TaskDuration = Integer.parseInt(EstimatedHours);
        AccumulatedHours = AccumulatedHours + TaskDuration;
    }
    
     public int returnTotalHours() {
         return  TotalHours = TotalHours + AccumulatedHours;
    }
     
     public String printTaskDetails(){
        return    "Task Status: " + TaskStatus
                + "\nDeveloper Details: " + DeveloperFirstName + " " + DeveloperLastName
                + "\nTask Number: " + TaskNumber
                + "\nTask Name: " + TaskName 
                + "\nTask Description: " + TaskDescription
                + "\nTask ID: " + TaskID 
                + "\nTask Duration: " + TaskDuration + " hours";
         
     }

}
