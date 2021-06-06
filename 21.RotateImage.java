class Solution {
    public void rotate(int[][] matrix) {
        // the way we work for it is as follows
        
        // this denotes transpose of matrix
        for(int i =0;i<matrix.length;i++)
        {
            for(int j =i ;j<matrix[0].length;j++)
            {
                int temp=0;
                temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        // now we need to understand 
        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0 ;j<matrix[0].length/2;j++)
            {
                int temp = 0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
        
        return ;
    }
}
