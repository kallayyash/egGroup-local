package com.eggroup;

import com.facebook.react.ReactActivity;
import org.devio.rn.splashscreen.SplashScreen; // import this
import android.os.Bundle; // import this
import net.hockeyapp.android.CrashManager;
import android.content.Intent;

public class MainActivity extends ReactActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.show(this);  // here
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
      super.onResume();
      checkForCrashes();
    }
    private void checkForCrashes() {
        CrashManager.register(this);
    }

    @Override
    public void onNewIntent (Intent intent) {
     super.onNewIntent(intent);
       super.setIntent(intent);
    }

    @Override
    protected String getMainComponentName() {
        return "egGroup";
    }
}
