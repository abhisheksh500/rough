/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Abhishek
 */
public class NewClass {
    public static void main(String[] args) {
        String s1 ="abhi";
        String s2 = "ABHI";
        String s3 = new String("abhi");
        String s4 = "adfs";
        //System.out.println(s1.equals(s3));
        //System.out.println(s1.equals(s2));
        //System.out.println(s1.equalsIgnoreCase(s2));
        //System.out.println(s1==s2);
        //System.out.println(s1==s3);
        //System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s4));
    }
}
