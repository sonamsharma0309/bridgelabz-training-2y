// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class OddEvenNumbers {
   public OddEvenNumbers() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 <= 0) {
         System.out.println("Enter a natural number greater than 0");
      } else {
         for(int var3 = 1; var3 <= var2; ++var3) {
            if (var3 % 2 == 0) {
               System.out.println("" + var3 + " is Even");
            } else {
               System.out.println("" + var3 + " is Odd");
            }
         }

      }
   }

