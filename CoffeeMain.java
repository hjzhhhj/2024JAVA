package InT;

import java.util.Scanner;

public class CoffeeMain {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("******청춘 커피 자판기입니다.******");
      Box3 b[] = new Box3[3];
      b[0] = new IngradientBox("커피",5);
      b[1] = new IngradientBox("프림",5);
      b[2] = new IngradientBox("설탕",5);
      while(true) {
         for(int i = 0; i < 3; i++) {
            b[i].print();
         }
         System.out.print("1.다방커피    2.설탕커피   3.블랙커피   4.종료 : ");
         int choice = input.nextInt();
         if(choice == 4 ) {
            System.exit(0);
         }
         for(int i = 0; i < 4-choice; i++) {
            if(!b[i].consume()) {
               break;
            }            
            if(choice == 2) {
               choice--;
               i++;
            }
         }
      }
   }
}
abstract class Box3 {
   protected int size;
   public Box3(int size) {
      this.size = size;
   }
   public boolean isEmpty() {
      return size == 0;
   }
   public abstract boolean consume();
   public abstract void print();
}

class IngradientBox extends Box3 {
   String name;
   public IngradientBox(String name, int size) {
      super(size);
      this.name = name;
   }
   public boolean consume() {      
      if(!isEmpty()) {
         size--;
         return true;
      }
      else {
         return false;
      }
   }
   public void print() {
         System.out.println(name + "*****" + size);
   }
}
