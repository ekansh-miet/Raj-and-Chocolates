import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int avg=(int)Math.floor(sum/n);
        int ans1=0;
        int ans2=0;
        for(int i=0;i<n;i++){
            ans1+=Math.abs(a[i]-avg);
            ans2+=Math.abs(a[i]-(avg+1));
        }
        System.out.println(Math.min(ans1,ans2));
    }
}