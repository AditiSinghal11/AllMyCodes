public class array2 {
    public static void main(String[] args) {
        int a[]={4,3,6,7};
       int n=a.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
            if ((a[i]+a[j])>a[k]){
                temp=temp+1;
            }}
        }
        
        
    }System.out.println("the number of traingles that can be formed are "+temp);
}}
