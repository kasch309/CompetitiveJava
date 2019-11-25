public class SelectionSort{
  public static int[] selectionSort(int[] integerArray){
    int length = integerArray.length; 
    for (int i = 0; i < length; i++){
      int minPos=i;
      for (int j = i; j < length; j++){
        if (integerArray[j]<integerArray[minPos]) minPos = j;
      }
      if (integerArray[i]>integerArray[minPos]) swap(integerArray, i, minPos);
    }
    return integerArray;
  }
  public static void swap(int[] integerArray, int pos1, int pos2){
    int tmp = integerArray[pos1]; 
    integerArray[pos1]=integerArray[pos2]; 
    integerArray[pos2]=tmp;
  }

  public static void main (String args[]){
      int [] array = {1, 4, 3, 2, 6, 7, 5, 9};
      selectionSort(array);
      for (int i = 0; i < array.length; i++){
          System.out.print (array[i] + " -- ");
      }
  }
}
