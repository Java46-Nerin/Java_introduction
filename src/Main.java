public class Main {
    public static void main(String[] args)
    {
        int N = 7; // set the number of elements in the array
        int mass[]; // declare an array.
        
        mass = new int [N];
        
        int min = 1;
        int max = 99;
        
        for (int j = 0; j < N; ++j)
            mass[j] = (int)Math.floor(Math.random()*(max-min+1)+min);       // initialize the array.
        
        for (int j = 0; j < N; ++j)
        	System.out.println(mass[j]);    // Printing the array
    }
}


