package com.sample;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String keyin = "";
        while(!keyin.equals("q")){
            System.out.print("c)中文 e)English f)français q)quit：");
            keyin = scanner.next();
            switch(keyin.toLowerCase()){
                case "c":
                    show(new Locale("zh","TW"));
                    break;
                case "e":
                    show(new Locale("en","US"));
                    break;
                case "f":
                    show(new Locale("fr","FR"));
                    break;
                case "q":
                    break;
                default:
                    show(Locale.getDefault());
            }
        }

    }

    private static void show(Locale locale){
        System.out.println("Locale：" + locale.toString());

        ResourceBundle res = ResourceBundle.getBundle("Message", locale);
        System.out.println(res.getString("welcome")+"!"+res.getString("name"));

        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        System.out.println("Date: " + today.format(df));

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        double money = 1_234_567.89;
        System.out.println("Money: " + nf.format(money));
        System.out.println("--------------------");
    }

}