package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLenth = 10;
    private String companySuffix = "anycompany.com";
    
// Constructor to recieve first and last name 
       public Email(String firstName, String lastName) {
    	   this.firstName = firstName;
    	   this.lastName = lastName;
        //   System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
           
           //Method to setDepartment 
           this.department = setDepartment();
         //  System.out.println("\nDepartment: " + this.department);
          
           //Generate Random password
           this.password=randomPassword(defaultPasswordLenth);
           System.out.println("\nyour password is: " + this.password);
           //Generate Email
           email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
          // System.out.println("Yout email is: " + email);
       }
       
// ask for department 
     private String setDepartment() {
    	 System.out.print("\nNew Worker "+ firstName + " " + lastName + "\n\nEnter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department Code:  ");
    	 Scanner in = new Scanner(System.in);
    	 int depChoice = in.nextInt();
    	 if(depChoice ==1) { return "sales";}
    	 else if (depChoice ==2) {return "dev";}
    	 else if (depChoice == 3) {return "acct";}
    	 else { return "";}
    	 
     }
//Generate a random password
    public String randomPassword(int length) {
    	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&";
    	char[] password = new char[length];
    	for(int i = 0 ; i < length; i++) {
    		int rand = (int) (Math.random() * passwordSet.length());
    		password[i] = passwordSet.charAt(rand);
    		//System.out.println(rand);
    		//System.out.println(passwordSet.charAt(rand));
    	}
    	return new String(password);
    }
    // set mailbox capacity 
    public void setMailBoxCapacity(int capacity) {
    	this.mailBoxCapacity = capacity;
    }
    
    //set alternate email
    public void setAlternateEmail(String altEmail) {
    	this.alternateEmail = altEmail;
    }
    //change password
    public void changePassword(String password) {
    	this.password = password;
    }
    public int getMailBoxCapacity() {return mailBoxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}
    
    public String showInfo() {
    	return "Display Name: " + firstName +" " +lastName +
               "\nCompany Email: " + email +
    		   "\nMailbox Capacity: " + mailBoxCapacity + "mb";
    }
}



