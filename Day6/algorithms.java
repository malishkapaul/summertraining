package Day6;

public class algorithms {
    int[] a={36,19,29,12,4};
    int temp;
    int flag=0;{
    for(int i=0;i<a.length;i++){
        
        for(int j=0;j<a.length-1-i;j++){
            if(a[i]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=1;
            }

        }
        
        if (flag==0){
        break;
    }
    
}
}
}
