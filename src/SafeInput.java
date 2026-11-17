import java.util.Scanner;

public class SafeInput
{
    public static int getRangedInt(Scanner console, String prompt, int low, int high)
    {
        int value;
        boolean done = false;

        do
        {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");

            if(console.hasNextInt())
            {
                value = console.nextInt();
                console.nextLine();

                if(value >= low && value <= high)
                {
                    return value;
                }
                else
                {
                    System.out.println("You must enter a value between " + low + " and " + high);
                }
            }
            else
            {
                System.out.println("Invalid input. Enter an integer.");
                console.nextLine();
            }

        } while(!done);

        return 0;
    }

    public static boolean getYNConfirm(Scanner console, String prompt)
    {
        String response;

        do
        {
            System.out.print(prompt + " [Y/N]: ");
            response = console.nextLine().trim().toUpperCase();

            if(response.equals("Y"))
            {
                return true;
            }
            else if(response.equals("N"))
            {
                return false;
            }
            else
            {
                System.out.println("Please enter Y or N.");
            }

        } while(true);
    }
}
