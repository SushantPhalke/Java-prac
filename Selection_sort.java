
public class Selection_sort {
    public static void main(String[] args) {
        int [] numbers = {32,33,43,34,56,43,2,3,1,11,20};
        for (int i=0; i< numbers.length;i++){

            int noToSwap = numbers[i];
            int pos = i;
            for (int j=i+1;j< numbers.length;j++) {
                if (noToSwap>numbers[j]) {
                    noToSwap = numbers[j];
                    pos= j;
                }

            }
            int temp = numbers[i];
            numbers[i] = numbers[pos];
            numbers[pos]=temp;

        }
        printArray(numbers);

    }
    public static void printArray(int [] myarray) {
        for (int j : myarray) System.out.print(j + " ");
    }

}
