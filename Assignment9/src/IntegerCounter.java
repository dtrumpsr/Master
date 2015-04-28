import java.util.Scanner;

public class IntegerCounter {
    final private int minInt = 0;
    final private int maxInt = 100;
    private int[][] intCount = new int[(maxInt - minInt) + 1][2];

   
    public IntegerCounter() {
        for (int i = minInt; i < maxInt + 1; i++) {   
            intCount[i][0] = i;
            intCount[i][1] = 0;
        }
    }
    
    public void putIntegers(String mList) {
        String[] strList = mList.split(" ");   
        int[] intList = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            intList[i] = Integer.parseInt(strList[i]);
        }

        for (int i = 0; i < intList.length; i++) {
            for (int j = 0; j < intCount.length; j++) {
                if (intList[i] == intCount[j][0]) {   
                    intCount[j][1]++;                 
                    j = maxInt;
                }
            }
        }
    }
    
    public String getIntegers() {
        String result = "";
        int minOccurrences = 0;
        for (int i = 0; i < intCount.length; i++) {
            if (intCount[i][1] > minOccurrences) {
                result += intCount[i][0] + ": " + intCount[i][1] + "\n";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IntegerCounter iCnt = new IntegerCounter();

        System.out.println("Enter a series of integers separated by spaces:");
        String strList = scan.nextLine();
        
        iCnt.putIntegers(strList);
        System.out.println(iCnt.getIntegers());

    }
}