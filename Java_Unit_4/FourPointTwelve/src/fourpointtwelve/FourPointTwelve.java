
package fourpointtwelve;

import java.util.Scanner;

public class FourPointTwelve {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขตัวที่ 1 : ");
        double a = kb.nextDouble();
        System.out.print("ป้อนตัวเลขตัวที่ 2 : ");
        double b = kb.nextDouble();
        System.out.print("ป้อนตัวเลขตัวที่ 3 : ");
        double c = kb.nextDouble();
        
        //การบวก
        if((a + b) == c) System.out.println(a+" + "+b+" = "+c);
        if((b + c) == a) System.out.println(b+" + "+c+" = "+a);
        if((c + a) == b) System.out.println(c+" + "+a+" = "+b);
        
        //การลบ
        if((a - b) == c) System.out.println(a+" - "+b+" = "+c);
        if((b - c) == a) System.out.println(b+" - "+c+" = "+a);
        if((c - a) == b) System.out.println(c+" - "+a+" = "+b);
        
        //การคูณ
        if((a * b) == c) System.out.println(a+" * "+b+" = "+c);
        if((b * c) == a) System.out.println(b+" * "+c+" = "+a);
        if((c * a) == b) System.out.println(c+" * "+a+" = "+b);
        
        //การหาร
        if((a / b) == c) System.out.println(a+" / "+b+" = "+c);
        if((b / c) == a) System.out.println(b+" / "+c+" = "+a);
        if((c / a) == b) System.out.println(c+" / "+a+" = "+b);
    }
}
