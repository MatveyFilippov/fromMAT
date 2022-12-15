import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> massiv = new ArrayList<>();
        System.out.println("Считываю элементы до слова quit");
         do{
             double input = Double.parseDouble(in.nextLine());
             massiv.add(input);
        }while (!in.hasNext("quit"));
        System.out.print("Исходный массив: ");
        for (double elements : massiv)
            System.out.print(elements + " ");
        System.out.println();
        System.out.print("Массив после обработки: ");
        double summachisel = 0;
        for (int i = 0; i < massiv.size(); i++) {
            summachisel = summachisel + massiv.get(i);
            double result = summachisel/(i+1);
            System.out.print(result + " ");
        }
        in.close();
    }
}