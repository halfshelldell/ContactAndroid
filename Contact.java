package ironyard.com.contactandroid;

/**
 * Created by illladell on 6/1/16.
 */
public class Contact {

    String text;
    String phoneText;

    public Contact(String text, String phoneText) {
        this.text = text;
        this.phoneText = phoneText;
    }

    @Override
    public String toString() {
        return text + ", " + phoneText;
    }
}
