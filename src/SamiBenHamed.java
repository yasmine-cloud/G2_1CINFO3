public class SamiBenHamed {
    public static int claculFactorierl(int nb ){
        int fact = 1 ;
        if(nb==1 || nb=0 ){
            return 1 ; 
        }
        for (int i=2 ; i<=nb ; i++ ){
            fact = fact * i ; 
        }
        return fact ; 
    }
}