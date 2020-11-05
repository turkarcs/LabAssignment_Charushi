package Lab_6;
/*
 * @author:Charushi
 * Date:05-11-2020
 * desc:Create a method which accepts an array of numbers
   and returns the numbers and their squares in Hashmap
 * */
	import java.util.*;

	public class SqrtNumber {
		public static void main(String[] args) {
			int sqrtNum[]= {2,4,3,6,7,5,9};
			Map<Integer,Integer> squareNum=getSquares(sqrtNum);
			System.out.println(squareNum);
			
		}

		private static Map<Integer, Integer> getSquares(int[] sqrtNum) {
			
			Map<Integer,Integer> squareMap=new HashMap<>();
			for(int square:sqrtNum) {
				squareMap.put(square,square*square);
			}
			return squareMap;
		}

	}

