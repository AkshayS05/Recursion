public class StringPrime {
    public static String PrimeTime(int num) {
        if(num<=1){
            return "false";
        }
        int i=2;
        String isPrime= "true";
        while(i*i<=num){
            if(num%i==0){
                isPrime= "false";
                return isPrime;
            }
            i++;
        }
        if(i*i>num){
            isPrime= "true";
        }else{
            isPrime="false";
        }
        return isPrime;
    }
    public static void main(String[] args) {
        int num= 110;
        System.out.println(PrimeTime(num));

    }
}
