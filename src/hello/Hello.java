package hello;

public class Hello {
public static void main(String[] args) 
{
    int N = 10; // set the number of elements in the array
    int mass[]; // declare an array.
    mass = new int [N];
    
    int min = 0;
    int max = 2;

    for (int j = 0; j < N; ++j)
        mass[j] = (int)Math.floor(Math.random()*(max-min+1)+min);       // initialize the array.
    
    
    int count = 1, temp_count = 0;  // The number of elements in the sequence, respectively, the maximum and temporal
    int pos = 0, temp_pos = 0;  // The position of the beginning of a sequence of identical elements, respectively, the maximum and time
    
    for(int j = 1; j < N; ++j)
        if (mass[j] == mass[j - 1]) // if the current element is equal to the previous one
        {
            ++temp_count;   // Increment element counter in time sequence
            if (temp_count > count) // If there are more elements in the time sequence than in the maximum
            {   
                count = temp_count; // update counter
                pos = temp_pos; // Move the position of the beginning of the maximum sequence
            }
        }
        else 
        {
            temp_count = 1;     // declare the number of elements in the following order
            temp_pos = j;   // remember position
        }
    
    for (int j = 0; j < N; ++j)
    	System.out.println(mass[j]);    // Printing the array

    System.out.printf
    		("sequence start index: " + pos 
    		+ "\nsequence start index: " + (pos + count) 
    		+ "\ncount: " + count);
}
}

 
