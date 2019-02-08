


public class NumberUtilities {

    public static String getRange(int stop) {
        
        String result = "";
        
        for( int i = 0; i < stop; i++){
           result = result + i;
        }
        
        return result;
    }

    public static String getRange(int start, int stop) {

        String result = "";
        
        for( int i = start; i < stop; i++){
           result = result + i;
        }
        
        return result;
    }


    public static String getRange(int start, int stop, int step) {
       
        String result = "";
        
        for( int i = start; i < stop; i +=step){
           result = result + i;
        }
        
        return result;
            
    }

    public static String getEvenNumbers(int start, int stop) {
          String result = "";
        
        if(start%2==0) {
            for( int i = start; i < stop; i += 2){
                result = result + i;
                System.out.println("This is :" + i);
            }
        } else { 
            for( int i = (start+1); i < stop; i += 2){
                result = result + i;
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
          String result = "";
        
        if(start%2!=0) {
            for( int i = start; i < stop; i += 2){
                result = result + i;
                System.out.println("This is :" + i);
            }
        } else { 
            for( int i = (start-1); i < stop; i += 2){
                result = result + i;
            }
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String result = "";
        
        for( double i = start; i <= stop; i++){
            
            double exponent2 = (double)exponent;
            double calc = Math.pow(i,exponent2);
            int a = (int)calc;
            result = result + a;
        }

        return result;
    }
}
