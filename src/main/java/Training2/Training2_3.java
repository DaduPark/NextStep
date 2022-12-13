package Training2;

public class Training2_3 {
    public int add(String n){

        if(isBlank(n)){
            return 0;
        }

        String numArray[] = toTextSplit(n);

        return toSum(numArray);
    }

     private boolean isBlank(String text){
         if(text == null || text.trim().isEmpty()){
             return true;
         }

         return false;
     }

    private String[] toTextSplit(String n){
        String splitStandard = ",|:";

        if(n.contains("\n") && n.contains("//")){
            String customString[] = n.split("\n");
            n = customString[1];
            splitStandard = splitStandard + "|" + customString[0].replace("//","");
        }


        return n.split(splitStandard);
    }

    private int toSum(String[] numArray){
        int result = 0;

        for(String numString : numArray) {
            int num = Integer.parseInt(numString);

            checkInt(num);

            result += num;
        }

        return result;
    }

    private void checkInt(int num){
        if (num<0){
            throw new RuntimeException();
        }
    }
}
