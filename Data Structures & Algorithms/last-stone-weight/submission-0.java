class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
        while(pq.size()>1)
        {
            int el1 = pq.poll();
            int el2 = pq.poll();
            if(el1!=el2)
            {
                pq.add(el1-el2);
            }
        }
        return pq.isEmpty()?0:pq.poll();
    
    }
}
