class recursion{
    public static void main(String[] args) {
        int n = 20;
        int num1 = 0;
        int num2 = 1;
        for(int i=0 ; i<n ; i++){
            System.out.println(num1);
            int val = num2+num1;
            num1 = num2;
            num2 = val;
        }
    }
}