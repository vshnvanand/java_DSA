public class Sort {
    public static void main(String[] args) {
        
        int array[] = {7,8,3,1,2};
        // Bubble sort 
        // for(int i=0; i < trial.length-1; i++){
        //     for(int j=0; j<trial.length-i-1; j++){
        //         if (trial[j] > trial[j+1]){
        //             int b = trial[j];
        //             trial[j] = trial[j+1];
        //             trial[j+1] = b;
        //         }
        //     }
        // }

        // for(int i=0; i<trial.length; i++){
        //     System.out.println(trial[i]);
        // }
        

        // Selection sort
        // for(int i=0; i<array.length-1; i++){
        //     int smallest = i;
        //     for(int j=i+1; j<array.length; j++){
        //       if (array[smallest] > array[j]){
        //         smallest = j;
        //       }
        //     }

        //     int temp = array[smallest];
        //     array[smallest] = array[i];
        //     array[i] = temp;
        // }

        // Insertion sort
        
        for (int sorted = 1; sorted < array.length ; sorted ++){
            int current = array[sorted];

            int last_unsorted = sorted - 1;
            while (last_unsorted>=0 && current < array[last_unsorted]){
                array[last_unsorted+1] = array[last_unsorted]; 
                last_unsorted--;
            } 

            array[last_unsorted + 1] = current;

        }
        
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}
