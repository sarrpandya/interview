package leetcode_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 
  
 
public abstract class Nested_List_Weight_Sum {
	
	
	@SuppressWarnings("unchecked")
	public static int findSumByWt(ArrayList<Object> nl, int depth,int sum){
		
		for(int i=0;i<nl.size();i++){
			Object obj=nl.get(i);
			if(obj instanceof List){
				sum=findSumByWt((ArrayList<Object>)obj, (depth+1),sum);
			}
			if(obj instanceof Integer){
				sum+=((int)obj*depth);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> nl = new ArrayList<Object>();
		nl.add( new ArrayList<Integer>(Arrays.asList(new Integer[] {1,1})));
		nl.add(2);
		nl.add( new ArrayList<Integer>(Arrays.asList(new Integer[] {1,1})));
		
		System.out.println(Nested_List_Weight_Sum.findSumByWt(nl,1,0));
		
	    
	}

	}


