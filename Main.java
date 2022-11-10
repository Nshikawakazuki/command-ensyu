import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        for(int i=1;i<=2;i++){
       
        System.out.print(i+"人目の身長");
        double height = stdIn.nextDouble(); 
        System.out.print(i+"人目の体重:");
        double weight = stdIn.nextDouble(); 
        double bmi = weight / Math.pow(height, 2);
     
     
        System.out.println(i+"人目のBMI値:"+(Math.floor(bmi*100)/100));
	}
      }
    }

