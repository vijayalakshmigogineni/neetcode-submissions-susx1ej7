class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        //Method 1
        //char[] arr1 = s.toCharArray();
        //char[] arr2 = t.toCharArray();
        //Arrays.sort(arr1);
        //Arrays.sort(arr2);
       // String sorted1 = new String(arr1);
        //String sorted2 = new String(arr2);
        //if(sorted1.equals(sorted2)){
        //    return true;
        //}
        //return false;

        //Method2
        HashMap<Character,Integer> map1 = new HashMap<>();
         

        for(int i = 0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)-1);
        }

        for(int value:map1.values()){
            if(value!=0){
                return false;
            }
        }
        return true;




        


    }
}
