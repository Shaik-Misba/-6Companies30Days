//https://leetcode.com/problems/max-points-on-a-line/
class Solution {
    public int maxPoints(int[][] points) {
        int len=points.length;
        if(len<=2)
        {
            return len;
        }
        int maxPoints=2;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                int pts=2;
                for(int k=0;k<len;k++)
                {
                    if(k!=j && k!=i)
                    {
                        int a=(points[i][0]-points[k][0]);
                        int b=(points[i][1]-points[k][1]);
                        int x=(points[j][0]-points[k][0]);
                        int y=(points[j][1]-points[k][1]);
                        if(a*y==b*x)
                        {
                            pts++;
                        }
                    }
                }
                maxPoints=Math.max(pts,maxPoints);
            }
        }
        return maxPoints;
    }
} 1_MaxPoints {
    
}
