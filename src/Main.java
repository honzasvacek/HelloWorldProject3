import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        Scanner scannerC = new Scanner(System.in);
        System.out.println("write 3 integers:");
        int a = scannerA.nextInt();
        int b = scannerB.nextInt();
        int c = scannerC.nextInt();
        int middle = 0;

        if(a>b){
            if(a<c){middle = a;}
            else if (b>c) {middle = b;}
            else middle = c;

        }
        else{
            if(a>c){middle = a;}
            else if(b<c){middle = b;}
            else middle = c;
        }
        System.out.println("The median is: " + middle);
    }
}