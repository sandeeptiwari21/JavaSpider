public class array1{
    //print value present in even index
    static void evenindex(int n[]) {
        for(int i =0; i<n.length; i++) {
            if(i % 2 == 0) {
                System.out.print(n[i]+" ");
            }
        }
        System.out.println();
    }
    //print value present in odd index
    static void oddIndex(int n []) {
        for(int i = 0;  i<n.length;i++) {
            if(i%2 != 0) {
                System.out.print(n[i]+" ");
            }
        }
        System.out.println();
    }
    //print the avg of all even number
    static void avgEven(int n[]) {
        int sum = 0;
        int count =0;
        for(int i = 0; i<n.length; i++) {
              if(n[i] %2 ==0) {
                    count++;
                    sum = sum+n[i];
              }
        }
        float avg = sum/count;
        System.out.println(avg);
    }
    //print the avg of positive two digit numbers
     static void  twoDigitAvg(int n[]) {
        int sum = 0;
        int count =0;
        for(int i = 0; i< n.length; i++) {
           if(n[i] > 9 && n[i] <100  && n[i] % 2 ==0) {
                count++;
                sum = sum+n[i];
           }
        }
        float avg = sum/count;
        System.out.println(avg);
     }

     //print the avg of positive two digit odd number
     static void twoDigitOdd(int n[]) {
         int sum = 0;
         int count = 0;
         for(int i=0; i<n.length; i++) {
            if(n[i] > 9 && n[i]<100 && n[i]% 2 != 0) {
                  count++;
                  sum =sum+n[i];
            }
         }
          if(count > 0){
         float avg = (float)sum/count;
         System.out.println(avg);} else {System.out.println("number not found in array");}
     }
     //Transfer all the data from one array to another array
     static void transfer(int n[]) {
        int a[] = new int[n.length];
        for(int i=0; i<n.length; i++) {
            a[i] = n[i];
        }
        System.out.println("print copy aaray");
        for (int i =0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
     }
     //print positive two digit even number present in odd index
     static void checkNumber(int n[]) {
        System.out.println("positive two digit even number present in odd index");
         for(int i =0; i<n.length; i++) {
            if(n[i] > 9 && n[i] < 100 && n[i] % 2 == 0 && i % 2 !=0){
                System.out.print(n[i]+" ");
            }
         }
         System.out.println();
     }
     //print positive two digit odd number present index multiple of 3
     static void oddIndex3(int n[]) {
        System.out.println("positive two digit odd number present index multiple of 3");
        for (int i =0; i<n.length; i++) {
            if(n[i] > 9 && n[i] < 100 && n[i]%2 != 0 && i%3 ==0){
                System.out.print(n[i]+" ");
            }
        }
        System.out.println();
     }
     //print sum avg prod of even number present in odd index multiple of 3
     static void calculateAll(int n[]) {
        System.out.println("print sum avg prod of even number in odd index");
        int sum=0;
        int prod =1;
        int count = 0;
        for(int i = 0; i<n.length; i++) {
            if(n[i] %2 ==0 && i %2 !=0 && i %3 ==0) {
                  sum=sum+n[i];
                  System.out.println(sum);
                  prod= prod* n[i];
                  System.out.println(prod);
                  count++;
            }
        }
        float avg = sum/count;
        System.out.println(avg);
     }
     // transfer all even number from one array to another array
     static void trasferEvenNo(int n[]) {
        int a[] = new int[n.length];
        int j=0;
        for(int i=0; i<n.length;i++) {
            if(n[i] %2 ==0) {
                a[j] = n[i];
                j++;
            }
        }
        System.out.println("copy array of even number");
        for(int i=0; i<j; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
     }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,12,20,22,23};
        array1.evenindex(arr);
        array1.oddIndex(arr);
        array1.avgEven(arr);
        array1.twoDigitAvg(arr);
        array1.twoDigitOdd(arr);
        array1.transfer(arr);
        array1.checkNumber(arr);
        array1.oddIndex3(arr);
        array1.calculateAll(arr);
        array1.trasferEvenNo(arr);
    }
}