import com.Kushnir.Factorial;

import java.util.Scanner;

import static com.Kushnir.Factorial.factorial;
import static com.Kushnir.Recursive.factorialRecursive;
import static com.Kushnir.Fibonacci.fib;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число (простий метод): ");
        int n = scanner.nextInt();
        System.out.print("Введіть число (рекурсія): ");
        int k = scanner.nextInt();
        System.out.print("Введіть число (фібоначі): ");
        int l = scanner.nextInt();

        int factorial = factorial(n);
        int factorialRecursive = factorialRecursive(k);
        int fib = fib(l);
        System.out.println("Факторіал числа " + n + " = " + factorial);
        System.out.println("Факторіал числа " + k + " (рекурсія)" + " = " + factorialRecursive);
        System.out.println("Число Фібоначі " + l +  " = " + fib);
    }
}
