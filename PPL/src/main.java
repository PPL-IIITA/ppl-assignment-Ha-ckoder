/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sowji
 */
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.*;

public class main {


	

	public void writeFile(String fileName, String data) throws IOException {
		Files.write(Paths.get(fileName), data.getBytes(), StandardOpenOption.CREATE);
        }
        
        //matching pairs
        
        
	public void match(int numb,generateboy boy[], generateGirl gal[],int numg) throws IOException
        {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("output.txt")); 
                
                       // j = 0;
            int i,j;
            for(i=0;i<25;i++)
            {
                //System.out.println("hh");
                for ( j=0; 100>j; j++)
                {
                    out.writeBytes("Matching "+gal[i].name+" with"+boy[j].name+System.lineSeparator());
			if ( boy[j].committed == false && gal[i].maintenance <= boy[j].budget && boy[j].criterion<=gal[i].criterion ) 
                        {
				gal[i].bf = boy[j].name;
				gal[i].committed = true;
				boy[j].gf = gal[i].name;
				boy[j].committed = true;
                     
                                        out.writeBytes("Match found : "+gal[i].name+" matched with "+boy[j].name+System.lineSeparator());
			//System.out.println(i);
                                break;
			} 
                       
                }
                if(j!=99) {
                    } else {            
                    out.writeBytes("No Matchfound for "+gal[i].name+System.lineSeparator());
                    }            
            }
            
            
	}
        
        public List<String> readFile(String file) throws IOException {
		List<String> data = Files.readAllLines(Paths.get(file));
		return data;
	}

        
	public static void main(String args[]) throws IOException {
            generatefile test = new generatefile();
                test.createfile(100,25);
		int numb = 131, numg = 101;
                 
		generateboy boy[] = new generateboy[numb];
		generateGirl gal[] = new generateGirl[numg];		
                main testfile = new main();		
		List<String> boys = testfile.readFile("boysdata1.txt"); 
		Object boyarr[] = boys.toArray();
                int m = 0, n = 0;
            for (Object boy1 : boyarr) {
                String array = boy1.toString(); 
              if (array.length() == 0) {	
                    continue;
                }
                String arr1[] = array.split(",");
                boy[m] = new generateboy(arr1);
                m = m+1;
            }
		
		
		List<String> girllist = testfile.readFile("girlsdata1.txt"); 
		Object galarr[] = girllist.toArray();
            for (Object arrg1 : galarr) {
                String a = arrg1.toString();
                if (a.length() == 0) {
                    continue;
                }
                String stringarr[] = a.split(",");
                gal[n] = new generateGirl(stringarr);
                n=n+1;
            }
		testfile.match(numb,boy,gal,numg);
                
	}
}
    

