package dsNAlgo.sorts;

import java.util.ArrayList;
import java.util.List;

public class Merge_sort {
	
	List<Integer> lst, merged_lst, left_lst, right_lst;
	
	Merge_sort(){
		lst = new ArrayList<Integer>();
		right_lst= new ArrayList<Integer>();
		left_lst= new ArrayList<Integer>();
		merged_lst= new ArrayList<Integer>();
	}
	
	List<Integer> divide(List<Integer> lst){
		//System.out.println("enter divide "+lst.size());
		
		right_lst=lst.subList(lst.size()/2,lst.size());
		left_lst = lst.subList(0,(lst.size()/2));
		
		if(right_lst.size()<=2) {
			merged_lst.clear();
			//System.out.println("enter sort right list "+right_lst.toString());
			merged_lst=sort(right_lst);
			right_lst.clear();
			right_lst=merged_lst;
			//System.out.println("merged_lst "+merged_lst.toString());
			//System.out.println("sorted right list"+right_lst.toString());
		}
		else{
			//System.out.println("enter divide riht list "+right_lst.toString());
			divide(right_lst);
		}
		System.out.println("before left if: "+left_lst.toString());
		if(left_lst.size()<=2) {
			//System.out.println("inside left if: ");
			merged_lst.clear();
			//System.out.println("enter sort left list "+left_lst.toString());
			merged_lst=sort(left_lst);
			left_lst.clear();
			left_lst=merged_lst;
			//System.out.println("merged_lst "+merged_lst.toString());
			//System.out.println("sorted left list "+left_lst.toString());
		}
		else {
			//System.out.println("enter divide left list "+left_lst.toString());
			divide(left_lst);
		}
		//System.out.println("right and left: "+right_lst.toString()+" "+left_lst.toString());
		return sortAndMerge(right_lst,left_lst);
	}
	
	List<Integer> sort(List<Integer> sortLst) {
		//System.out.println("enter sort "+sortLst);
		merged_lst.clear();
		if (sortLst.size()==2) {
			//System.out.println("sort "+sortLst.toString());
			if(sortLst.get(0)>sortLst.get(1)) {
				merged_lst.add(sortLst.get(1));
				merged_lst.add(sortLst.get(0));
				sortLst.clear();
				sortLst=merged_lst;
			}
			else {
				//System.out.println("sortLst1: "+sortLst.toString());
				return sortLst;
				
			}
		}
		//System.out.println("sortLst2: "+sortLst.toString());
			return sortLst;
	}
	
	List<Integer> sortAndMerge(List<Integer> lft_lst, List<Integer> rgt_lst) {
		merged_lst.clear();
		//System.out.println("enter sortandmerge ");
		try {
		if(lft_lst.get(0)>rgt_lst.get(0)) {
			//System.out.println("enter sortandmerge if ");
			 merged_lst=merge(rgt_lst,lft_lst);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
		if(lft_lst.get(0)<rgt_lst.get(0)) { 
			//System.out.println("enter sortandmerge else ");
			merged_lst= merge(lft_lst,rgt_lst);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return merged_lst;
		}
		
	
	List<Integer> merge(List<Integer> first,List<Integer> second) {
		merged_lst.clear();
		//System.out.println("enter merge ");
		merged_lst.addAll(first);
		merged_lst.addAll(second);
		//System.out.println("enter merge "+merged_lst.toString());
		return merged_lst;
	}
	
	void add(int i) {
		//System.out.println(i+"into add ");
		lst.add(i);
	}
	
	String printResult() {
		//System.out.println("enter printResult ");
		return divide(lst).toString();
	}
	
	public static void main(String[] args) {
		Merge_sort mergeSort = new Merge_sort();
		
		for(int i=8;i>0;i--) {
			//System.out.println("add"+i);
			mergeSort.add(i);
		}
		//System.out.println("out of for loop ");
		System.out.println(mergeSort.printResult());
	}
}