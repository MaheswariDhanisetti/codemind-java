import java.util.*;
public class profit{
public static void main(String[] args)
{
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(b%a==0) System.out.println("YES");
    else if(b>=2*a) System.out.println("YES");
    else System.out.println("NO");
    
    
    }
}
}