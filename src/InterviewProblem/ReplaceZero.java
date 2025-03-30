package InterviewProblem;

import java.util.Scanner;

public class ReplaceZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,1,1,1,1,0,1,1,1,0,0,1,1,0 };
        int n = arr.length;
        int ans = 0;
        //For Run Loop
        for (int i = 0; i < n ; i++) {
            int L = 0,R = 0;
            if (arr[i] == 0) {
                //Left Count of 1
                int  j = i-1;
                while(j>=0 && arr[j]==1){
                    L++;
                    j--;
                }

                //Right Count of 1

                int k = i+1;
                while (k<n && arr[k]==1){
                    R++;
                    k++;
                }
            }

            ans = Math.max(ans,L+R+1);
        }
        System.out.println("The Max Value is: "+ans);
    }
}
