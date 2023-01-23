public class large{
    public static void main(String[] args){
        int[] aList =  {1, 34, 75, 34, 90, 45, 3, 87, 98, 86};

        int maxNo = aList[0];

        for(int i = 0; i < aList.length; i++){
            if(aList[i] > maxNo){
                maxNo = aList[i];
            }
        }
        System.out.println(maxNo);
    }
}    
