public class QuickSort{
  public static void swap (int a [], int i, int j){
        int temp = a[i]; 
        a[i] = a[j]; 
        a[j] = temp; 
    }
  public static void quickSort(int [] a, int l, int r){ 
        if (l < r){
            int p = r;
            int i = l; 
            int j = r-1;
            do {
                while (a[i] <= a[p] && i <= j) i++;
                while (a[j] >= a[p] && i <= j) j--;
                if (i < j){ 
                    swap (a, i, j);
                    i++;
                    j--;
                }
            }
            while (i < j);
            swap (a, i, r); 
            print (a); 
            quickSort (a, l, i-1); 
            quickSort (a, i+1, r);
        }        
    }
}
