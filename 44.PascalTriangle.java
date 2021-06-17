class Solution {
    public List<List<Integer>> generate(int numRows) {
        // so the way we get the 
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //the key is here to set pre as null initially
        List<Integer> row, pre = null;
        
        for(int i=0;i<numRows;i++)
        {
            row = new ArrayList<Integer>();
            //so the way it works is as follows
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre=row;
            res.add(row);
        }
        return res;
    }
}
// https://leetcode.com/problems/pascals-triangle/
