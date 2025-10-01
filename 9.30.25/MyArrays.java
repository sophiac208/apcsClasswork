public class MyArrays( {

  // created to display the array contents
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
    // looping through and copying the same number into the new array
    for (int i = 0; i < ary.length; i++) {
      aryCopy[i] = ary[i];
    }
    return aryCopy;
  }

  public static int[] concatArray(int[]ary1,int[]ary2) {
    int [] newAry = new int [ary1.length + ary2.length];
    // looping through the first array and adding it to the new concatenated array
    for (int i = 0; i < ary1.length; i++) {
      newAry[i] = ary1[i];
    }

    // looping through second array and adding it to the first one
    for (int i = 0; i < ary2.length; i++) {
      newAry[ary1.length+i] = ary2[i];
    }
    return newAry;
  }

//test cases
  public static void (String[] args){
    int[] ary = {1,2,3,4};
    System.out.println aryToString(returnCopy(ary));
    int[] ary = {-1,0};
    System.out.println aryToString(returnCopy(ary));
    int[] ary = {};
    System.out.println aryToString(returnCopy(ary));

    int[] ary1 = {1,2,3,4};
    int[] ary2 = {5,6,7,8};
    System.out.println aryToString(concatArray(ary1, ary2));

    int[] ary1 = {};
    int[] ary2 = {};
    System.out.println aryToString(concatArray(ary1, ary2));

    int[] ary1 = {};
    int[] ary2 = {3,4,5};
    System.out.println aryToString(concatArray(ary1, ary2));

  }
}
