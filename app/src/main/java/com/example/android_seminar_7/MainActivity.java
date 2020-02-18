package com.example.android_seminar_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.suntages);

        String[] suntages = new String[5];
        suntages[0] = "Pastitsio";
        suntages[1] = "Gemista";
        suntages[2] = "Makaronia";
        suntages[3] = "Mousakas";
        suntages[4] = "Fasolakia";

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this , R.layout.list_item , R.id.textView , suntages);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String current = parent.getItemAtPosition(position).toString();
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("suntagi" , current);
                startActivity(intent);
            }
        });

    }
}
