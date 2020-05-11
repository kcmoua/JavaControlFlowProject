public class AsciiChars {
  public static void printNumbers() {   // print ASCII numbers and their decimal values
    for(int i=48;i<=57;i++) {
      System.out.println("The ASCII value of " + (char)i + " is " + i);
    }
  }

  public static void printLowerCase() {   // print ASCII lower case alphabet and their decimal values
    for(int i=97;i<=122;i++) {
      System.out.println("The ASCII value of " + (char)i + " is " + i);
    }
  }

  public static void printUpperCase() {   // print ASCII upper case alphabet and their decimal values
    for(int i=65;i<=90;i++) {
      System.out.println("The ASCII value of " + (char)i + " is " + i);
    }
  }
}