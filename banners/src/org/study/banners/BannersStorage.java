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
    private String[] bannersTopicsArray = new String[] {"Car", "Bikes", "Moto", "PC", "Phones","Palm"};
    private String[] bannerResponseArray;
    private String topic;

    public String[] getBannerResponseArray() {
        return bannerResponseArray;
    }

    public void setBannerResponseArray(String[] bannerResponseArray) {
        this.bannerResponseArray = bannerResponseArray;
    }

    public void getBannerArray(String source){
        topic = source;
        if (verifyArray() == true){

        }

    }

    public boolean verifyArray(){
        for(int i = 0; i < bannersArray .length ; i++){
            for(int j = 0; j < bannersArray[i].length; j++ ){
                if (bannersArray[i][j].equals(null)){
                    return false;
                }
            }
        }
        return true;
    }

    public void populateBannersArray(){
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
