package Solution;

public class Q1541_RearrangeWords {
    public String arrangeWords(String text) {

        String[] arr=text.trim().split(" ");

        int[] idx = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            idx[i] = arr[i].length();
        }
        for(int i=1;i<arr.length;i++){

            int key = idx[i];
            String s = arr[i];
            int j = i-1;

            while(j>=0 && idx[j]>key){
                idx[j+1]=idx[j];
                arr[j+1]=arr[j];
                j=j-1;
            }
            idx[j+1]=key;
            arr[j+1]=s;
        }
        StringBuilder ans=new StringBuilder();
        for(String s:arr){
            ans.append(s+" ");
        }
        String ret=ans.toString().toLowerCase();
        String result=ret.substring(0,1).toUpperCase()+ret.substring(1);
        return result.trim();

    }
}
