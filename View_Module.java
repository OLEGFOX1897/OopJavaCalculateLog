import java.util.Scanner;
/**
 * Класс с методами для ввода и вывода информации
 */
public class View_Module {
    Scanner inputNum= new Scanner(System.in);

    public double getValue (String outName){
        System.out.printf("%s", outName);
        return inputNum.nextDouble();
    }
    public int getInt (String outName){
        System.out.printf("%s", outName);
        return inputNum.nextInt();
    }

    public int getSign (String sign){
        System.out.printf("%s", sign);
        return inputNum.nextInt();
}
    public void printNum (String outName, double data){
        System.out.printf("%s %f\n", outName, data);
    }
}
