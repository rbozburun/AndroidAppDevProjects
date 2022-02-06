package tr.ceng.mu.edu.tr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {

    static final String[] ANIMALS = new String[]{"Cat", "Dog", "Bird", "Bee"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adapter);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_array_adapter, ANIMALS));

        ListView l = getListView();
        getListView().setTextFilterEnabled(true);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(ArrayAdapterActivity.this,
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}