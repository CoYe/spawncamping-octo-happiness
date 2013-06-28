package org.study.banners;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Issa
 * Date: 09.06.13
 * Time: 18:11
 * To change this template use File | Settings | File Templates.
 */
public class BannersStorage {
    private String[][] bannersArray = new String[][] {{"Buick","Cadillac","Chevrolet","Chrysler","Dodge","Dodge Ram",
            "Fisker","Ford","Fiat","GMC","Hyundai","Jeep","Kia","Lincoln","Tesla","Nissan","Toyota","Volvo"},
            {"Bianchi","BMC","Corratec","Cannondale","Giant Manufacturing","Hercules","Mongoose","Merida Bikes","Kross","Head","Marin","Kellys"},
            {"KTM","BMW","Minsk","Peugeot","Kawasaki","Harley-Davidson","Yamaha","Suzuki","Honda","Aprilia","Douglas","Ducati",
            "Norton","Royal Enfield","Zenith","Hyosung"},
            {"HP","Dell","Acer","Asus","Packard Bell","BenQ","IBM","Lenovo","LG","Supermicro","Sony"},
            {"HTC","Apple","Samsung","SonyEricsson","Nokia","Siemens","Alcatel","Motorola","BlackBerry"}};

    public String[] bannersTopicsArray = new String[] {"Car", "Bikes", "Moto", "PC", "SmartPhones"};
    private String[] bannerResponseArray;
    private String topic;
    public String[] getBannerArray(String topic){
        String[] result = new String[] {"0"};
        for (int i = 0; i < bannersArray.length; i++){
            if(topic .equalsIgnoreCase(bannersTopicsArray[i])){
                result = bannersArray[i];
            } else if (result == null) {
                Arrays.fill(result,"");
            }
        }
        return result;
    }
}
