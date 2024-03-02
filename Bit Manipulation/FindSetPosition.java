class FindSetPosition {
    static int findPosition(int N) {
        int pos=0;
        int i=0;
       while(N!=0){
            if((N&1)==1)
                pos++; 
            i++;
            N>>=1;
        }
        if(pos==1){
            return i;
        }
        return -1;
    }
};
