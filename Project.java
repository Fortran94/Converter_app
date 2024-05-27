import java.util.*;

public class Project{
  
  static final double ROUBLES_PER_DOLLAR = 72.12; //курс доллара
  
  public static void main(String[] args){
    
   
    int dollars; // сумма денег в американских долларах
    double roubles; // сумма денег в российских рублях
    int digit; // последняя цифра dollars
    String end; // окончание 
    int n; // количество конвертаций
    int i; // счетчик

    instract();
    Scanner scan = new Scanner(System.in);
    
    //получать корректное колличество конвертаций до тех пор,
    //пока не введено корректное значение 
    do{
      System.out.print("Введите корректное число конвертаций");
      n = scan.nextInt();
    }while(n <= 0);
    
    for(i = 0; i < n; ++i){
      System.out.println("Введите сумму в американских долларах");
      dollars = scan.nextInt();
      
      digit = dollars % 10;
      if(dollars >= 5 && digit <= 20){
        end = "американских долларов равны";
      }else if(digit == 1){
        end = "американский доллар равен";  
      }else if(digit >= 2 && digit <= 4){
        end = "американских доллара равны";
      }else if(digit >= 11 && digit <= 14){//to do 
        end = "американских доллара равны";
      }else{
        end = "американских долларов равны";
      }
      roubles = find_roubles(dollars);
      System.out.println(dollars + " " + end + " " + roubles + " рублей" );
    }  
    
  } 
  
  public static void instract(){
    System.out.println(" Укажите желаемое колличество конвертаций, а затем введите сумму в американских долларах");
  }
  
  public static double find_roubles(int dollars){
  return ROUBLES_PER_DOLLAR * dollars; 
  }
}