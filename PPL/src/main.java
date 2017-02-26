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
        
        
	public void match(generateboy []boy, generateGirl []gal) throws IOException
        {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("output.txt")); //created in the current directory, no path specs reqd
                
                       // j = 0;
            int i,j;
            for(i=0;i<25;i++)
            {
                //System.out.println("hh");
                for ( j=0; 100>j; j++)
                {
                    out.writeBytes("Matching "+gal[i].name+" with"+boy[j].name+System.lineSeparator());
			if ( boy[j].committed == false && gal[i].maintainance <= boy[j].budget && boy[j].criterion<=gal[i].criterion ) 
                        {
				gal[i].bf = boy[j].name;
				gal[i].committed = true;
				boy[j].gf = gal[i].name;
				boy[j].committed = true;
                                //System.out.println(gal[i].name+" matched with "+boy[j].name+" on "+LocalDate.now()+" "+LocalTime.now()+System.lineSeparator());
                                        out.writeBytes(gal[i].name+" matched with "+boy[j].name+" on "+LocalDate.now()+" "+LocalTime.now()+System.lineSeparator());
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
            createcsv test = new createcsv();
                test.make(100,25,3);
		int numb = 131, numg = 101, k = 0, z = 0; 
		generateboy boy[] = new generateboy[numb];
		generateGirl gal[] = new generateGirl[numg];		
                main testfile = new main();		
		List<String> boys = testfile.readFile("boysdata1.txt"); 
		Object arr_boy[] = boys.toArray(); 
            for (Object arr_boy1 : arr_boy) {
                String str = arr_boy1.toString(); 
              if (str.length() == 0) {	
                    continue;
                }
                String strarr[] = str.split(",");
                boy[k] = new generateboy(strarr);
                k = k+1;
            }
		
		
		List<String> girls = testfile.readFile("girlsdata1.txt"); 
		Object arr_gal[] = girls.toArray();
            for (Object arrg1 : arr_gal) {
                String str = arrg1.toString();
                if (str.length() == 0) {
                    continue;
                }
                String strarr[] = str.split(",");
                gal[z] = new generateGirl(strarr);
                z=z+1;
            }
		testfile.match(boy,gal);

	}
}
    

