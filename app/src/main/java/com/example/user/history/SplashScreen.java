package com.example.user.history;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class SplashScreen extends Activity {

    // Час в мілісекундах, протягом якого буде відображатися Splash Screen
    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Після закінчення часу, запускаємо головну сторінку(меню), а Splash Screen закриваємо
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}

