package emailApp;
import java.util.Scanner;
public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner in = new Scanner(System.in);   
		   System.out.print("Enter First Name: ");
           String fName = in.next();
		   
           System.out.print("Enter Last Name: ");
           String lName = in.next();
           
		   Email eml = new Email(fName, lName);
           System.out.print(eml.showInfo());
           
           System.out.print("\n\nEnter Alternate email: ");
           String altMail= in.next();
           eml.setAlternateEmail(altMail);
           System.out.print("Your Alternate email is:" + eml.getAlternateEmail());
           
           System.out.print("\nMenu\n"
           		+ " "
           		+ "1.Change Password\n"
           		+ "2.Change Mailboc Capacity\n"
           		+ "3.Change Alternate email\n"
           		+ "4.Exit"
           		+ "Enter Option:");
           
           int option = in.nextInt();
           switch (option) {
           case 1:
             System.out.println("Enter new Password");
             String newpassword = in.next();
             eml.changePassword(newpassword);
             //System.out.println(eml.getPassword());
             break;
           case 2:
        	   System.out.println("Current Cappacity " + eml.getMailBoxCapacity());
        	   System.out.println("Enter new Capacity in MB: ");
               int newCap = in.nextInt();
               eml.setMailBoxCapacity(newCap);
              // System.out.println(eml.getMailBoxCapacity());
             break;
           case 3:
               System.out.println("Enter new Alternate Email ");
               String altEMail = in.next();
               eml.setAlternateEmail(altEMail);
             break;
           case 4:
               System.exit(0);
               break;
           }
           System.out.print("\n"+eml.showInfo());
}
}