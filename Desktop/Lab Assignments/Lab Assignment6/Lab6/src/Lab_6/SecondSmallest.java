package Lab_6;
/*
 * @author:Charushi
 * Date:05-11-2020
 * desc:Create a method which accepts an array of integer elements 
        and return the second smallest element in the array
 * */
	import java.util.*;

	public class SecondSmallest {
		public static void main(String[] args) {
			Integer numArr[]= {5,12,13,15,6};
			int secondSmallestElement=getSecondSmallest(numArr);
			System.out.println("Second Smallest element is : "+secondSmallestElement);
		}

		private static int getSecondSmallest(Integer[] numArr) {
			List<Integer> element=Arrays.asList(numArr);
			Collections.sort(element);
			System.out.println("Sorted Array:\n"+element);
			Integer secondSmallest=element.get(1);
			return secondSmallest;
		}

	}

