package GenericMethod;

public class SwapProgram {


  public static void main(String[] args) {

    SwapProgram  obj = new SwapProgram();

    int a =10;
    int b= 20;

    System.out.println("The value before swap : \n "+"a="+a+" "+"b="+b  );

    
    a= a+b;
    b= a-b;
    a=a-b;


    System.out.println("The value After swap : \n "+"a="+a+" "+"b="+b  );




      
  }

    
}
