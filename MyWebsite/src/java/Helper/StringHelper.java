/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/**
 *
 * @author Zia Shafira
 */
public class StringHelper {
    public static String parseLikeQuery(String query) {
        return "%" + query + "%";
    }
    public static String modifyDateIntoDatepicker(String expired) {
        String[] splitted = expired.split("-");
        expired = splitted[1] + "/" + splitted[2] + "/" +  splitted[0] ;
        
        return expired;
    }
}
