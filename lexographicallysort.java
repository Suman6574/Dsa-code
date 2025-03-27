public class lexographicallysort {
    public static void sort(String fruits[]){
        int n=fruits.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[minidx])<0){
                    minidx=j;
                }
                
            }
            String temp=fruits[i];
                fruits[i]=fruits[minidx];
                fruits[minidx]=temp;
            

        }

    }
    public static void main(String[] args) {
        String fruits []={"banana","litchi","apple","grapes"};
        sort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]+" ");
        }
    }
    
}
