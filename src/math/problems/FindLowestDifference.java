package math.problems;


public class FindLowestDifference

{
    // Returns minimum difference between any pair
    static int findMinDiff(int[] arr, int n)
    {

        int diff = Integer.MAX_VALUE;


        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (Math.abs((arr[i] - arr[j]) )< diff)
                    diff = Math.abs((arr[i] - arr[j]));


        return diff;
    }


    public static void main(String[] args)
    {
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        System.out.println("Minimum difference is "+
                findMinDiff(array1, array2.length));

    }
}
