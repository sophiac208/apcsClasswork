public class ArrayMethods {
  // Sophia Chen (sophiac208@nycstudents.net) & Aiden Decatur (aidend39@nycstudents.net)
  public static void main(String[] args) {
    new int[][] ary1 = new int[][] {{3,2,1}, {9,8,7}, {6,5,4}};
    System.out.println(arrToString(ary1));
    ary1 = new int[][] {{}, {3,4,6}, {3,2}};
  }


  public static String aryToString(int[] nums) {
    String result = "";
    for (int i = 0; i< nums.length; i++) {
      result += nums[i];
      if (i<nums.length-1) {
        result += nums[i] + ", ";
      }
    }
    return result;
  }

  public static String arrToString(int[][]ary){
  //this method should call arrToString(int[])
  String result = "[";
  for (int i =0; i < ary.length; i++){
    result += arrToString(ary[i]) + ", ";
  }
  return result + "]";

}
