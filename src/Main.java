import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số bạn muốn đổi ");
        int num = scanner.nextInt();
        BinarSystem(num);
    }
    public static void BinarSystem(int num){
        Stack stack = new Stack<>();
            if (num>=0){
                while (num != 0){
                    stack.push(num%2);
                    num = num/2;
                }
                while (!stack.isEmpty()){
                    System.out.print(stack.pop()+ " ");
                }
            }else {
                System.out.println("nhập số nguyên dương ");
            }


        }
}