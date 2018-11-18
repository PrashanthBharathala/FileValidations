package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class Validation {

	public List splitFileName(String filename) {
		List list = new ArrayList<>();
		String file1 = filename.replace(".", "_");
		System.out.println(file1);
		String[] strarray = file1.split("_");

		for (int i = 0; i < strarray.length; i++) {
			if (i != strarray.length - 1) {
				list.add(strarray[i]);

			}
			System.out.println(strarray[i]);
		}
		System.out.println(list);

		return list;
	}

	public boolean checkFileName(String checksum, List list,int index) {

		String[] check = checksum.split(",");
		if (list.get(0).equals(check[index]))
			return true;
		else
			return false;

	}
	
	public boolean dateValidation(String checksum, List list)
	{
		return false;
		
	}
	
	public int sum1(BufferedReader br,int index) throws NumberFormatException, IOException
	{
		int sum=0;
		String line=null;
		while ((line = br.readLine()) != null) {
		    String tokens[] = line.split(",");
		    for(int i = 0; i <tokens.length; i++)
		    {
		    	System.out.println("hhh");
		    	if(i==tokens.length-1){
		       sum += Integer.parseInt(tokens[index]);
		    	}
		    }
		    
		 }
		return sum;
		
	}
	
	public boolean sumvalidation(int sum,String checksum){
		String[] check = checksum.split(",");
		if(sum==Integer.parseInt(check[6]))
		return true;
		else return false;
	}
	
	

	
}
