import java.util.ArrayList;


/**
 * Write a description of class Tweet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Tweet {
    private String body;
    private String handle;
    private String[] body2;
    
    public Tweet(String body, String handle) {
        if (body.length() > 140) {
            this.body = body.substring(0, 140);
        } else {
            this.body = body;
        }
        this.handle = "@" + handle;
    }
    
    public String getBody() {
        return body;
    }
    
    public String getHandle() {
        return handle;
    }
    
    public String getAllRecipients() {
        String returnStr = "";
        String b = body;
        
        while(b.indexOf("@")) {
            if (b.indexOf("") != -1) {
                returnStr += b.substring();
            } else {
                
            }
        }
    }
    
    public String getAllHashtags() {
        return #;
    }
    
    public String toString() {
        return handle + " : " + body;
    }
}