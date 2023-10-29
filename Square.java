import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter number:");
        int number= input.nextInt();
        for (int i=1;i<=number;i*=4){
            System.out.print(i+",");
        }
        System.out.println("");
        for (int j=1;j<=number;j*=5){
            System.out.print(j+",");
        }
    }
}
