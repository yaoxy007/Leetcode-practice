package Solution;

import java.util.Stack;

public class Q71_SimplifyPaths {
    public String simplifyPath(String path) {
        if(path.isEmpty()){
            return path;
        }

        String[] cmd=path.split("/");
        Stack<String> stack=new Stack<String>();
        for(String s: cmd){
            if(s.equals("") ||s.equals(".")){

            }else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.add(s);
            }
        }

        StringBuilder ans=new StringBuilder();
        for(String s: stack){
            ans.append("/");
            ans.append(s);
        }
        return ans.length()>0 ? ans.toString() : "/";
    }
}
