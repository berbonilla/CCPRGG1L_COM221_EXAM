public class Students {
    String surname;
    String firstName;
    char middleInitial;
    String dateOfBirth;
    long studentNumber;
    String studentEmailAddress;
    boolean isAwesome;

    public void Values(){
        System.out.println("\nSurname: " + surname);
        System.out.println("\nFirstname: " + firstName);
        System.out.println("\nMiddle Initial: " + middleInitial);
        System.out.println("\nDate of Birth: " + dateOfBirth);
    }

    public void sayStudentNumber(){
        System.out.println("\nStudent Number: " + studentNumber);
    }

    public void sayMyemailAddress(){
        System.out.println("\nEmail Address: " + studentEmailAddress);
    }
    
    public void sayMyAwesomeness(){
        System.out.println("\nI am Awesome " + isAwesome + "\n");  
    }
    
    public Students(String lstName, String frstName, char midIn, String birthDate) {
        surname = lstName;
        firstName = frstName;
        middleInitial = midIn;
        dateOfBirth = birthDate;
    }
}
