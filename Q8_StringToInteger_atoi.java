package Solution;

public class Q8_StringToInteger_atoi{
    
    
    // fucked up solution,does not pass test case "+-2":
    // public int myAtoi(String str) {
        
    //     str=str.trim();
    //     if(str.equals("") || str.equals("-") || str.equals("+")){
    //         return 0;
    //     }
    //     String tmp=str.split(" ")[0];
        
    //     int initial=(int)tmp.charAt(0);
    //     String val="";
    //     if(tmp.contains(".")){
    //         val=tmp.split("\\.")[0];
    //     }else{
    //         val=tmp;
    //     }
               
    //     int ans=0;
    //     if(initial==45){
    //         try{
    //             ans=Integer.parseInt(val);
    //         }catch(NumberFormatException e){
    //             ans=Integer.MIN_VALUE;
    //         }
    //     }else if((initial < 48 || initial > 57) && initial!=43){
    //         return 0;
    //     }else{
    //         try{
    //             ans=Integer.parseInt(val);
    //         }catch(NumberFormatException e){
    //             ans=Integer.MAX_VALUE;
    //         }
    //     }
    //     return ans;
    // }
}