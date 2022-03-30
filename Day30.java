class Solution {
    public boolean search(int matrix[][],int n,int m,int a,int b,int target) {
     if(a==m&&b==n)
         return false;
        int low=b,end=n-1;
        while(low<=end) {
        int mid=low+(end-low)/2;
         if(matrix[a][mid]==target)
        return true;
        if(matrix[a][mid]>target)
        end=mid-1;
        else
        low=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
      int m=matrix.length;
        int n=matrix[0].length;
        int j=0;
        for(int i=0;i<m;i++) {
           if(target>=matrix[i][j]&&target<=matrix[i][n-1]) {
             return search(matrix,n,m,i,j,target);
           }
        }
        return false;
    }
} 
