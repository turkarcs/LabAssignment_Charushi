package Lab_6;
/*
 * @author:Charushi
 * Date:05-11-2020
 * desc:Voter Details on the basis of eligibility
 * */
import java.util.*;

public class VoterDetails {
	public static void main(String[] args) {
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();
		voterList.put(101, 45);
		voterList.put(102, 25);
		voterList.put(103, 37);
		voterList.put(104, 30);
		List<Integer>voterDetails=votersList(voterList);
		System.out.println(voterDetails);
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterList) {
		List<Integer> voterDetails=new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) {
			if(entry.getValue()>18) {
				voterDetails.add(entry.getKey());
			}
		}
		return voterDetails;
	}

}
