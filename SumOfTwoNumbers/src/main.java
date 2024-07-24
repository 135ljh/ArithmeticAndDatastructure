public class main {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        Solution1 solution1=new Solution1();
        for (int i = 0; i < solution1.twoSum(nums, target).length; i++) {

            System.out.println(solution1.twoSum(nums, target)[i]);
        }

        Soluton2 soluton2=new Soluton2();
        for (int i = 0; i < soluton2.twoSum(nums, target).length; i++) {

            System.out.println(soluton2.twoSum(nums, target)[i]);
        }

        Solution3 solution3=new Solution3();
        for (int i = 0; i < solution3.twoSum(nums, target).length; i++) {

            System.out.println(solution3.twoSum(nums, target)[i]);
        }
    }
}
