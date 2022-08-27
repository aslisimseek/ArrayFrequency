import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array = {22, 12,12, 22, 5 , 12};
        int lastArrayElement = 0;
        Arrays.sort(array);
        //5,12,12,22,22
        for (int i = 0; i < array.length; i++) {
            if (array[i] != lastArrayElement){
                int frequencyNumber = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        frequencyNumber += 1;
                        lastArrayElement = array[i];
                    }
                }
                if (frequencyNumber > 1) {
                    System.out.println(array[i] + " number repeat " + frequencyNumber + " times.");
                }
            }

        }
    }
}

