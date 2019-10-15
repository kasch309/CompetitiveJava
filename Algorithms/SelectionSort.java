public class SelectionSort{
  public static int[] selectionSort(int[] integerArray){
    int length = integerArray.length(); 
    for (int i = 0; i < length; i++){
      int minPos=i;
      for (int j = i; j < length-i; j++){
        if (integerArray[j]<integerArray[minPos]) minPos = j;
      }
      if (integerArray[i]>integerArray[minPos]) swap(integerArray, i, minPos);
    }
  }
  public static int[] swap(int[] integerArray, int pos1, int pos2){
    int tmp = integerArray[pos1]; 
    integerArray[pos2]=integerArray[pos1]; 
    integerArray[pos1]=tmp;
  }
}
