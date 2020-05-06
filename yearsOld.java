
public class yearsOld {
    public static void main(String[] args) {
        for(int i = 18;i<22;i++) {//É¸Ñ¡
            int a= i*i*i;
            int b= i*i*i*i;
            if((a+"").length()!=4) {
                continue;
            }else if((b+"").length()!=6) {
                continue;
            }
            String s = (a+""+b);
            int[] times = new int[10];
            char[] arr = s.toCharArray();
            for(int k = 0;k<10;k++)
                for(int j = 0;j<10;j++) {
                    if(arr[j] == (k+48)) {
                        times[k]++;//²»ÖØ¸´
                    }
                }
            int l =0;
            for(;l<10;l++) {
                if(times[l]!=1) {
                    break;
                }
            }
            if(l>=10){
                System.out.println("years"+"="+s);
            }
        }
    }
}
