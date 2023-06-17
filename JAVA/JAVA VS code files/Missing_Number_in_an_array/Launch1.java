package Missing_Number_in_an_array;
public class Launch1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,10};
        int n=arr.length;
        //Time complexcity of umOfNaturalNo is o(1)
        int sumOfNaturalNo=(n+1)*(n+2)/2;
        int sum=0;
        // Time coplexcity to get sum of current array elements is o(n)
        for(int i=0;i<n;i++){
            sum+=arr[i];
    } 
    int missingNo=sumOfNaturalNo-sum;
    System.out.println("Missing Number is: "+missingNo);

    }
}