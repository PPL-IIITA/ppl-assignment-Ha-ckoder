/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sowji
 */
public class generateGirl {
   
	String name,bf;
	int attractiveness,iq,criterion;
	double maintenance;
	boolean committed;

	generateGirl(String arr[]) {	
		maintenance = Double.parseDouble(arr[3]);
                criterion = Integer.parseInt(arr[2]);
		
		iq = Integer.parseInt(arr[2]);
                name = arr[0];
                bf = "";
	
		attractiveness = Integer.parseInt(arr[3]);
		
		committed = false;		
		}

	
}
    

