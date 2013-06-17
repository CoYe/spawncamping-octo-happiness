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
    public static String[] bannersTopicsArray = new String[] {"Car", "Bikes", "Moto", "PC", "Phones","Palm"};
    private String[] bannerResponseArray;

    private String topic;

    public String[] getBannerArray(String topic){
        String[] result = new String[] {"0"};
        if (verifyArray() == false){
            populateBannersArray();
        }
        for (int i = 0; i < bannersArray.length; i++){
            if(topic .equalsIgnoreCase(bannersArray[0][i])){
                result = bannersArray [i];
            }
        }
        return result;
    }

    private boolean verifyArray(){
        for(int i = 0; i < bannersArray .length ; i++){
            for(int j = 0; j < bannersArray[i].length; j++ ){
                if (bannersArray[i][j].equals(null)){
                    return false;
                }
            }
        }
        return true;
    }

    private void populateBannersArray(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                bannersArray[i][j] = String .valueOf(i+j);
                if (i == 0){
                    bannersArray[i][j] =  bannersTopicsArray[j];
                }
                //System.out.println(bannersArray[i][j]);
            }
        }
        System.out.println(topic);
    }
}
