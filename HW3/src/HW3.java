import java.util.Scanner;
public class HW3 {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the card number");
        String number = scan.nextLine();
        System.out.println(IsValidMod10Number(number));

    }




    private static boolean IsValidMod10Number(String  number)
    {
       if(number.length() != 16)
           return false;


        int [] numberArray = new int[number.length()];
        boolean checkBit = true;
        int sumTotal =0;
        for(int i=0; i < number.length() ; i++)
        {
            numberArray[i] = number.charAt(i) - '0';
        }
        for(int index = numberArray.length -1 ; index >= 0 ; index--)
        {
            if(checkBit)
            {
                numberArray[index] *=2;
                if(numberArray[index] > 9)
                {
                    numberArray[index] -= 9;
                }
            }
            sumTotal += numberArray[index];
            checkBit = !checkBit;
        }
        return sumTotal % 10 == 0;
    }

}


