class Solution{
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] c = new int[nums1.length + nums2.length];

        for(int i = 0 ;i < nums1.length ; i++){
            c[i] = nums1[i];
        }

        for(int i = 0 ;i < nums2.length ; i++){
            c[nums1.length+i] = nums2[i];
        }

        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    int temp = c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }

        if(c.length % 2 == 1)
        {
            return c[c.length/ 2];
        } else {
            int mid1 = c.length/ 2;
            int mid2 = mid1 - 1;
            return (c[mid1] + c[mid2]) / 2.0;

        }
    }
}
