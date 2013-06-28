package org.study.banners;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: CoYe
 * Date: 21.06.13
 * Time: 11:41
 * To change this template use File | Settings | File Templates.
 */
public class SortedBanners implements BannersArray {
    public String[] getBannersArray(String[] bannersArray){
        String[] resultArray;
        resultArray = bannersArray;
        Arrays .sort(resultArray );
        return resultArray;
    }
}
