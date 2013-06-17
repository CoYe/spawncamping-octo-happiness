package org.study.banners;

/**
 * Created with IntelliJ IDEA.
 * User: Issa
 * Date: 17.06.13
 * Time: 21:45
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractBannersArrayGetter implements BannersArray {
       public String[] queryBanners;
       public void getArray(String query){
           BannersStorage bannersStorage = new BannersStorage();
           queryBanners  = bannersStorage .getBannerArray(query);
       }
}
