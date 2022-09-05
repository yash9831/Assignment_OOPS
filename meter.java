import java.util.*;
class meter
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter distance in centimeters.");
int m = sc.nextInt();
System.out.println("Distance in meters is "+(m/100));
}
}