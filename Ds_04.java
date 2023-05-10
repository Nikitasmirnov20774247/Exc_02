import java.util.Scanner;

public class Ds_04
{
    public static void main(String[] args)
    {
        task_4();
    }

    public static void task_4()
    {
        System.out.println("Введите строку (на английском): ");
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();

        try
        {
            if (str.isEmpty())
            {
                iScanner.close();
                throw new RuntimeException("!! Пустые строки вводить нельзя !!");
            }
            iScanner.close();
            System.out.println("Вы ввели строку: " + str);
        }
        catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}