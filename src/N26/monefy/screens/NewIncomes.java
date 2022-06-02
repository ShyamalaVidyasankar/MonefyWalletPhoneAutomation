package N26.monefy.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NewIncomes {
    public AndroidElement categoryButton;

    public NewIncomes(AndroidDriver<AndroidElement> driver){
        categoryButton = driver.findElementById("com.monefy.app.lite:id/textViewChooseCategory");

    }

}
