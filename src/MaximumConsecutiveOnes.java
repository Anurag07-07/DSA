public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1};

        int cnt = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                cnt++;
            }
            if (arr[i]==0){
                cnt = 0;
            }
            if (cnt>maxi){
                maxi = cnt;
            }
        }

        System.out.println("The maximum one is "+maxi);
    }
}
