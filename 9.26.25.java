
public class ArrayTest{
public static void main(String[]args){
  //1 initialize the array
  //int[] anArray = ???
  int[] anArray = new int[11];

  //2 print the array variable
  System.out.print("part 2: "+ anArray);

  //Part 3 Write the loop to initialize it
  for (int i = 0; i < anArray.length; i++) {
    anArray[i] = 100 + (i *10);
  }

  //Part 4: write a single println statement to print :
  //        anArray[0], anArray[5], and anArray[10]
  System.out.print("part 4: " + anArray[0]+ anArray[5] + anArray[10]);

  //Part 5 Write a loop to print the whole array on one line
  System.out.print("part 5: ");
  for (int i = 0; i < anArray.length; i++) {
    System.out.print(anArray[i]+ " ");
  }
}
}
