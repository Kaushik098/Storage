import java.util.*;
public class ArraySrt{
     public statis void main (String Args[]){
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
               a[i]=sc.nextInt();
          Arrays.sort(a);

          for(int i=0;i<n;i++)
              System.out.print(a[i]+" ");

    }
}
