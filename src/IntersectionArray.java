import java.util.ArrayList;

public class IntersectionArray {

    public static void Brute(int[] arr,int[] brr) {
        int n1 = arr.length;
        int n2 = brr.length;

        int[] visited = new int[n2];

        ArrayList<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr[i] == brr[j] && visited[j] == 0 ) {
                    intersection.add(arr[i]);
                    visited[j] = 1;
                    break;
                }
                if (brr[j]>arr[i]){
                    break;
                }
            }
        }

        System.out.println(intersection);
    }

    public static void Optimal(int[] arr, int[] brr) {
        int n1 = arr.length;
        int n2 = brr.length;

        ArrayList<Integer> inter = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            if (arr[i]<brr[j]){
                i++;
            }
            if (arr[i]>brr[j]) {
                j++;
            }else {
                inter.add(arr[i]);
                i++;j++;
            }
        }

        System.out.println(inter);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,6};
        int[] brr = {2,3,3,5,6,6,7};

        Brute(arr,brr);
        Optimal(arr,brr);
    }
}
