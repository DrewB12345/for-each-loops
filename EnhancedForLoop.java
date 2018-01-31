import java.util.ArrayList;

public class EnhancedForLoop
{
    public static double mean(double[] nums) {
        double sum = 0.0;
        for (double n:nums) sum += n;
        return sum / nums.length;
    }
    
    public static double max(double[] nums) {
        double max = nums[0];
        for (double n:nums) if (n > max) max = n;
        return max;
    }
    
    public static double sumEvenVals(double[] nums) {
        double sum = 0.0;
        for (double n:nums) if (n % 2 == 0) sum += n;
        return sum;
    }
    
    public static int vowelCount(String[] words) {
        int count = 0;
        for (String str:words) {
            for (int s = 0; s < str.length(); s++) if (str.substring(s,s+1).equals("a") || str.substring(s,s+1).equals("e") || str.substring(s,s+1).equals("i") || str.substring(s,s+1).equals("o") || str.substring(s,s+1).equals("u")) count++;
        }
        return count;
    }
    
    /**
    public static double sumEvenLocs(double[] nums) {
        double sum = 0.0;
        int count = 0;
        for (double n:nums) {
            if (count % 2 == 0) sum += n;
            count++;
        }
        return sum;
    }
    **/

    public static double sumEvenLocs(double[] nums) {
        double sum = 0.0;
        for (int n=0; n<nums.length; n++) {
            if (n % 2 == 0) sum += nums[n];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        /********** Examples **********/
        
        int[] arr = {4,5,1,2,3,8};
        
        // Ex. 1
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 2
        for (int x: arr)
            x++; // remember, x is a copy of each item in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 3
        for (int i=0; i<arr.length; i++)
            arr[i]++; // now we are actually changing elements in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        
        // Ex. 4
        Pet[]   pets = {new Pet("Phineas"),new Pet("Ferb"),new Pet("Perry")};
        
        for (Pet p : pets)
            p.sleep();
        

        for (Pet p : pets)
            System.out.println(p);

        ArrayList<Pet> morePets = new ArrayList<Pet>();
        morePets.add(new Pet("Milo"));
        morePets.add(new Pet("Otis"));
        
        for (int i=morePets.size()-1; i>=0; i--) {
            Pet p = morePets.get(i);
            
            morePets.remove(i);
            p.eat();
        }
        /********** Your turn **********/
        
        // #1 - Write a method mean(double nums[]) which uses an enhanced
        //      for loop to return the mean of the elements in nums. Test
        //      the method here.
        
        double[] nums = {3.0, 6.0, 15.0, 16.0, 1.0, 3.0};
        System.out.println(mean(nums));
        
        // #2 - Write a method max(double nums[]) which uses an enhanced
        //      for loop to return the maximum value of the elements in
        //      nums. Then test the method.

        System.out.println(max(nums));
        
        // #3 - Write a method sumEvenVals that uses an enhanced for 
        //      loop to return the sum of all even values stored in an 
        //      Array.  Then test the method.

        System.out.println(sumEvenVals(nums));

        // #4 - Write a method vowelCount that uses an enhanced for loop
        //      to count the number of vowels (a,e,o,u only) in a list
        //      of words.
        
        String[] words = {"oof", "word", "this is a phrase"};
        System.out.println(vowelCount(words));

        // #5 - Write a method sumEvenLocs that uses an enhanced for 
        //      loop to find the sum of all values stored with even 
        //      numbered indices in an Array. Then test the method.
        
        System.out.print(sumEvenLocs(nums));
        
        // #6 - Solve #5 using a regular for loop. Then explain why a
        //      regular for loop is more appropriate for that problem.
        
        // Regular for loops are better when dealing with positions.
        
    }
}