package Day3;

public class Dsa_arrays {
   /* public static void main(String[] args) {
        char[] arr=new char[10];
        System.out.println(arr);
    }*/
    
        
    
    /*public static void displayArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {System.out.print(arr[i]+" ");
    }
    }
        public static void main(String[] args){
            int[] arr=new int[10];
            arr[1]=10;
            arr[6]=110;
            arr[9]=101;
            displayArray(arr);
        }*/

       /* 
        public static boolean checkPrime(int n) {
            for (int i=2;i<n;i++)
            if(n%i==0)
                return false;
            return true;
        }
        public static void main(String[] args) {
            int n=2001;
            System.out.println(checkPrime(n));
        }
*/

 public static int reverseInteger(int n){
    int temp=0;
    while(n!=0){
        temp=temp*10+n%10;
        n/=10;
    }
    return temp;
 }
 public static void main(String[] args) {
    int n=36912;
    System.out.println(reverseInteger(n));
 }
 }
            
    

