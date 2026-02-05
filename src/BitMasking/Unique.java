package BitMasking;

public class Unique {
    public static void main(String[] args) {
        int [] nums= {2,2,3,3,1};
        int ans=0;
        for(int num: nums){
            ans=ans^num;
        }
        System.out.println(ans);
    }
}
