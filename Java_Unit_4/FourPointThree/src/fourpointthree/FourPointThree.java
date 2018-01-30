
package fourpointthree;

public class FourPointThree {

    public static void main(String[] args) {
        int i = 0,k = 1,a = 2,j = 3;
        
        // 1.
        if(i == 0){
            if(j < 0){
                a = 0;
            }
            else {
                if(k == 1){
                    a = 1;
                }
            }
        }
        else a = 2;
        
        // 2.
        if(i == 0){
            a = 0;
            if(j == 0) a = 1;
            else if(k == 0){
                a = 2;
                if(k < 0) a = 3;}
        }
    }
    
}
