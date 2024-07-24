import java.util.Arrays;

//排序+双指针
public class Soluton2 {
    public int[] twoSum(int[] nums,int target){
        int m=0,n=0,k,board=0;
        int[] res=new int[2];
        int[] temp1=new int[nums.length];
        System.arraycopy(nums,0,temp1,0,nums.length);
        Arrays.sort(nums);
        for(int i=0,j=nums.length-1;i<j;){
            if(nums[i]+nums[j]<target)
                i++;
            else if(nums[i]+nums[j]>target)
                j--;
            else{
                m=i;
                n=j;
                break;
            }
        }
        for(k=0;k<nums.length;k++){
            if(temp1[k]==nums[m]){
                res[0]=k;
                break;
            }

        }
        for(int i=0;i<nums.length;i++){
            if(temp1[i]==nums[n]&&i!=k)
                res[1]=i;

        }
        return res;
    }
}
