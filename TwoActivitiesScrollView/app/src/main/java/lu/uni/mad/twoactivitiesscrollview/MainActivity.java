package lu.uni.mad.twoactivitiesscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String TITLE = "lu.uni.mad.twoactivitiesscrollview.extra.TITLE";
    public static final String SUBTITLE = "lu.uni.mad.twoactivitiesscrollview.extra.SUBTITLE";
    public static final String ARTICLE = "lu.uni.mad.twoactivitiesscrollview.extra.ARTICLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "onCreate");
    }

    public void SecondActivity(View view) {
        String title;
        String subtitle;
        String article;

        switch(view.getId()) {
            case R.id.text_one:
                Log.d(LOG_TAG, "Button one clicked");
                title = getString(R.string.text_one_title);
                subtitle = getString(R.string.text_one_subtitle);
                article = getString(R.string.text_one_article);
            break;
            case R.id.text_two:
                Log.d(LOG_TAG, "Button two clicked");
                title = getString(R.string.text_two_title);
                subtitle = getString(R.string.text_two_subtitle);
                article = getString(R.string.text_two_article);
            break;
            case R.id.text_three:
                Log.d(LOG_TAG, "Button three clicked");
                title = getString(R.string.text_three_title);
                subtitle = getString(R.string.text_three_subtitle);
                article = getString(R.string.text_three_article);
            break;
            default:
                throw new RuntimeException("Unknown button ID");
        }

        Log.d(LOG_TAG, "Title: " + title + "; Subtitle: " + subtitle + "; Article: " + article);

        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra(TITLE, title);
        intent.putExtra(SUBTITLE, subtitle);
        intent.putExtra(ARTICLE, article);

        startActivity(intent);
    }


}