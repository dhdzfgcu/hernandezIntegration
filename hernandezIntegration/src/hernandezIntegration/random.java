package hernandezIntegration;

import java.util.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class random {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    ArrayList<ArrayList<Integer>> array1 = new ArrayList<>();

for(int counter1 = 0; counter1<n; counter1++ ) {
  int d = scan.nextInt();
  ArrayList<Integer> array2 = new ArrayList<Integer>();
  for( int counter2 =0; counter2<d; counter2++) {
    array2.add(scan.nextInt());
  }
}
int q = scan.nextInt();
for(int counter3 = 0; counter3<q; counter3++) {
  int x = scan.nextInt() -1;
  int y = scan.nextInt() -1;
  try {
    System.out.println(array1.get(x).get(y));
  } catch(IndexOutOfBoundsException a){
    System.out.println("ERROR!");
  }
}

  }
}


