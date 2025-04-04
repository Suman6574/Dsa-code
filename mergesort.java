public class mergesort {
    public static void megesort(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int [n1];
        int right[]=new int [n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
          if(left[i]<right[j]){
            arr[k++]=left[i++];
          }else{
            arr[k++]=right[j++];
          }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }

    }
    public static void merge(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int mid= (l+r)/2;
        merge(arr,l,mid);
        merge(arr,mid+1,r);
        megesort(arr,l,mid,r);

    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        merge(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
