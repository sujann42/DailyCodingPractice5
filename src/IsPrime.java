public class IsPrime {
    public static void main(String[] args) {
        System.out.println(countPrimes(12));
    }

    public static boolean isPrimeNumber(int num) {

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrimes(int number){
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if(isPrimeNumber(i)){
                count++;
            }
        }
        return count;
    }
}
