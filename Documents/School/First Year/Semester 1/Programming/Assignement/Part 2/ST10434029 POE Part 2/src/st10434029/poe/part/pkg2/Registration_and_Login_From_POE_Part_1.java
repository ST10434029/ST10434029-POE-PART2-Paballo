package st10434029.poe.part.pkg2;




import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mac
 */
public class Registration_and_Login_From_POE_Part_1 {
    private String firstName;
    private String lastName;
    private String UserName;
    private String Password;
    private String LoginUserName;
    private String LoginPassword;
    
    //Constructor to register new user
    public Registration_and_Login_From_POE_Part_1(){
        
      
    }
    
    public void Register(){
         String first_name = JOptionPane.showInputDialog("Enter student first name: ");  
        firstName = first_name;
        
        String last_name = JOptionPane.showInputDialog("Enter student last name: ");
        lastName = last_name;
        
        String Use_name = JOptionPane.showInputDialog("Create User Name" +  "\nPlease ensure your username is less that 5 characters and has an underscore: ");
        UserName = Use_name;

        String passWord = JOptionPane.showInputDialog("Create Password: ");
        Password = passWord;
        
        CheckUserName(UserName);    
        PasswordComplexity(Password);  
        registerUser(UserName, Password);
    }
    //Check Username 
    public static boolean CheckUserName(String isuseNameValid) {
        boolean isValid = false;
        if(isuseNameValid.length() <= 5 && isuseNameValid.contains("_")){
            isValid = true;
        }
        return isValid;
    }
    
    public static boolean PasswordComplexity(String isPasswordValid) {
        boolean isUpperCase = false;
        boolean isDigit = false;
        boolean isMatch = false;
        
        Pattern CheckPass = Pattern.compile("[a-zA-Z0-9]*");
        Matcher MatchPass = CheckPass.matcher(isPasswordValid);
       
        //Check if password contains a number, a capital letter, a special character and is above 8 characters
        
        for (int i=0; i < isPasswordValid.length(); i++){
           char ch =  isPasswordValid.charAt(i);
           
           if (isPasswordValid.length() >= 8) {
               
               if (Character.isDigit(ch)){
               isDigit = true;
               }
           
           else if (Character.isUpperCase(ch)){
               isUpperCase = true;
               }
           else if (!MatchPass.matches()){
               isMatch = true;
               }
               if(isUpperCase && isDigit && isMatch){ 
                   return true;  
               }
           }
           
        }      
       return false; 
       
//Code Attribution
//Line 61 & 62
//This method was taken from Stack overflow
//https://stackoverflow.com/questions/18057962/regex-pattern-including-all-special-characters
//Piotr Sagalara
//https://stackoverflow.com/users/1567911/piotr-sagalara
    } 
    //Check that username and password are valid and can be registered
    public static String registerUser(String username, String passWord){
    
         if (CheckUserName(username)){
           JOptionPane.showMessageDialog(null, "User name is successfully captured", "Check Username", 1);
           
       }
       else{

           JOptionPane.showMessageDialog(null, "User name is not correctly formatted. Please ensure your user name contains 5 or less characters and an underscore", "Check Username", 1);
         }
        
        if (PasswordComplexity(passWord)){
            JOptionPane.showMessageDialog(null, "Password is successfully captured", "Check Password", 1);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "\nPassword is not correctly formatted. Please ensure your password contains at least 8 characters, a capital letter, a number and a special character", "Check Password", 1);
        }
       return null;
    }
    
    //Verify that login details of match
    public void loginUser(){
        
        
        JOptionPane.showMessageDialog(null, "Please Login", "Login Page", 1);
        
        String loginUserName = JOptionPane.showInputDialog("Enter User name: ");
        
        LoginUserName = loginUserName; 
        
        String loginPassWord = JOptionPane.showInputDialog("Enter Password: ");
        LoginPassword = loginPassWord;
        
        
    }
    
    public boolean checkLogin(){
        boolean isLoggedin = false;
        if (UserName.equals(LoginUserName) && Password.equals(LoginPassword)){
            isLoggedin = true;
        }
        return isLoggedin;
        
    }
    
    //Show if login was successful or unsuccessful
    public String returnLoginStatus(){
        
        if(checkLogin()){
        return "Login Succesful!" +
                "\nWelcome " + firstName + " " + lastName + "! " +
                "\nIt is great to see you again!";
        }
        else{
            return "\nLogin has failed. Please enter the correct details.";
        }
    }

  
}
//Code Attribution
//Line 61 & 62
//This method was taken from Stack overflow
//https://stackoverflow.com/questions/18057962/regex-pattern-including-all-special-characters
//Piotr Sagalara
//https://stackoverflow.com/users/1567911/piotr-sagalara
    