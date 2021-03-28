package lu.uni.mad.shoppinglist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final int TEXT_REQUEST = 1;

    private TextView item1;
    private TextView item2;
    private TextView item3;
    private TextView item4;
    private TextView item5;
    private TextView item6;
    private TextView item7;
    private TextView item8;
    private TextView item9;
    private TextView item10;

    private boolean inserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "onCreate");

        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);
        item4 = findViewById(R.id.item4);
        item5 = findViewById(R.id.item5);
        item6 = findViewById(R.id.item6);
        item7 = findViewById(R.id.item7);
        item8 = findViewById(R.id.item8);
        item9 = findViewById(R.id.item9);
        item10 = findViewById(R.id.item10);

        if(savedInstanceState != null) {
            item1.setText(savedInstanceState.getString("item1_text"));
            item2.setText(savedInstanceState.getString("item2_text"));
            item3.setText(savedInstanceState.getString("item3_text"));
            item4.setText(savedInstanceState.getString("item4_text"));
            item5.setText(savedInstanceState.getString("item5_text"));
            item6.setText(savedInstanceState.getString("item6_text"));
            item7.setText(savedInstanceState.getString("item7_text"));
            item8.setText(savedInstanceState.getString("item8_text"));
            item9.setText(savedInstanceState.getString("item9_text"));
            item10.setText(savedInstanceState.getString("item10_text"));
        }
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {

                inserted = false;

                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                Log.d(LOG_TAG, "Reply received " + reply);

                if(item1.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item1 is empty");
                    item1.setText(reply);
                    inserted = true;

                }
                if(item2.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item2 is empty");
                    item2.setText(reply);
                    inserted = true;
                }
                if(item3.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item3 is empty");
                    item3.setText(reply);
                    inserted = true;
                }
                if(item4.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item4 is empty");
                    item4.setText(reply);
                    inserted = true;
                }
                if(item5.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item5 is empty");
                    item5.setText(reply);
                    inserted = true;
                }
                if(item6.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item6 is empty");
                    item6.setText(reply);
                    inserted = true;
                }
                if(item7.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item7 is empty");
                    item7.setText(reply);
                    inserted = true;
                }
                if(item8.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item8 is empty");
                    item8.setText(reply);
                    inserted = true;
                }
                if(item9.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item9 is empty");
                    item9.setText(reply);
                    inserted = true;
                }
                if(item10.getText().toString().equals("") && inserted == false) {
                    Log.d(LOG_TAG, "Item10 is empty");
                    item10.setText(reply);
                    inserted = true;
                }

            }
        }
    }

    //Too save the Instance state
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (!item1.getText().toString().equals("")) {
            outState.putString("item1_text",item1.getText().toString());
        }
        if (!item2.getText().toString().equals("")) {
            outState.putString("item2_text",item2.getText().toString());
        }
        if (!item3.getText().toString().equals("")) {
            outState.putString("item3_text",item3.getText().toString());
        }
        if (!item4.getText().toString().equals("")) {
            outState.putString("item4_text",item4.getText().toString());
        }
        if (!item5.getText().toString().equals("")) {
            outState.putString("item5_text",item5.getText().toString());
        }
        if (!item6.getText().toString().equals("")) {
            outState.putString("item6_text",item6.getText().toString());
        }
        if (!item7.getText().toString().equals("")) {
            outState.putString("item7_text",item7.getText().toString());
        }
        if (!item8.getText().toString().equals("")) {
            outState.putString("item8_text",item8.getText().toString());
        }
        if (!item9.getText().toString().equals("")) {
            outState.putString("item9_text",item9.getText().toString());
        }
        if (!item10.getText().toString().equals("")) {
            outState.putString("item10_text",item10.getText().toString());
        }
    }

}