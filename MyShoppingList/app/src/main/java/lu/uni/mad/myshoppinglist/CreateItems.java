package lu.uni.mad.myshoppinglist;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

/*
* Create by Eric ROMANG
 */

public class CreateItems extends AppCompatActivity {

    EditText itemName;
    EditText itemDescription;
    EditText itemReferencePrice;
    Button saveItem;

    private static final String TAG = "CreateItems";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_items);

        itemName = findViewById(R.id.item_name);
        itemDescription = findViewById(R.id.item_description);
        itemReferencePrice = findViewById(R.id.item_reference_price);
        saveItem = findViewById(R.id.item_save);

        saveItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO  : Save to the database
                Log.d(TAG, "onClick: itemName: " + itemName.getText().toString());
                Log.d(TAG, "onClick: itemDescription: " + itemDescription.getText().toString());
                Log.d(TAG, "onClick: itemReferencePrice: " + itemReferencePrice.getText().toString());
            }
        });
    }
}
