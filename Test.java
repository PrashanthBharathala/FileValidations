package com;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
        String line = "";
        String cvsSplitBy = ",";
        
        File f = new File("C:/Users/uday kumar/Desktop/SHCIL_02052017_1000.T02.csv");
        System.out.println(f.getName());
       String filename= f.getName();

        Validation vd=null;
        List list=null;
       
        
        
        BufferedReader br = new BufferedReader(new FileReader(f)) ;
        	
        	String checksum=line=br.readLine();
        	vd=new Validation();
            list=vd.splitFileName(filename);
            boolean bl=vd.checkFileName(checksum, list,1);
            if(bl){
            	System.out.println("sucess");
            }else System.out.println("failure");

            try {
				int sum=vd.sum1(br,5);
				boolean b3=vd.sumvalidation(sum,checksum);
				System.out.println("hi");
				 if(b3){
		            	System.out.println("sucess");
		            }else System.out.println("failure");

			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          /*  while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }*/

        
        
        

	}

}
