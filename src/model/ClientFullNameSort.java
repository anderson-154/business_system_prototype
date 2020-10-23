package model;

import java.util.Comparator;

public class ClientFullNameSort implements Comparator<Client>{

	/**
	 * method compare
	 * @param cl1, Client cl1!=null
	 * @param cl2, Client cl2!=null
	 */
	
	@Override
	public int compare(Client cl1, Client cl2) {
		
		int comparator;
		String name1 = cl1.getNameClient();
		String name2 = cl1.getNameClient();
		String lname1 = cl2.getLastNameClient();
		String lname2 = cl2.getLastNameClient();
		
		if(lname1.compareTo(lname2)<0) {
			comparator = -1;
		}else if(lname1.compareTo(lname2)>0) {
			comparator = 1;
		}else {
			if(name1.compareTo(name2)<0) {
				comparator = -1;
			}else if(name1.compareTo(name2)>0) {
				comparator = 1;
			}else {
				comparator = 0;
			}
		}
		return comparator;
	}

}
