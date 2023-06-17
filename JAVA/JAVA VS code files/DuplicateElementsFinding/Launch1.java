//Time complexity=O(n^2)
//Space complexity=O(1)
package DuplicateElementsFinding;
public class Launch1 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,7};
        int n=arr.length;
        //Time complexity=O(n^2)
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
               if(arr[i]==arr[j]){}
            }
            System.out.println("Duplicate Value is:"+arr[i]);
        }
    }
}
