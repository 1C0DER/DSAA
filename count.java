public class count {
    public static void main(String[] args) {

            int n = 123456789;
            int countEven = 0; 
            
            while(n>0){
            if(n%2==0){ 
                countEven++;
            } 
            n = n/10;
            }
            System.out.println("Count Even:"+countEven);
            }
}
