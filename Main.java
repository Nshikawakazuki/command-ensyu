import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
 
       
        System.out.print("身長:");
        double height = stdIn.nextDouble(); 
        System.out.print("体重:");
        double weight = stdIn.nextDouble(); 
        double bmi = weight / Math.pow(height, 2);
     
     
        System.out.println("BMI値:"+(Math.floor(bmi*100)/100));
      }
    }

