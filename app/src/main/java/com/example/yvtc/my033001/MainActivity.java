package com.example.yvtc.my033001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String fruits[]={"蘋果","香蕉","芭樂"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this,
                             android.R.layout.simple_list_item_1,fruits);
        lv.setAdapter(adapter);
    }
}
