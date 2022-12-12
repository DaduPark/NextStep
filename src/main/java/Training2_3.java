public class Training2_3 {
    int add(String n){

        if(n.trim().isEmpty()){
            return 0;
        }
        String splitStandard = ",|:";

        if(n.contains("\n") && n.contains("//")){
            String customString[] = n.split("\n");
            n = customString[1];
            splitStandard = splitStandard + "|" + customString[0].replace("//","");
        }

        String numArray[] = n.split(splitStandard);

        int result = 0;

        for(String numString : numArray) {
            int num = Integer.parseInt(numString);
            result += num;
        }

        if (result<0){
            throw new RuntimeException();
        }

        return result;
    }
}
