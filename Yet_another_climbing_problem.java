import java.util.*;
public class profit{
public static void main(String[] args)
{
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
    int a=sc.nextInt();
    int b=sc.nextInt();
    int ans= a/b+(a%b);
    System.out.println(ans);
    
    
    }
}
}