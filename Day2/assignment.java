public class assignment {
    
    public static void main(String[] args) {
        //q1 square box 5*5
        //int n= 5;
        //for(int i=1;i<=n;i++){
          //    for(int j=1;j<=n;j++)
            //       System.out.print("* ");
              //  System.out.println();

        //q2 pattern from 1-5 stars increasing downwards
        //int n=5;
        //for(int i=1; i<=5;i++)
        //{
        //    for(int j=1;j<=i;j++)
        //    {
        //        System.out.print("*");
        //    }
        //    System.out.println();
        //}

        //q3 pattern from 5-1 stars decreasing downwards
        //int n=5;
        //for(int i=1; i<=5;i++)
        //{
        //    for(int j=5;j>=i;j--)
        //    {
        //       System.out.print("*");
        //    }
        //    System.out.println();


        //q4 increasing from 1-5 from left to right

        //int n=5;
        //for(int i=1; i<=n; i++)
        //{ 
        //    for(int j=1; j<=(n-i); j++) 
        //    {
        //        System.out.print(" ");
        //    }
        //for(int k=1; k<=i; k++)
        //{    
        //System.out.print("*");
        //}
        //System.out.println();
        //}


        //q5 decreasing 5-1 from left to right
        //int n=6;
        //for(int i=1; i<=n; i++)
        //{
        //    for(int j=1; j<=i; j++)
        //    {
        //        System.out.print(" ");
        //    }
        //for(int k=1;k<=(n-i);k++){
        //    System.out.print("*");
        //}
        //System.out.println();
        //}

        //q6
        /*int n=6;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("  ");
                System.out.print(" ");
            }
        for(int k=1;k<=(n-i);k++){
            System.out.print("*");
        }
        System.out.println( );
    }*/
           

        //q7


        //q9
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=(n-1);j>=i;j--){
                System.out.print("  ");
            }
            for(int k= 1;k<=i;k++){
                System.out.print(" *");
            }
            for(int l=2;l<=i;l++){
                System.out.print(" *");
            }
            System.out.println();

        }


        //q10
        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j= 1;j<n;j++){
                System.out.print("*");
            }
            for(int k=1;k<=n;k--){
                System.out.print("*");
            }System.out.println();

        }*/

        //q11
        //int n=5;
        //for(int i=1; i<=n; i++)
        //{ 
        //    for(int j=1; j<=(n-i); j++) 
        //    {
        //        System.out.print(" ");
        //    }
        //for(int k=1; k<=i; k++)
        //{    
        //System.out.print(" *");
        //}
        //System.out.println();
        //}
        //OR
        //for(int i=1; i<=n; i++)
        //{ 
        //    for(int j=1; j<=(n-i); j++) 
        //    { if(j>i)
        //      {System.out.print(" ");
        //    }
        //      else{
        //      System.out.print(" *")
        //     }
        //  }
        //System.out.println();
        //}

}
}

