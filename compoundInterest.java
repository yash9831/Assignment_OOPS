import java.util.*;
class compoundInterest
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double p,r,t,ci,a;
System.out.println("Enter Principle, rate and time respectively.");
p = sc.nextDouble();
r = sc.nextDouble();
t = sc.nextDouble();
a = p * Math.pow((1+r),t);
ci = a-p;
System.out.println("Compount Interest is "+ci);
}
}
