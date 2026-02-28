class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            boolean found = false;
            for(int j=count;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    count=j+1;
                    found = true;
                    break;
                }
            
        }
        if(!found){
            return false;
        }
        }
        
        return true;
        
    }
}
