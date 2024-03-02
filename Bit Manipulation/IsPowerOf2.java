class IsPowerOf2{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n<=0){
            return false;
        }
        return (n&(n-1))==0;
    }
    public static boolean isPowerofTwo2(long n){
        
        // Your code here
        
        //return (n!=0) && (n&(n-1))==0;
        if(n==0){
            return false;
        }
        while(n%2==0)
        {
            n/=2;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
        
    }
}
