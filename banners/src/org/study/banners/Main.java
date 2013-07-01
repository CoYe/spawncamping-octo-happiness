package org.study.banners;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        DataInput dataInput = new DataInput();
        DataOutput dataOutput = new DataOutput() ;
        dataInput.showUserSelect();
        int arrayOutputType = dataInput .getArrayOutputType() ;
        String[] bannersArray = dataInput .getBannersArray() ;
        BannersArray bannersArrayInterface;

        if (arrayOutputType == 1){
            bannersArrayInterface = new MixedBanners();
        } else if (arrayOutputType == 2){
            bannersArrayInterface = new SortedBanners();
        } else {
            bannersArrayInterface = new UnsortedBanners();
        }
        String[] result = bannersArrayInterface.getBannersArray(bannersArray);
        dataOutput.setBanners(result);
        dataOutput.printBanners(dataInput.getAmountOfBanners(),dataInput.getBannersOrientation()) ;
    }
}
