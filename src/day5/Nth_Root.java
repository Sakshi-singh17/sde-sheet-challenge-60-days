package day5;
//https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1
public class Nth_Root {
        public int nthRoot(int n, int m) {
            // code here
            if(m==0){
                return 0;
            }

            if(n==1){
                return m;
            }

            int l=1; int h=m;
            while(l<=h){
                int mid = (l+h)/2;

                int value = power(n, mid, m);

                if(value==m){
                    return mid;
                }
                else if(value<m){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            return -1;

        }

        public int power(int n, int base, int m){
            int result = 1;
            for(int i=0; i<n; i++){
                result*=base;

                if(result>m){
                    return result;
                }
            }
            return result;
        }

}
