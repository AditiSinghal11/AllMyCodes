public class sorting {
  
    public static void main(String[] args){
        int[] main={19,45,32,56,2};
        int temp=0;
        
        for (int i =0;i<main.length-1;i++){
            System.out.println(i);
           
            if(main[i]>main[i+1]){
                temp=main[i+1];
                main[i+1]=main[i];
                main[i]=temp;
            }             

            }
            
         for(int j=0;j<main.length;j++){
            System.out.print(" "+main[j]);

        }

    }}

