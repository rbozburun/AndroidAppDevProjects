package tr.ceng.mu.edu.tr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnArray = findViewById(R.id.btnArrayAdapter);
        btnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(MainActivity.class.getName(), "array button clicked");

                Intent intent = new Intent(MainActivity.this,
                        ArrayAdapterActivity.class);
                startActivity(intent);
                //ArrayAdapterActivity activity = new ArrayAdapterActivity();
            }
        });

        Button btnCustom = findViewById(R.id.btnCustomAdapter); //Acessing Custom Button

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
    }
}