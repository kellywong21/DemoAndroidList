package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvAndroidList;
    ArrayList<AndroidVersion> AndroidList;
    ArrayAdapter aaAndroidList;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidList = findViewById(R.id.lvAndroidList);

        AndroidList = new ArrayList<>();
        AndroidVersion Pie = new AndroidVersion("Pie", "9.0");
        AndroidVersion Oreo = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion Nougat = new AndroidVersion("Nougat", "7.0 - 7.1.2");
        AndroidVersion Marshmallow = new AndroidVersion("Marshmallow", "6.0 - 6.0.1");
        AndroidVersion Lollipop = new AndroidVersion("Lollipop", "5.0 - 5.1.1");
        AndroidVersion KitKat = new AndroidVersion("KitKat", "4.4 - 4.4.4");
        AndroidVersion JellyBean = new AndroidVersion("Jelly Bean", "4.1 - 4.3.1");

        AndroidList.add(Pie);
        AndroidList.add(Oreo);
        AndroidList.add(Nougat);
        AndroidList.add(Marshmallow);
        AndroidList.add(Lollipop);
        AndroidList.add(KitKat);
        AndroidList.add(JellyBean);


        aaAndroidList = new ArrayAdapter(this, android.R.layout.simple_list_item_1,AndroidList);
        adapter = new CustomAdapter(this, R.layout.row,AndroidList);
        lvAndroidList.setAdapter(aaAndroidList);
        lvAndroidList.setAdapter(adapter);
    }
}
