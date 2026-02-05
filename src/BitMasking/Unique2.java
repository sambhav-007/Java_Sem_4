package BitMasking;

public class Unique2 {
    public static void main(String[] args) {
        int [] nums={4,4,4,3,3,3,2,2,2,1};
        int result=0;
        for(int i=0;i<32;i++){
            int sum =0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j]>>i)&1) == 1){
                    sum++;
                }
            }
            sum=sum%3;
            if(sum!=0){
                result|=(sum<<i);
            }
        }
        System.out.println(result);
    }
}
