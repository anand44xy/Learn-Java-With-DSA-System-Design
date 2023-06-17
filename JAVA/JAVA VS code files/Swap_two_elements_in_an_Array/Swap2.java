public class Swap2 {
    public static void main(String[] args) {

        int[] arr={2,4,6,8,10};
        int n=5;
        for(int i=0;i<n/2;i++){
            //Swap two elements in an array
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.print("Reversed Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
