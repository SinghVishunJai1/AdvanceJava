package GenericMethod;

public class GenricDemo {

    public static <T> void GenericMethod(T t) {
        System.out.println(t);
    }

    <T> void anotherGenricMethod(T t) {
        System.out.println(t + "Another");
    }

    public static void main(String[] args) {

        GenricDemo obj = new GenricDemo();
        obj.anotherGenricMethod("Hello from");

        GenericMethod(1);
        GenericMethod("Hello Everyone");

    }

    // finding 2nd number from sorted array using bubble sort

    // public static void swapElement(int[] arr, int j) {

    // int temp = arr[j];
    // arr[j] = arr[j+1];
    // arr[j+1] = temp;

    // }

    // public static void main(String[] args) {
    // int[] arr = { 6, 2, 3, 1, 9 };

    // int n = arr.length;

    // for (int i = 0; i <= n - 1; i++) {
    // boolean check = false;
    // for (int j = 0; j < n - 1 - i; j++) {
    // if (arr[j] > arr[j + 1]) {
    // check = true;

    // // inline swap
    // int temp = arr[j];
    // arr[j] = arr[j+1];
    // arr[j+1] = temp;

    // // swap funtion
    // // swapElement(arr,j);
    // }
    // }
    // if (check == false) {

    // break;

    // }
    // }

    // System.out.println("The third element in array is: ");
    // for (int i : arr) {

    // if(i==2){
    // System.out.println(i);
    // }
    // }

    // }

}