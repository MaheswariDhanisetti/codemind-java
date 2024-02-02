import java.util.*;
public class profit{
public static void main(String[] args)
{
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int s=sc.nextInt();
    int b=sc.nextInt();
    int ans= (2*(b*512)*s*t)/1024;
    System.out.printf("%d KB",ans);
   
}
}