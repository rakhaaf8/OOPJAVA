//it just latihan for utp

import java.io.*;
import java.util.*;

public class test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int banyakpedagang = input.nextInt();
    int[] Di = new int[19];

    if (banyakpedagang >= 2 && banyakpedagang <= 20) {
      for (int i = 0; i < banyakpedagang; i++) {
        Di[i] = input.nextInt();
      }

      int hariBerikut = Di[0]; //2
      for (int i = 0; i < banyakpedagang; i++) {
        int a;
        if (hariBerikut > Di[i]) {
          a = hariBerikut;
        } else {
          a = Di[i];
        }
        while (true) {
          if (a % hariBerikut == 0 && a % Di[i] == 0) {
            hariBerikut = a;
            break;
          }
          a++;
        }
      }
      System.out.println(hariBerikut);
    }
  }

}