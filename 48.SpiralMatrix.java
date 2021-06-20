class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     //spiral matrix in leetcode
        
        //we want to print array in spiral order
        //so here we use the concept of spiral matrixing 
        int T=0;
        int B=matrix.length-1;
        int L=0;
        int R = matrix[0].length-1;
        ArrayList<Integer> value = new ArrayList<Integer>();
        int dir = 0;
        while(T<=B && L<=R)
        {
            if(dir==0)
            {
            for(int i=L;i<=R;i++)
            {
                value.add(matrix[T][i]);
            }
                T++;
            }
            //if dir ==1  go bottom
            if(dir==1)
            {
            for(int i=T;i<=B;i++)
            {
                value.add(matrix[i][R]);
            }
                R--;
            }
            //if dir == 2
            if(dir==2)
            {
            for(int i=R;i>=L;i--)
            {
                value.add(matrix[B][i]);
            }
                B--;
            }
            //if dir == 3 
            if(dir==3)
            {
            for(int i=B;i>=T;i--)
            {
                value.add(matrix[i][L]);
            }
                L++;
            }
           // return value;
            dir = (dir+1)%4;
        }
        return value;
    }
}
