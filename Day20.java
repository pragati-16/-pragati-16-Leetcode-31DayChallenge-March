class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
    int len = tops.length;
    int[] arr = new int[7]; // store tops data
    int[] brr = new int[7]; // store bottom data
    int[] crr = new int[7]; // store repeated data
    for(int i=0;i<len;i++)
    {
    if(tops[i] == bottoms[i])
    crr[tops[i]]++;
    arr[tops[i]]++;
    brr[bottoms[i]]++;
    }
    int ans = -1;
    for(int i=1;i<7;i++)
    {
    if(arr[i]+brr[i] == (len+crr[i]))
    {
    ans = Math.max(ans,Math.max(arr[i],brr[i]));
    }
    }
    return (ans!=-1)?len-ans:-1;
    }
    }