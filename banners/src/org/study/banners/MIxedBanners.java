package org.study.banners;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: Issa
 * Date: 28.06.13
 * Time: 19:45
 * To change this template use File | Settings | File Templates.
 */
public class MixedBanners implements BannersArray {
    public String[] getBannersArray(String[] bannersArray){
        String[] resultArray;
        resultArray = bannersArray;
        Collections.shuffle(Arrays.asList(resultArray));
        resultArray = bannersArray;
        //bannersArray .;
        return resultArray;
    }
}
