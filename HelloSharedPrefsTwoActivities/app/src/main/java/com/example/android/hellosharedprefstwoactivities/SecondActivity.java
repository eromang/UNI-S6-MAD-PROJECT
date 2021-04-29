package com.example.android.hellosharedprefstwoactivities;

import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    // mCount for reset only
    private int mCount;

    // Key for color
    private final String COLOR_KEY = "color";

    // SharedPreferences
    private SharedPreferences mPreferences;
    private String sharedPrefFile = "com.example.android.hellosharedprefstwoactivities";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(LOG_TAG, "onCreate");

        // Initialize the shared preferences
        mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);
    }

    /**
     * Store the shared preferences
     */
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.putInt(COLOR_KEY, mColor);
        preferencesEditor.apply();
        Log.d(LOG_TAG, "Store shared preferences");
    }

    /**
     * Handles the onClick for the Reset button. Resets the global count and
     * background variables to the defaults and resets the views to those
     * default values.
     *
     * @param view The view (Button) that was clicked.
     */
    public void resetPreferences(View view) {
        // Reset count
        mCount = 0;
        //mShowCountTextView.setText(String.format("%s", mCount));

        // Reset color
        //mColor = ContextCompat.getColor(this, R.color.default_background);
        // mShowCountTextView.setBackgroundColor(mColor);

        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.apply();
        Log.d(LOG_TAG, "Reset done");
    }

    /**
     * Handles the onClick for the Save button.
     * Add background variables to the defaults and resets the views to those
     * default values.
     *
     * @param view The view (Button) that was clicked.
     */
    public void savePreferences(View view) {
    }
}