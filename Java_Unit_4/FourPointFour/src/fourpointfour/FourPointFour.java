
package fourpointfour;

public class FourPointFour {

    public static void main(String[] args) {
        int x = 0;
        
        //1. เป็นเท็จเสมอ
          if (!(x > 0) && (x > 0)) System.out.println("Show 1");
        //2. เป็นจริงเสมอ
          if ((x != 0) || (x == 0)) System.out.println("Show 2");
        //3. ขั้นอยู่กับค่าของ x
          if ((x != 1) && !(x == 1)) System.out.println("Show 3");
        //4. ขั้นอยู่กับค่าของ x
          if ((x > 0) || (x < 0)) System.out.println("Show 4");
        //5. เป็นจริงเสมอ
          if ((x >= 0) || (x < 0)) System.out.println("Show 5");
        //6. ขั้นอยู่กับค่าของ x
          if ((x <= 0) && (x >= 0)) System.out.println("Show 6");
    }
    
}
