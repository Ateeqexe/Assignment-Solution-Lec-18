//solution of Assignment ofg lec 16 arrays target sum problems
import java.util.*;
class solution{
    //Q1 to find the pair in increasing order array whose  absolutedifference is absolute x.
    void Answer1(int []arr,int x){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]==x||arr[i]-arr[j]==x){
                    System.out.println("YES");
                    break;
                }
            }
        }
        System.out.println("NO");
    }
    //Q2 to find the occurences of a given no. x in an array of size n.
    void Answer2(int []arr,int x){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                c++;
            }
        }
        System.out.println("given no. "+x+" occurs "+c+" times");
    }
    int Answer3(int arr[],int n){
            for(int j=1;j<=n;j++) {
                int c=0;
                for(int i=0;i<arr.length;i++) {
                    if(arr[i]>n)
                        continue;
                    if (j == arr[i]) {
                        c++;
                    }
                }
                    if(c==0) {
                        return j;
                    }
                }
        return -1;
        }
    }
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in sorted  in increasing order"); //for q1
        System.out.println("enter elements of array");//q2
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("enter the value of x");// for q2  and q1
        int x=sc.nextInt();
        solution obj =new solution();
         obj.Answer1(arr,x);
         obj.Answer2(arr,x);
        if(obj.Answer3(arr,n)==-1){
            System.out.println("nothing missing");
        }
        else
            System.out.println("missing is "+obj.Answer3(arr,n));
    }
}
