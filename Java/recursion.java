public class recursion {
    int findmax(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        int maxEle=findmax(arr,n-1);
        return (arr[n-1]>maxEle?arr[n-1]:maxEle);

    }
    int binarysearch(int[] arr,int l ,int r,int x){
        if (l>r) return -1;
        int mid=(l+r)/2;
        if(arr[mid]==x)return mid;
        if(x<arr[mid])return binarysearch(arr,l,mid-1,x);
        return binarysearch(arr,mid+1,r,x);
    }
    public static void main(String[] args){
        recursion s=new recursion();
        int[] arr={1,2,3,5,4};
        int c=s.findmax(arr,5);
        System.out.print("the maximum element from the array is "+c);
        int


        


    }
}
