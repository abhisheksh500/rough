/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Abhishek
 */
public class calander {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getFirstDayOfWeek());
    }
}
