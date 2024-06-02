import java.util.*;

public class Project{
  
  static final double ROUBLES_PER_DOLLAR = 72.12; //курс доллара
  
  public static void main(String[] args){
    
   
    int[] dollarsArray; // массив сумм денег в американских долларах
    double[] roublesArray; // массив сумм денег в российских рублях
    String end; // окончание 
    int n; // количество конвертаций
   

    instract();
    Scanner scan = new Scanner(System.in);
    
    //получать корректное колличество конвертаций до тех пор,
    //пока не введено корректное значение 
    do{
      System.out.print("Введите корректное число конвертаций");
      n = scan.nextInt();
    }while(n <= 0);
    
    
    System.out.println("Введите " + n +  " сумм в американских долларах через пробел ");
    dollarsArray = new int[n];
    
    for(int i = 0; i < n; i++){
      dollarsArray[i] = scan.nextInt();
    }
    
    roublesArray = find_roubles(dollarsArray, n);
    
    //отоброазить сумму денег в российских рублях
    System.out.println("\n   Сумма, $   Сумма, P");
    for(int i = 0; i<n; ++i){
       System.out.println("\t" + dollarsArray[i] + "\t" + (int)(roublesArray[i] * 100) / 100.0);
    }
    
  } 
  
  public static void instract(){
    System.out.println(" Укажите желаемое колличество конвертаций, а затем введите сумму в американских долларах");
  }
  
  public static double[] find_roubles(int[] dollarsArray, int n){
    double[] roublesArray = new double[n];
    int i;
    for(i=0; i<n; i++){
      roublesArray[i] = ROUBLES_PER_DOLLAR * dollarsArray[i];
    }
    return roublesArray;
  }
}
