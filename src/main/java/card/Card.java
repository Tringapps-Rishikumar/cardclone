package card;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class  Card implements Cloneable {
    public static final Logger l =  Logger.getLogger("points");
    public String holdername;
    public String cardnumber;
    public String expirationdate;
    String name = "aa";
    String number = "1248";
    String date = "12";

    public Card() {
        l.info("\n enter the Holders name,Card Number and Expiration Date :");

        Scanner sc = new Scanner(System.in);
        holdername = sc.next();
        cardnumber = sc.next();
        expirationdate = sc.next();
        l.info("the original card");
        l.log(Level.INFO ,()-> "\n Holders name "+ name);
        l.log(Level.INFO,()->"\n  Card Number "+number);
        l.log(Level.INFO,()->"\n Expiration Date "+date);
    }
    public String cardcheck() {
        if (cardnumber.equals(number)) {
            return "true";
        } else {
            return "false";
        }
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }
}