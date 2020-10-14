import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class Main {
  public static void main(String[] args) {
    //Gaining user's name
    Scanner scan = new Scanner(System.in);
    System.out.println("What's your name?");
    String name = scan.next();
    //Gaining User's age and determining eligibility based on age
    scan = new Scanner(System.in);
    System.out.println("How old are you?");
    int applicantsAge = scan.nextInt();
    if (applicantsAge >= 18) {
    System.out.println("You are eligable to apply");
    }
    else {
    System.out.println("You are youger than 18. You are ineligable to apply");
    while (applicantsAge < 18){
      System.out.println("Ages one through seventeen are ineligable to apply");
      break;
    }
    System.exit(1); 
    }
  
    //Finding out the user's School
    scan = new Scanner(System.in);
    System.out.println("Where did you go to high school?");
    String school = scan.next();
    scan = new Scanner(System.in);
    System.out.println("What is your current GPA?");
    double GPA = scan.nextDouble();
    if (GPA >= 4.0) {
      System.out.println("You are still eligable to apply");
    }
    else {
      System.out.println("I'm sorry you are now ineligable to apply");
      System.exit(2);
    }
    scan = new Scanner(System.in);
    System.out.println("Have you been suspended or expelled from high school?");
    String Behavior = scan.next();
    scan = new Scanner(System.in);
    System.out.println("How many times have you been suspended?");
    int Suspensions = scan.nextInt();
    if (Suspensions >= 2) {
      System.out.println("I'm sorry you are no longer eligable to apply");
      while(Suspensions >= 2){
        System.out.println("We do not accept students who have been suspended two or more times.");
        break;
      }
      System.exit(3);
    }
    else {
      System.out.println("Congrats on making it this far, one more question.");
    }
    System.out.println("Please answer the next question with a number only.");
    scan = new Scanner(System.in);
    System.out.println("How many times have you been expelled?");
    int Expulsions = scan.nextInt();
    if (Expulsions < 1) {
      System.out.println("Congragulations! You have been accepted into our school!");
    }
    else {
      System.out.println("I'm sorry you are no longer able to apply.");
      while(Expulsions >= 1){
      System.out.println("We do not accept students who have been expelled");
      break;
      }
     System.exit(4);
    }

  }
}