class Boombergs {
    public long distance(int a[],int b[])
    {
        int x=a[0]-b[0];
        int y=a[1]-b[1];
        return x*x+y*y;
    }
    public int numberOfBoomerangs(int[][] points) {
        int len=points.length;
        if(len<3)
        {
            return 0;
        }
        else
        {
            int cnt=0;
            long dst;
            for(int i=0;i<len;i++)
            {
                HashMap<Long,Integer> store= new HashMap<>();
                for(int j=0;j<len;j++)
                {
                    if(j!=i)
                    {                   
                        dst=distance(points[i],points[j]);
                        if(store.containsKey(dst)==true)
                        {
                            store.put(dst,store.get(dst)+1);
                        }
                        else
                            store.put(dst,1);
                    }

                }
                for(int val:store.values())
                {
                    if(val>1)
                    {
                        cnt+=(val-1)*(val);
                    }
                }
            }
            return cnt;
        }
    }
}