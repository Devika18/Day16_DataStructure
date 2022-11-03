/* Customize Message Demonstration using String Function and RegEx
a. Desc -> Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system.
your contact number is 91-xxxxxxxxxx.
Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
Use Regex to replace name, full name, Mobile#, and Date with proper value.
b. I/P -> read in the Message
c. Logic -> Use Regex to do the following
i. Replace <<name>> by first name of the user ( assume you are the user)
ii. replace <<full name>> by user full name.
iii. replace any occurance of mobile number that should be in format 91-xxxxxxxxxx by your contact number.
iv. replace any date in the format XX/XX/XXXX by current date.
d. O/P -> Print the Modified Message.
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomizedMessage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CustomizedMessage messageRegex = new CustomizedMessage();
        String fullname,num;

        System.out.println("Enter FullName");
        fullname=scanner.nextLine();
        System.out.println("Enter Mobile Number");
        num=scanner.next();

        messageRegex.message(fullname, num);
        scanner.close();
    }
    public static void message(String fullname, String mobile) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String firstName = fullname.substring(0, fullname.indexOf(' '));
        String str = "Hello <<name>>, We have your full name\r\n"
                + "as <<fullname>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\r\n"
                + "know in case of any clarification Thank you BridgeLabz Date.";
        String str1 = str.replaceAll("<<name>>", firstName);
        String str2 = str1.replaceAll("<<fullname>>", fullname);
        String str3 = str2.replaceAll("xxxxxxxxxx", mobile);
        String str4 = str3.replaceAll("Date", dateFormat.format(date));

        System.out.println(str4);
    }
}
