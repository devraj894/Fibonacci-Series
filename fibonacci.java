import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
        int num, a = 0, b = 0, c = 1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of times : ");
        num = sc.nextInt();

        for(int i=0; i<=num; i++){
            a = b;
            b = c;
            c = a+b;

            System.out.println(a + " ");
        }
    }
}
