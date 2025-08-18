public class Array {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;

        //printing the array
        for (int i=0;i<n;i++){// Arraylist<integer> arr= new Arryalist<>()
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //incrementing the array with 5
        for (int i=0;i<n;i++){
            arr[i]+=5;
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //reversal of an array
        int k =0;
        int l =arr.length-1;

        while (k < l) {
           int temp = arr[k];
           arr[k] = arr[l];
           arr[l] = temp;
           k++;
           l--;
        }
         for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //even no.
        for (int i=0;i<n;i++){
            if(arr[i]%2==0){
            System.out.print(arr[i]+" ");}
        }
        System.out.println();

        //odd no.
        for (int i=0;i<n;i++){
            if(arr[i]%2!=0){
            System.out.print(arr[i]+" ");}
        }
        System.out.println();

        //sum and average of an array
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        int avg=sum/n;
        System.out.println("the sum of the array is:"+sum);
        System.out.println("the average of the array is:"+avg);

        // first and second largest
        int temp=0;
        int temp_2=0;
        for (int i=0;i<n;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }

        for (int i=0;i<n;i++){
            if(temp_2<arr[i] && arr[i]<temp){
                temp_2=arr[i];
            }

        }
        System.out.println("largest is:"+temp);
        System.out.println("2nd largest is:"+temp_2);
        // count of even and odd numbers 
        int count_even=0;
        int count_odd=0;
        for (int i=0;i<n;i++){
            if(arr[i]%2==0){
            count_even+=1;
        }
          else{
            count_odd+=1;
        }
          
        }
        System.out.println("the number of even elements:"+count_even);
        System.out.println("the number of odd elements:"+count_odd);
        System.out.println();

        //function to find the smallest element in the array
     {
            int smallest = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            System.out.println("the smallest number in the array is:"+smallest); 

        }
    //formation of a traingle using array 
    
    }}
