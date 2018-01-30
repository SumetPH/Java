
package fourpointfive; 
import java.util.Scanner;
public class FourPointFive {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[] a = new double[3];
        double max = 0,min = 100,mid = 0,sum = 0;
        System.out.print("ป้อนความยาวด้านที่ 1 : ");
        a[0] = kb.nextDouble();
        System.out.print("ป้อนความยาวด้านที่ 2 : ");
        a[1] = kb.nextDouble();
        System.out.print("ป้อนความยาวด้านที่ 3 : ");
        a[2] = kb.nextDouble();
        
        // หาค่า สูงสุด , ต่ำสุด , และ ปานกลาง
        for(int i = 0; i <= 2; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        for(int i = 0; i <= 2; i++){
            if(a[i] < min && a[i] < max){
                min = a[i];
            }
        }
        for(int i = 0; i <= 2; i++){
            if(a[i] < max && a[i] > min){
                mid = a[i];
            }
        }
        
        // คำนวนความยาวรอบรูปสี่เหลี่ยม
        sum = Math.sqrt(Math.pow(min,2)+Math.pow(mid,2));
        // แสดงผลลัพธ์ที่ได้
        if(sum == max){
            System.out.println("ค่าที่ป้อนเข้ามา "
                    + "สามารถสร้างรูปสามเหลี่ยมมุมฉากได้");
        }
        else{
            System.out.println("ค่าที่ป้อนเข้ามา "
                    + "ไม่สามารถสร้างรูปสามเหลี่ยมมุมฉากได้");
        }
    }
}
