package org.study.banners;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: CoYe
 * Date: 21.06.13
 * Time: 11:40
 * To change this template use File | Settings | File Templates.
 */
public class MixedBanners implements BannersArray {
    public String[] getBannersArray(String[] bannersArray){
        String[] resultArray;
        resultArray = bannersArray;
        Collections .shuffle(Arrays.asList(resultArray));
        resultArray = bannersArray;
                //bannersArray .;
        return resultArray;
    }
}
