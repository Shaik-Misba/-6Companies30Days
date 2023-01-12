import java.util.*;
public class NumberOfPairsSatisfying {
    long count = 0;
    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        int len = nums1.length;

        // step1
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<len; i++){
            list.add(nums1[i]-nums2[i]);
        }

        mergeSort(list, 0, len-1, diff);
        return count;
    }
    // step2
    private void mergeSort(ArrayList<Integer> list, int start, int end, int diff){
        if(start==end) return;

        int mid = (start+end)/2;
        mergeSort(list,start,mid,diff);
        mergeSort(list,mid+1,end,diff);

        merge(list,start,mid,end,diff);
        return;
    }
}
