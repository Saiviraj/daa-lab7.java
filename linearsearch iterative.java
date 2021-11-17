import java.util.Scanner; public class Main {

public static void main(String[] args) {


Scanner scanner = null;
 
try {



System.out.println("Enter input Array Size:"); scanner = new Scanner(System.in);
int inputArraySize = scanner.nextInt();



 



Elements:");
 
int inputArray[] = new int[inputArraySize]; System.out.println("Enter " +inputArraySize+" Array

for (int i = 0; i < inputArray.length; i++) { inputArray[i] = scanner.nextInt();
 
}
System.out.println("Enter Seach Key Element:"); int seachKey = scanner.nextInt();


 




"+seachKeyIndex);
 
int seachKeyIndex = linearSearch(inputArray,seachKey); if( seachKeyIndex != -1)
System.out.println(seachKey +" found at index:inputArray");
 
else
 

System.out.println(seachKey +" not found in);
 



} catch (Exception e) { e.printStackTrace();
}finally {
if(scanner != null)
 
scanner.close();
}



}
private static int linearSearch(int[] inputArray, int seachKey) { for (int i = 0; i < inputArray.length; i++) {
if(inputArray[i] == seachKey ) return i;
 



}
}
