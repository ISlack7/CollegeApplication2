import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Gaining user's name
    Scanner scan = new Scanner(System.in);
    System.out.println("What's your name?");
    //gaining user's age
    String name = scan.next();
    System.out.println("How old are you?");
    int applicantsAge = scan.nextInt();
    //Finding out the user's GPA
    System.out.println("What is your current GPA?");
    double GPA = scan.nextDouble();
    

    if (applicantsAge >= 18 && GPA >= 4.0) {
      System.out.println("You are eligable to apply");
    }
    else {
      System.out.println("You are ineligable to apply");
      while (applicantsAge < 18){
        System.out.println("You are ineligable to apply try again next year.");
        applicantsAge++;
      }
    }

    //Finding out if the applicant has been suspended or expelled.
    System.out.println("Have you been suspended or expelled from high school?");
    String Behavior = scan.next();
    //Finding out how many suspensions
    System.out.println("How many times have you been suspended?");
    int Suspensions = scan.nextInt();

    if (Suspensions >= 2) {
      System.out.println("I'm sorry you are no longer eligable to apply");
    }
    else {
      System.out.println("Congrats on making it this far, one more question.");
      //finding out how many expulsions.
      System.out.println("How many times have you been expelled?");
      int Expulsions = scan.nextInt();
      if (Expulsions < 1) {
        System.out.println("Congragulations! You have been accepted into our school!");
      }
      else {
        System.out.println("I'm sorry you are no longer able to apply.");
    }
    }
    
  }
}