package day1;

public class operators {
    /**
     * @param args
     */
    public static void main(String[] args){
    int a=1,b=2;
    a =a+b;

    System.out.println(a);
    
    /*using a for loop print sum of all numbers 1-25 */
    /*1,3,6,10,15,21 */
int sum=0 ;
for (int i=1;i<=25;i++) {
    sum=sum+i;
}
    System.out.println("Sum of 1 to 25 is:"+sum);


    }
}

