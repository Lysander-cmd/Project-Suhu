
package suhu;

import java.util.Scanner;


public class Suhu {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, F, K, R, b;
        
        System.out.println("<<<<<< Konverensi Suhu Celcius >>>>>>");
        System.out.print(" Inputkan Angka yang akan dikonverensi :");
        a = input.nextInt();
        F = a*9/5+32;
        K = a+273;
        R = a*4/5;
        String[] Suhu = {"Fahrenheit","Kelvin","Reamur"};
      
      for(int i = 0;i < Suhu.length;i++){
          System.out.println(i+"."+Suhu[i]);
      }
      System.out.println("Tentukan pilihanmu :");
      b = input.nextInt();
      switch (b){
          case 0 :
              System.out.print("Fahrenheit => Celcius : "+F+"C");
                System.out.print("\n");
                break;
            case 1:
                System.out.print("Kelvin => Celcius : "+K+"C");
                System.out.print("\n");
                break;
            case 2:
                System.out.print("Reamur => Celcius : "+R+"C");
                System.out.print("\n");
                break;
             default:
                System.out.println("erorr");
                System.out.print("\n");
                break; 
      }
    }
    
}
