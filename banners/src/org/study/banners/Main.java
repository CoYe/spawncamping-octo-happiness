package org.study.banners;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        String topicQuery;
        int sortingType;
        System.out.println("Enter Required Topic:");
        Arrays .deepToString(BannersStorage .bannersTopicsArray );
        Scanner input = new Scanner(System .in);
        topicQuery = input .nextLine();
        System.out.println("Select printout type: by default - normal, 1 - mixed, 2 - sorted");
        sortingType = input.nextInt();
        switch(sortingType){
            case (1):
                getMixedBannersArray(topicQuery);
                break;
            case (2):
                getSortedBannersArray(topicQuery);
                break;
            default:
                getNormalBannersArray(topicQuery);
                break;
        }

    }

    private static void getMixedBannersArray(String topic){

    }

    private static void getSortedBannersArray(String topic){

    }

    private static void getNormalBannersArray(String topic){

    }
}
