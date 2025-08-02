public class MyArray {
    private int[] arr;
    private int currentIndex;

    public MyArray(int initialSize) {
        this.arr = new int[initialSize];
        this.currentIndex = 0;
    }

    public void insert(int num) {
        if (this.currentIndex == this.arr.length) {
            int[] tempArr = new int[2 * arr.length];
            for(int i = 0; i < currentIndex; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
        this.arr[currentIndex] = num;
        this.currentIndex++;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i = 0; i < this.currentIndex; i++) {
            str.append(this.arr[i] + ", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }

    public int indexOf(int value) {
        for (int i = 0; i < this.currentIndex; i++) {
            if(this.arr[i] == value) return i;
        }
        return -1;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= this.currentIndex) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }


        for(int i = index; i < this.currentIndex - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }

        this.arr[currentIndex - 1] = 0;
        this.currentIndex--;
    }

    public int max() {
        if (this.currentIndex == 0) throw new IllegalStateException("Array is empty.");

        int result = this.arr[0];
        for(int i = 0; i < this.currentIndex; i++) {
            if(arr[i] > result) {
                result = arr[i];
            }
        }    
        return result;    
    }

    public int min() {
        if (this.currentIndex == 0) throw new IllegalStateException("Array is empty.");
        int result = this.arr[0];
        for(int i = 0; i < this.currentIndex; i++) {
            if(arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }

    // public MyArray reverse() {
    //     MyArray newArr = new MyArray(this.currentIndex);
    //     for(int i = 0; i < this.currentIndex; i++) {
    //         newArr.insert(arr[currentIndex - 1 -  i]);
    //     } 
    //     return newArr;
    // }

    // public MyArray reverse() {
    //     int temp;
    //     int n = this.currentIndex / 2;
    //     for(int i = 0; i < n; i++) {
    //         temp = arr[i];
    //         arr[i] = arr[currentIndex - i - 1];
    //         arr[currentIndex - i -1] = temp;
    //     }
    //     return this;
    // }

    public void reverse() {
        int i = 0; // start index ---> i
        int j = this.currentIndex - 1;
        int temp = 0;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            i++;
            j--;
        }
    }
}