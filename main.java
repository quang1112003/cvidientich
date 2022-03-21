package chuvi;
import java.util.Scanner;
public class main {
    public static void main(String args[]){
        tamgiac tg = new tamgiac();
        Scanner sc = new Scanner(System.in);
        tg.a = sc.nextInt();
        tg.b = sc.nextInt();
        tg.c = sc.nextInt();
        System.out.println("chu vi"+ tg.chuvi());
        System.out.println("diện tích" +tg.dientich());
    }
}
