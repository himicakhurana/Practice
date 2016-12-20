
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * Complete the function below.
 */

    static int countPowerNumbers(int l, int r) {
        int count=0;
for(int x=l;x<=r;x++){
    for(int i=0;i<=x;i++){
        boolean found=false;
            for(int j=0;j<=x;j++){

        double p=x-Math.pow(i);
    double q=Math.pow(j);
       int p1=(int)p;
                int q1=(int)q;

        if(p1==q1){
            count++;
            found=true;
            break;
            
        }
    }
        if(found){
            break;
        }
    }
}
return count;
    }

