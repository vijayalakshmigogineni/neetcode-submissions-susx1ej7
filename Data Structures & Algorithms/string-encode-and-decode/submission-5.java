class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String word:strs){
           str.append(word.length()).append("#").append(word);
        }
        return str.toString(); 

    }

    public List<String> decode(String str) {

        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            //read until #
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            //move after #
            j++;
            String st = str.substring(j,j+len);
            strs.add(st);
            

            i = j+len;


        }
        return strs;




    }
}
