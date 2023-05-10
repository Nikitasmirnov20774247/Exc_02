import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ds_01
{
    public static void main(String[] args)
    {
        Float userFloat = task_1();
        System.out.println("Введеное число: " + userFloat);
    }

    public static Float task_1()
    {
        while (true)
        {
            System.out.println("Введите дробное число");
            try
            {
                Scanner iScanner = new Scanner(System.in);
                float input = iScanner.nextFloat();
                iScanner.close();
                return input;
            }
            catch (InputMismatchException e)
            {
                System.out.println("!! Вы ввели не число !!");
            }
            catch (NoSuchElementException e)
            {
                System.out.println("!! Ошибка сканера !!");
            }
        }
    }
}