class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder("");
        String[] words = title.split(" ");

        for(String w : words){
            if(w.length()<=2){
                sb.append(w.toLowerCase());
            }
            else{
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}
