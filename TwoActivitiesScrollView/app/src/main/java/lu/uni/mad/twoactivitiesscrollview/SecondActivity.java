package lu.uni.mad.twoactivitiesscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(LOG_TAG, "onCreate");

        Intent intent = getIntent();
        String title_extra = intent.getStringExtra(MainActivity.TITLE);
        String subtitle_extra = intent.getStringExtra(MainActivity.SUBTITLE);
        String article_extra = intent.getStringExtra(MainActivity.ARTICLE);

        Log.d(LOG_TAG, "Title: " + title_extra + "; Subtitle: " + subtitle_extra + "; Article: " + article_extra);

        TextView article_heading = findViewById(R.id.article_heading);
        TextView article_subheading = findViewById(R.id.article_subheading);
        TextView article = findViewById(R.id.article);

        article_heading.setText(title_extra);
        article_subheading.setText(subtitle_extra);
        article.setText(article_extra);

    }
}