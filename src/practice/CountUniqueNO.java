package practice;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountUniqueNO {
	public static void main(String[] args) {
	int[] arr= {1,1,2,4,5,7,5,3,3,7,4};
	Map<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					 count = count+1;
					map.put(arr[i], count);
					arr[j]=-1;
				}else if(arr.length==j+1 && count==1) {
					map.put(arr[i], count);
				}
			}
		}
		List<Entry<Integer, Integer>> collect2 = map.entrySet().stream().filter(entry -> entry.getValue()==1)
				                                 .collect(Collectors.toList());
		
		Integer collect = map.entrySet().stream().filter(entry -> entry.getValue()==1)
				                                .map(Map.Entry::getKey).findFirst().orElse(null);
 	System.out.println(collect2);
 	
	Map<Integer, Integer> hmap = new HashMap<>();
	for (Integer arr1 : arr) {
		hmap.put(arr1, hmap.getOrDefault(arr1, 0) + 1);
	}
	for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
		if (entry.getValue() == 1) {
//			System.out.println("unique no " + entry.getKey());
		}
	}
	
	
}
}
