
public class ProfileClass {
    
    private static String StudentNo;
    private static String welcomeText;
    private static String FirstName;
    private static String lastName;
    private static String emailAdress;
    

    public static String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String email) {
        this.emailAdress = email;
    }
    

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        ProfileClass.lastName = lastName;
    }
 
    public static String getFirstName() {
        return FirstName;
    }

    public static void setFirstName(String FirstName) {
        ProfileClass.FirstName = FirstName;
    }

    public static String getWelcomeText() {
        return welcomeText;
    }

    public static void setWelcomeText(String Welcome) {
        welcomeText = Welcome;
    }
   
    public void setStudentNo(String StudentNo) {
        this.StudentNo = StudentNo;
    }
    public String getStudentNo() {
        return StudentNo;
    }
    
}
