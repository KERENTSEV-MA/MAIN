import java.util.*;
import java.util.stream.Collectors;


public class Main
{
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,1,4,4,7,9,4));
		List<Integer> ans = nums.stream()
		                        .distinct()
		                        .collect(Collectors.toList());
		
		
        System.out.println(ans);
	}
}
