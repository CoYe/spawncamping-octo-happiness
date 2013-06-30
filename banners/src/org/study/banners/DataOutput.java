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
    private String[] banners;

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

    private void printBannerArray(int amount, int orientation) {
        boolean isActive = true;
        String result = "";
        int i = 0;
        int j = 0;
        while (isActive ){
            if (i == banners.length ){
                i = 0;
            }
//            System.out.println(amount%i);
            if (j != 0 && j != 1 && j%amount == 0){
                System.out.println(result);
                result = "";
                isActive = refreshArray();
            }
            if ("".equals(result)){
                result = banners[i];
            } else {
                if (orientation == 1){
                    result = result + "\n" + banners[i];
                } else {
                    result = result + ", " + banners[i];
                }
            }
            i++;
            j++;
        }
    }

    private boolean refreshArray(){
        String refresh;
        Scanner input = new Scanner(System .in);
        System.out.println("Refresh (yes/no)");
        refresh = input.nextLine();
        return "yes".equalsIgnoreCase(refresh);
    }
}
