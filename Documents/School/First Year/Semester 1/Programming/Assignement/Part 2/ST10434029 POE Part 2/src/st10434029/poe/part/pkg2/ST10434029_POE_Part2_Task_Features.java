/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10434029.poe.part.pkg2;

import javax.swing.JOptionPane;
import st10434029.poe.part.pkg2.Task_Class;


/**
 *
 * @author mac
 */
public class ST10434029_POE_Part2_Task_Features {
     public static int NumTasks;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Student user is prompted to register and then login
    Registration_and_Login_From_POE_Part_1 newRegister = new Registration_and_Login_From_POE_Part_1();
    newRegister.Register();
    newRegister.loginUser();
    JOptionPane.showMessageDialog(null, newRegister.returnLoginStatus(), "Login Status", 1);
    
    
    
    //When the student is confirmed to be logged in, part 2 begins and they can add tasks    
    if (newRegister.checkLogin() == true){
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban", "Welcome", 1);
        
        Task_Class obj = new Task_Class();
        //do loop to ensure user can still interact with the menu until they decide to quit
        int Quit = 0;
        do{
            String MenuOption = JOptionPane.showInputDialog("Please choose an option. Enter the number: " + "\n" + "1. Add Tasks" + "\n" + "2. Show Report" + "\n" + "3. Quit");
            
            //If the user selects option one they are prompted to add a task, a description and developer details through appropriate methods
            if (MenuOption.equals("1")) {
                String Tasks = JOptionPane.showInputDialog("How many tasks do you want to add?: ");
                NumTasks = Integer.parseInt(Tasks); 
                for (int n = 0; n < NumTasks; n++) {
                    obj.AddTask();   
                }
                //Calls method returnTotal hours which has stored and added all hours from the tasks together
                JOptionPane.showMessageDialog(null, "Total hour(s) for all tasks is: " + obj.returnTotalHours() + " hour(s)", "TotalHours", 1);
            }
                 
            //If user selects option 2 then the system will output
            else if (MenuOption.equals("2")) {
                JOptionPane.showMessageDialog(null,  "Coming soon!", "Coming Soon", 1);
                break;
                
            }
            
            //If user selects 3 then the program will break as they have quit
            else if (MenuOption.equals("3")) {
            Quit = Quit + 1;    
            } 
            
           
            
            //This will ensure that nothing entered besides "1", "2" or "3" will be accepted and will direct user to choose of those options
            else {
               JOptionPane.showMessageDialog(null,  "Invalid choice.", "Invalid Choice", 1);
               break;
            }                
        }
        while(Quit != 1); 
    }   
        
  }   
    
}
    
