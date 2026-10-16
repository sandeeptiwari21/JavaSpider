public class print{
    //print forword direction
   static void forworddirection(int arr[]) {
      System.out.println("print in forword direction:");
        for (int i=0; i< arr.length;i++) {
            System.out.print( arr[i]+" ");
        }
        System.out.println();
   }
  //Print backword direction
  static void backwordDirection(int arr[]) {
    System.out.println("Backword direction:");
      for(int i=arr.length-1; i>=0; i--) {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
  }
  //print all the data except first one last one
  static void printData(int arr[]) {
    System.out.println("print the element except first and last one =");
    for(int i =1 ; i<arr.length-1;i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();


  }
  //all the data except first2 and last 2
  static void exceptData(int arr[]) {
    System.out.println("print the data except first2 and last 2");
    for(int i=2; i<arr.length-2; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  //first half of array element
  static void firsthalf(int arr[]) {
    System.out.println("first half of array:");
    for (int i=0; i<(arr.length)/2;i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  //print second half
  static void secondHalf(int arr[]) {
      System.out.println("Print Second Half");
      for(int i= arr.length/2; i<arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
  }
  //Sum of all array elements
 static int sum(int n[]) {
    int sum =0;
    for(int i: n) {
      sum=sum+i;
    }
    return sum;
 }
  //product of all array elements
 static int prod(int n[]) {
  int prod=1;
  for(int i:n) {
    prod=prod*i;
  }
   return prod;
 }
  //Print only odd numbers
  static void oddNumber(int arr[]) {
    System.out.println("print odd number");
    for(int i : arr){
      if(i%2!=0){
        System.out.print(i);
      }
    }
  }
  //print all even number
  static void evenNumber(int arr[]) {
    System.out.println("print the even number");
    for(int i:arr) {
        if(i%2==0) {
            System.out.print(i+" ");
        }
    }
  }
}