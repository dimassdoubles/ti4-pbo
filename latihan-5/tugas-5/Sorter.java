public class Sorter {
    int daftarAcak[];
    int n = 5;

    void setDaftar(int[] daftarAcak) {
        this.daftarAcak = daftarAcak;
        this.n = daftarAcak.length;
    }

    void bubbleSort() {
        cetakAray();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (daftarAcak[j] > daftarAcak[j+1]) {
                    // swap
                    int temp = daftarAcak[j];
                    daftarAcak[j] = daftarAcak[j+1];
                    daftarAcak[j+1] = temp;

                    cetakAray();
                }
            }
        }

    }

    //  quick sort
    void quickSort() {
        quickSortRunner(daftarAcak, 0, n-1);
    }

    void quickSortRunner(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // separately sort elements before 
            // partition and after partition
            quickSortRunner(arr, low, pi-1);
            quickSortRunner(arr, pi+1, high);
        }

    }

    int partition(int[] arr, int low, int high) {

        // pivot
        int pivot = arr[high];

        // index of smaller element and indicates the right position
        // of pivot found so far
        int i = (low-1);

        for (int j = low; j <= high - 1; j++) {
            // if current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
                // increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, high);
        cetakAray();
        return (i+1);
    }

    // insertion sort
    void insertionSort() {
        cetakAray();
        int currIndex;
        for (int i=1; i< n; i++) {
            currIndex = i;
            while (currIndex > 0) {
                if (daftarAcak[currIndex] < daftarAcak[currIndex-1]) {
                    swap(daftarAcak, currIndex, currIndex-1);
                    currIndex --;
                    cetakAray();
                } else {
                    break;
                }
            }
        }
    }


    // selection sort
    void selectionSort() {
        cetakAray();
        for (int i = 0; i<n-1; i++) {
            // find the minimun element in unsorted array
            int min_idx = i;
            for (int j = i+1; j<n; j++) {
                if (daftarAcak[j] < daftarAcak[min_idx]) {
                    min_idx = j;
                }
            }

            // swap the found minimum element with the first
            // element
            swap(daftarAcak, min_idx, i);
            cetakAray();
        }
    }

    // merge sort
    // merges twho subarrays of arr[]
    // first subarray is arr[l..m]
    // second subarray is arr[m+1...r]

    void mergeSort() {
        cetakAray();
        mergeSortRunner(daftarAcak, 0, n-1);
    }

    void merge(int arr[], int l, int m, int r) {
        // find size of twho subarrays to be merged
        int n1 = m-l + 1;
        int n2 = r-m;

        // create temp arrays;
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }

        for (int j = 0; j<n2; j++) {
            R[j] = arr[m+1+j];
        }

        // merge the temp arrays

        // initial indexes of first and second subarrays
        int i = 0, j = 0;

        // initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        cetakAray();
    }

    void mergeSortRunner(int arr[], int l, int r) {
        if (l < r) {
            // find the middle point
            int m = l+ (r-l)/2;

            // sort first and second halves
            mergeSortRunner(arr, l, m);
            mergeSortRunner(arr, m+1, r);

            // merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void cetakAray() {
        System.out.print("   ");
        for (int i = 0; i < n; i++) {
            System.out.print(daftarAcak[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int daftarAcak1[] = {8, 7, 5, 4, 3};
        int daftarAcak2[] = {8, 7, 5, 4, 3};
        int daftarAcak3[] = {8, 7, 5, 4, 3};
        int daftarAcak4[] = {8, 7, 5, 4, 3};
        int daftarAcak5[] = {8, 7, 5, 4, 3};

        Sorter sorter = new Sorter();

        sorter.setDaftar(daftarAcak1);

        System.out.println("Array acak: ");
        sorter.cetakAray();

        System.out.println("\n1. Bubble Sort");
        sorter.bubbleSort();

        System.out.println("\n2. Quick Sort");
        sorter.setDaftar(daftarAcak2);
        sorter.quickSort();

        System.out.println("\n3. Insertion Sort");
        sorter.setDaftar(daftarAcak3);
        sorter.insertionSort();

        System.out.println("\n4. Selection Sort");
        sorter.setDaftar(daftarAcak4);
        sorter.selectionSort();

        System.out.println("\n5. Merge Sort");
        sorter.setDaftar(daftarAcak5);
        sorter.mergeSort();

        sorter.cetakAray();

    }

}
