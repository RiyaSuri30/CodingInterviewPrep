class Solution 
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // now the way we work here is as follows
        if(image[sr][sc]== newColor) return image;
        fill(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    public void fill(int[][] image, int sr, int sc, int color, int newColor)
    {
        if(sr<0 || sc < 0 || sr>=image.length || sc>= image[0].length || image[sr][sc]!=color)
        {
            return;
        }
         image[sr][sc]=newColor;
        fill(image,sr-1,sc,color,newColor);
        fill(image,sr+1,sc,color,newColor);
        fill(image,sr,sc-1,color,newColor);
        fill(image,sr,sc+1,color,newColor);
    }
}

// https://leetcode.com/problems/flood-fill/
