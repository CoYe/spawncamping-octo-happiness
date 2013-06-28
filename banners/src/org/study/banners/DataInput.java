package org.study.banners;

import java.util.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: CoYe
 * Date: 21.06.13
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class DataInput {
    DataOutput dataOutput = new DataOutput() ;
    String[] result;

    public void showUserSelect() {
        BannersStorage bannersStorage = new BannersStorage();
        String topicQuery;
        int arrayOutputType;
        int bannersOrientation;
        int amountOfBanners;
        String[] bannersArray;

        System.out.println("Enter one of the following topics:\n" + Arrays .deepToString(bannersStorage.bannersTopicsArray) );
        Scanner input = new Scanner(System.in);
        topicQuery = input.nextLine();
        System.out.println("Select printout type: by default - normal, 1 - mixed, 2 - sorted");
        arrayOutputType = input.nextInt();
        System.out.println("Choose orientation of banners array (1 - Vertical; default - Horizontal):");
        bannersOrientation  = input.nextInt();
        System.out.println("Choose amount of banners:");
        amountOfBanners = input.nextInt();
        bannersArray = bannersStorage.getBannerArray(topicQuery);
        if (arrayOutputType == 1){
            getMixedBannersArray(bannersArray);
        } else if (arrayOutputType == 2){
            getSortedBannersArray(bannersArray);
        } else {
            getNormalBannersArray(bannersArray);
        }
        dataOutput.setBanners(result);
        dataOutput.printBanners(amountOfBanners,bannersOrientation) ;
    }

    private void getMixedBannersArray(String[] bannersArray) {
        MixedBanners mixedBanners = new MixedBanners();
        result = mixedBanners.getBannersArray(bannersArray);
    }

    private void getSortedBannersArray(String[] bannersArray) {
        SortedBanners sortedBanners = new SortedBanners();
        result = sortedBanners.getBannersArray(bannersArray);
    }

    private void getNormalBannersArray(String[] bannersArray) {
        MixedBanners mixedBanners = new MixedBanners();
        result = mixedBanners.getBannersArray(bannersArray);
    }
}
