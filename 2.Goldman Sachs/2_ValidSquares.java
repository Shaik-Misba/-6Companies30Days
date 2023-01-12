//https://leetcode.com/problems/valid-square

import java.util.*;
public class 2_ValidSquares {
        HashMap<Double,Integer> store=new HashMap<>();
        public void findDistance(int []a ,int[] b)
        {
            if(a[0]==b[0] && a[1]==b[1])
            return;
            int x=a[0]-b[0];
            int y=a[1]-b[1];
            double res=Math.sqrt(x*x+y*y);
            if(store.containsKey(res))
            {
                store.put(res,store.get(res)+1);
            }
            else
            {
                store.put(res,1);
            }
        }
        public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
         
            findDistance(p1,p3);
            findDistance(p1,p4);
            findDistance(p1,p2);
            findDistance(p2,p3);
            findDistance(p2,p4);
            findDistance(p3,p4);
            int len=store.size();
            if(len==2)
            {   
                int sum=0;
                for(int val:store.values())
                {
                    if(val!=2 && val!=4)
                    {
                        return false;
                    }
                    sum+=val;
                }
                if(sum/2==3)
                return true;
                return false;
            }
            return false;
        }
    }
}
