public class CountBitsFlip{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int cnt=0;
        int res=a^b;
        while(res!=0){
            cnt+=res&1;
            res>>=1;
        }
        return cnt;
    } 
} 
class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int cnt=0;
        int res=a^b;
        while(res!=0){
            cnt+=res&1;
            res>>=1;
        }
        return cnt;
    }
    public static int countSetBits(int n){
    
        // Your code here
        if(n==0){
            return 0;
        }
        int x=largerPowerOf2(n);
        int y=x*(1<<(x-1));
        int z=n-(1<<x);
        return y+z+1+countSetBits(z);
       
    }
    public static int largerPowerOf2(int n){
        int x=0;
        while((1<<x)<=n){
            x++;
        }
        return x-1;
    }
}
