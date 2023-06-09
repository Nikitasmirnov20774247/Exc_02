public class Ds_03
{
    public static void main(String[] args)
    {
        task_3();
    }
    
    public static void task_3()
    {
        try
        {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, null);
            int[] abc = {1, 2};
            abc[3] = 9;
        }
        catch (NullPointerException ex)
        {
            System.out.println("Указатель не может указывать на null!");
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Деление на 0: " + e);
        }
        catch (Throwable ex)
        {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws NullPointerException
    {
        System.out.println(a + b);
    }
}