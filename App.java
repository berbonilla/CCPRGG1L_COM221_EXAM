public class App {
    public static void main(String[] args) throws Exception {
    
    Students Me = new Students("Bonilla","Iber Joseph",'P',"03/27/2003");
    Me.Values();

    Me.studentEmailAddress = "bonilaip@student.national-u.edu.ph";
    Me.studentNumber = 2022102503;
    Me.isAwesome = true;

    Me.sayMyemailAddress();
    Me.sayStudentNumber();
    Me.sayMyAwesomeness();
    }
}
