import java.util.*;
class Sum_float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float avg,s;
        System.out.println("enter the value of a:");
        a=sc.nextInt();
        System.out.println("enter the value of b:");
        b=sc.nextInt();
        System.out.println("enter the value of c:");
        c=sc.nextInt();
        s=a+b+c;
        System.out.printf("sum of %d,%d and %d is %.2f\n",a,b,c,s);
        avg=s/3;
        System.out.printf("avg of %d,%d and %d is %.2f\n",a,b,c,avg);
    }
}