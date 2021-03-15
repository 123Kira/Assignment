public class Sum {

    public void sum(int n,int sum){

        for(int i= 1; i<=n; i++){
            sum = sum + i;

        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        int sum = 0, n = 10;
        Sum s = new Sum();
        s.sum(n,sum);

    }
}
