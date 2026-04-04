class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String word : strs) {
            // Convert string to char array
            char[] arr = word.toCharArray();
            
            // Sort the array
            Arrays.sort(arr);
            
            // Convert back to string
            String key = new String(arr);
            
            // If key not present, create new list
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            // Add original word to list
            map.get(key).add(word);
        }
        
        // Return all values of hashmap
        return new ArrayList<>(map.values());
        
        
    }
}
