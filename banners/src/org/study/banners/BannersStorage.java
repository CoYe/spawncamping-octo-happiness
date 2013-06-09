package org.study.banners;

/**
 * Created with IntelliJ IDEA.
 * User: Issa
 * Date: 09.06.13
 * Time: 18:11
 * To change this template use File | Settings | File Templates.
 */
public class BannersStorage {
    private String[][] bannersArray = new String[5][5];
    private String[] bannersTopicsArray = new String[] {"Car", "Bikes", "Moto", "PC", "Phones"};


    public void populateBannersArray(String source){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                bannersArray[i][j] = String .valueOf(i+j);
                if (i == 0){
                    bannersArray[i][j] =  bannersTopicsArray[j];
                }
                System.out.println(bannersArray[i][j]);
            }
        }
    }
}
