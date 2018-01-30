
package fourpointtwo;

public class FourPointTwo {

    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        boolean p = true;
        boolean q = false;
        
        /* 1. */if(p == (x == y)) System.out.println("Show 1");
        /* 2. */if((x < y) != p) System.out.println("Show 2");
        /* 3. */if(p = (x == y)) System.out.println("Show 3");
        /* 4. */if((x != y) == q) System.out.println("Show 4");
        /* 5. ! x == ! y , โอเปอเรเตอร์ ! ใช้กับตัวแปร Integer ไม่ได้ */
        /* 6. */if(!(!(x >=y ))) System.out.println("Show 6");
        /* 7. */ if(p && (!(x == y))) System.out.println("Show 7");
        /* 8. x == p && q , ตัวแปร Integer ไม่สามารถเปรียบเทียบกับ Boolean ได้ */
    }
}
