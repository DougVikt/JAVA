public class teste {
    public static void main(String[] args) {
        int m = 1 ;
        while ( m <= 10){
            
            for(int i = 0 ; i<=10;i++ ){
                 
                System.out.print("\n"+m+" X "+i+" = "+(m*i));
                
                if (i == 10 ){
                    m++;
                }
            }
        }
        
    }
}
