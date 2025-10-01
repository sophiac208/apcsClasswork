public class MyArrays( {
  public static String aryToString(int[] nums) {
    String result = "";
    for (int i = 0; i< nums.length; i++) {
      result += nums[i];
      if (i<nums.length-1) {
        result += nums[i] + ", ";
      }
    }
    return result
  }

  public static int[] returnCopy(int[]ary) {
    int[] aryCopy = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      aryCopy[i] = ary[i];
    }
    return aryCopy;
  }



//test cases
  public static void (String[] args){
    int[] ary = {1,2,3,4};
    System.out.print(returnCopy(ary));
    int[] ary = {};
    System.out.print(returnCopy(ary));
  }
}
