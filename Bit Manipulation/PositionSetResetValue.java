class PositionSetResetValue {
    public static void naiveApproach() {
        int n=11;
        int x=2;
        int pos=0;
        int ans1=0;
        int ans2=0;
        while(n>0){
            x--;
            int d=n&1;
            if(d==1 && x!=0){
                ans1+=1<<pos;
                ans2+=1<<pos;
            }
            if(x==0){
                System.out.println(d);
                ans1+=1<<pos;
            }
            n>>=1;
            pos++;
        }
        System.out.println(ans1+" "+ans2);
    }
    public static void simpleApproach() {
            int n=11;
            int x=2;
            int get=0;
            int set=0;
            int clear=0;
            int mask=1<<(x-1);
            if((n&mask)!=0){
                get=1;
            }
            set=n|mask;
            clear=n&(~mask);
            System.out.println(get+" "+set+" "+clear);
    }
}
