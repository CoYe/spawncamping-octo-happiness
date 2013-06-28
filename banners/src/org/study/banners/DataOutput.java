package org.study.banners;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: CoYe
 * Date: 21.06.13
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class DataOutput {
    public String[] banners;

    public String[] getBanners() {
        return banners;
    }

    public void setBanners(String[] banners) {
        this.banners = banners;
    }

    public void printBanners(int orientation, int amount){
        if (banners .length >= 0){
            printBannerArray(orientation, amount);
        } else {
            System.out.println("Crap happens");
        }
    }

    private void printBannerArray(int orientation, int amount) {
        boolean isActive = true;
        String result = "";
        int i = 0;
        while (isActive ){
            if (i == banners.length ){
                i = -1;
            }
            if (i == amount){
                System.out.println(result);
                result = "";
                isActive = refreshArray();
            }
            if (result == ""){
                result = banners[i];
            } else {
                if (orientation == 1){
                    result = result + "\n" + banners[i];
                } else {
                    result = result + ", " + banners[i];
                }
            }
            i++;
        }
    }

    private boolean refreshArray(){
        String refresh;
        Scanner input = new Scanner(System .in);
        System.out.println("Refresh (yes/no)");
        refresh = input.nextLine();
        if ("yes".equalsIgnoreCase(refresh)){
            return true;
        } else {
            return false;
        }
    }
}
