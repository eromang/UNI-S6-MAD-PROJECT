package lu.uni.mad.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    public static final String EXTRA_REPLY = "lu.uni.mad.shoppinglist.extra.REPLY";

    private String mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(LOG_TAG, "onCreate");

        Intent intent = getIntent();
    }

    public void returnReply(View view) {

        switch(view.getId()) {
            case R.id.cheese_button:
                Log.d(LOG_TAG, "Cheese one clicked");
                mReply = "Cheese";
                break;
            case R.id.rice_button:
                Log.d(LOG_TAG, "Rice two clicked");
                mReply = "Rice";
                break;
            case R.id.apples_button:
                Log.d(LOG_TAG, "Apples three clicked");
                mReply = "Apples";
                break;
            case R.id.oranges_button:
                Log.d(LOG_TAG, "Oranges three clicked");
                mReply = "Oranges";
                break;
            case R.id.kimchi_button:
                Log.d(LOG_TAG, "Kimchi three clicked");
                mReply = "Kimchi";
                break;
            case R.id.cola_button:
                Log.d(LOG_TAG, "Cola three clicked");
                mReply = "Cola";
                break;
            case R.id.the_button:
                Log.d(LOG_TAG, "The the clicked");
                mReply = "The";
                break;
            case R.id.milk_button:
                Log.d(LOG_TAG, "Milk three clicked");
                mReply = "Milk";
                break;
            case R.id.water_button:
                Log.d(LOG_TAG, "Water three clicked");
                mReply = "Water";
                break;
            case R.id.flowers_button:
                Log.d(LOG_TAG, "Flowers three clicked");
                mReply = "Flowers";
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }

        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, mReply);
        setResult(RESULT_OK,replyIntent);
        Log.d(LOG_TAG, "End SecondActivity");
        finish();
    }
}