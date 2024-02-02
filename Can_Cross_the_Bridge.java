import java.util.*;
public class profit{
public static void main(String[] args)
{
    
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    z=z-y;
    int ans= z/x;
    System.out.println(ans);
   
}
}