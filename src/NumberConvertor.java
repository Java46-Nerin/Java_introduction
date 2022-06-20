public class NumberConvertor 
{
    public static String toBinaryStr(int number)
    {
    	String s = "";
        while (number > 0)
        {
            s =  ( (number % 2 ) == 0 ? "0" : "1") + s;
            number = number / 2;
        }
        if (number ==  0)
        	s = "0" + s;
        return s;
    }
    
}
