package GenericMethod;

public class DemoClass {
    public static void main(String[]  args){


        // to check prime for particular number

        // int n = 20;
        // boolean check = true;
        // for(int i =2; i<=n/2;i++){
        //     if(n%i == 0){
                
        //         check= false;
        //         break;
        //     }

        // }

        // if(check == false){
        //     System.out.println(n + " is not a Prime number");
        // }
        // else{
        //     System.out.println(n+ " is a Prime number");
        // }




        // printing prime number of particular index

        int count = 0;
        int secondElement = 0;
        for(int num = 2; num <=100; num++){
            boolean check= true;
            for(int i = 2; i<=num/2 ; i++){
                if (num % i == 0) {
                    check = false;
                    break;
                    
                }
            }

        if(count == 5){

            secondElement=num-1;
            break;
        }else if(check){
            count++;
            System.out.println(num);
         }
        }


        System.out.println("The Second Element is : "+secondElement);

       
        
        
}
}
