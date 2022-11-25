 import java.util.Scanner;
class factorialOfno
{

  public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

    System.out.println("enter your  number :");
    int number = sc.nextInt();

    System.out.print("Factors of " + number + " are: ");

    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}