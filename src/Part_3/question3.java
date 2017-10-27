package Part_3;

import SDES.SDES;

////package Part_3;
////
////public class testbruteforce {
////	
////	public static void main(String[] args){
////		
////		
////		
////		for(int i = 0 ; i <=1 ; i++){
////			for(int i_1 = 0 ; i_1 <=1 ; i_1++){
////				for(int i_2 = 0 ; i_2 <=1 ; i_2++){
////					for(int i_3 = 0 ; i_3 <=1 ; i_3++){
////						for(int i_4 = 0 ; i_4 <=1 ; i_4++){
////							for(int i_5 = 0 ; i_5 <=1 ; i_5++){
////								for(int i_6 = 0 ; i_6 <=1 ; i_6++){
////									for(int i_7= 0 ; i_7 <=1 ; i_7++){
////										System.out.println(i + " " + i_1 + " " + i_2 + " " + 
////															  i_3 + " " + i_4 + " " + i_5 + " " + 
////																 i_6 + " " + i_7);
////									}
////								}
////							}
////						}
////					}
////				}
////			}
////		}
////	}
////}
//
//
//
//import java.io.IOException;
//
public class question3 {

    public static void main(String[] args){
        byte key[] = {0,1,1,1,0,0,1,1,0,1};
        byte[] listofbits = CASCII.Convert("CRYPTOGRAPHY");
        
        for (int i = 0; i < listofbits.length; i++) {
			System.out.print(listofbits[i] + " ");
		}
        
        System.out.println();
        int x = 0;
    	int xx = 8;
    	SDES sdes = new SDES();
    	byte[][] list = new byte[8][8];
        for (int i = 0; i < 8; i++) {
        	String str; 
        	System.out.print("The " + i + " (8bits) : ");
        	byte[] ss = new byte[8];
        	for ( int j = x ; j < xx ; j++) {
        		str = String.valueOf(listofbits[j]);
        		System.out.print(str);
			}
        	System.out.println();
        	x += 8;
        	xx += 8;
		}
		
    }
}









