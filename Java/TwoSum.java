import java.security.InvalidParameterException;

public class TwoSum{

    public static void main(String[] args) {

        int[] arrayOne = new int[] {2, 7, 11, 15};
        int target = 10;

        int[] resultResult = SumNum(arrayOne, target);

        for (int i = 0; i < 2; i++){
            System.out.println("Index " + i + ": " + resultResult[i]);
        }

    }

    static int[] SumNum(int[] arrayP, int targetP){
        
        int[] returnArray = new int[] {0, arrayP.length - 1};

        while (returnArray[0] != returnArray[1]){
            int result = arrayP[returnArray[0]] + arrayP[returnArray[1]] - targetP;
            
            if(result == 0){
                return returnArray;
            }  
            else if (result < 0){
                returnArray[0]++;
            }  
            else{
                returnArray[1]--;
            }
        }
        throw new InvalidParameterException();
    } 
}