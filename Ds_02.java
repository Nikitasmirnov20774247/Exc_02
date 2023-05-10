public class Ds_02
{
    public static void main(String[] args)
    {
        task_2(new int[] {1,2,3});
        // task_2(null);
    }

    public static void task_2(int[] intArray)
    {
        try
        {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
        catch (NullPointerException e)
        {
            System.out.println("Передан пустой объект: " + e);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Деление на 0: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Выход за пределы массива: " + e);
        }
    }
}