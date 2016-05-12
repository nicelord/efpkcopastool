/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfp;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class ReadFP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String line = "010.000-16.89534156     01-MAR-2016  216001052   756026                                 TEAM SPREADING KN                               36,772                0                 0           36,772             3,677           40,449";
        //String line = "010.000-16.89533724     01-MAR-2016  116007514   389824                                 TK. LIAK CUA (JAYA)                         11,321,520                0                 0       11,321,520         1,132,152       12,453,672";
//        String[] split = line.split("                 0");
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(i + " - " + split[i].split(" ")[4]);
//        }

        System.out.println(line.substring(195, 213).trim().replace(",", ""));

    }

}
