import java.util.Scanner;
// now lets debug it for more understanding....
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        var num1= sc.nextInt();
        var num2= sc.nextInt();

        var orgNum1 = num1 ;
        var orgNum2 = num2 ;

        while(num1 % num2 !=0){
            var remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        var gcd = num2 ;
        var lcm =(num1 * num2)/ gcd ;
        // remember we used to use this formula during school days for lcm.

        System.out.println(gcd);
        System.out.println(lcm);
    }
}