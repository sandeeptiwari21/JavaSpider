public class array1{
    //print value present in even index
      static void evenIndex(int n[]) {
        System.out.println("print even index");
        for(int i = 0; i<n.length; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
         System.out.println();
      }
      //print  value present in odd index
      static void oddIndex(int n[]) {
        System.out.println("print odd index");
        for(int i =0; i<n.length; i++) {
            if(i%2 != 0) {
                System.out.print(i+" ");
            }   
        }
         System.out.println();
      }
    // print the avg of all even number
    static void evenAvg(int n[]) {
        int sum=0;
        int count = 0;
        for(int i = 0; i< n.length;i++) {
            if(n[i]%2 == 0) {
               count = count+1;
               sum = sum+n[i];
            }
        }
        int avg = sum/count;
        System.out.println("avg is:"+avg);
    }
    //print two positive digit even number present in odd index
     //print the avg of postivie two digit odd numbers
    static void twodigiteven(int n[]) {
        // pahle do digit positive number lenge uske baad even number check akrenege 
        //vo number odd index me chahiye
        //vo index ko 3 se modulo karenege to value 0 hona chahiye
        // value print karna hai
        for(int i = 0; i<n.length; i++) {
            if(n[i] > 9 && n[i]< 100  && n[i]%2 ==1) {
                System.out.print(n[i]+"");
            }
        }
        System.out.println();
    }
    //print positive two digit even number present in odd index
    static void evenNumber(int n[]) {
        for(int i = 0; i<n.length; i++) {
            if(n[i] > 9 && n[i] < 100 && n[i] % 2 == 0) {
                 if(i%2==1) {
                    System.out.println(n[i]);
                 }
            }
        }
    }
    //print value present in even index
    //print value present in odd index
    //print avg of all even number
    //print the avg of postivie two digit odd numbers
    //transfer all the data from one aaray to another array
   //PRINT Positive two digit even number present in odd index
   //print positive two digit odd number present index multiple of 3
   //print sum avg prod of even number present in odd index multiple of 3
   //transfer all array from one array to another array
   //take two array as input and merge them into another array
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        array1.evenIndex(arr);
        array1.oddIndex(arr);
        array1.evenAvg(arr);
        array1.twodigiteven(arr);
        array1.evenNumber(arr);
       
    }
}