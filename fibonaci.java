import java.util.Scanner;
public class fibonaci {
    public static void main(String args[]){
        int n1=0;
        int n2=1;
        int n4;
        Scanner a =new Scanner(System.in);
        int n3 = a.nextInt();
        System.out.print(n1 +" " );
        System.out.print(n2 );
        for(int i=2;i<n3;i++){
            n4=n1+n2;
            System.out.print(" " + n4);
            n1=n2;
            n2=n4;
        }
    }
}