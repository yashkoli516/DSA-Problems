class Solution {
    public int minMoves(int[] arr) {
        int i,count=0,Max = arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>Max)
            {
                Max = arr[i];
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<Max)
            {
                count += Max - arr[i];
            }
        }
        return count;
    }
}