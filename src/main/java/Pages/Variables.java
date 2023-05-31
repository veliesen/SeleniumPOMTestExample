package Pages;

import java.nio.charset.Charset;
import java.util.Random;

public class Variables {
    String text;
    String password;
    int intValue;


    public String getGeneratedText() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedText = new String(array, Charset.forName("UTF-8"));
        return this.text=generatedText;
    }
    public String getGeneratedPassword() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedPassword = new String(array, Charset.forName("UTF-8"));
        return this.password=generatedPassword;
    }
    public int getGeneratedInteger(){

        int generatedInteger= (int) Math.floor(Math.random()*10000);

        return this.intValue=generatedInteger;
    }


}
