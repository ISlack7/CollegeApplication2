import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Gaining user's name
    Scanner scan = new Scanner(System.in);
    System.out.println("What's your name?");
    String name = scan.next();
    //Gaining User's age and determining eligibility based on age
    scan = new Scanner(System.in);
    System.out.println("How old are you?");
    int num = scan.nextInt();
    if (num >= 18) {
    System.out.println("You are eligable to apply");
    }
    else {
    System.out.println("You are youger than 18. You are ineligable to apply");
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
    }

  }
}