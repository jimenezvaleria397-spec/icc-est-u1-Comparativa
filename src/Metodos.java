public class Metodos {
    public void sortBubble(int[] arr){
        for( int i = 0 ; i < arr.length; i ++){
            boolean swap= false;
            for(int j = 0 ; j < arr.length -1; j++ ){
                if(arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr [j +1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
    public void mergeSort(int [] arr , int inicio, int fin){
        if (inicio < fin) {
            int pivote = arr[fin];
            int i = (inicio - 1);
            for (int j = inicio; j < fin; j++) {
                if (arr[j] <= pivote) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[fin];
            arr[fin] = temp;
        }
    }
}
    

