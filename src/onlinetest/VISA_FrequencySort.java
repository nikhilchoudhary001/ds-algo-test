package onlinetest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VISA_FrequencySort {

//	public static void main(String[] args) {
//		List<Integer> ans = itemsSort(Arrays.asList(1, 1, 1, 7, 8, 8, 3, 1));
//		System.out.println(ans);
//	}
   public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int itemsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> items = IntStream.range(0, itemsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> result = itemsSort(items);
        System.out.println(result);
        
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(Collectors.toList())
//            + "\n"
//        );

        bufferedReader.close();
        //bufferedWriter.close();
    }
	
    public static List<Integer> itemsSort(List<Integer> items) {
	    
	    Map<Integer,Integer> map = new HashMap<>();
	    List<Integer> res = new ArrayList<>();
	    
	    for(int i : items){
	        //map.putIfAbsent(i,0);
	        map.put(i, map.getOrDefault(i,0) + 1);
	    }
	    
	    // Very interesting logic
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : a - b);
        // OR can also write like this :
//    	PriorityQueue<Integer> pq1 = new PriorityQueue<>((a,b) -> {
//    		if(map.get(a) != map.get(b)) {
//    			return map.get(a) - map.get(b);
//    		}
//        	return a - b;
//        });
        pq.addAll(map.keySet());
        
        while(!pq.isEmpty()){
            int ch = pq.poll();
            int t = map.get(ch);
            for(int i = 0; i < t; i++){
                res.add(ch);
            }
        }
	    // for(Map.Entry<Integer,Integer> m : map.entrySet()){
	    //     System.out.println(m.getKey() + " " + m.getValue());
	    // }
	    
	    return res;

	}

}
