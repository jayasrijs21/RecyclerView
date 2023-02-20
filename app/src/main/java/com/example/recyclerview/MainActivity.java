package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MetalsModel> metalsModel = new ArrayList<>();
    int[] metalModelImages = {R.drawable.baseline_account_circle_24,
            R.drawable.baseline_airplane_ticket_24, R.drawable.baseline_all_inclusive_24,
    R.drawable.baseline_app_shortcut_24,R.drawable.baseline_attractions_24,
            R.drawable.baseline_auto_awesome_24,R.drawable.baseline_auto_fix_high_24,
            R.drawable.baseline_beach_access_24,R.drawable.baseline_bubble_chart_24,
            R.drawable.baseline_celebration_24 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//last part of coding
        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setUpMetalsModel();
        M_RecyclerViewAdapter adapter = new M_RecyclerViewAdapter(this , metalsModel);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void setUpMetalsModel() {
        String[]  sciNames = getResources().getStringArray(R.array.sci_name);
        String[] metNames = getResources().getStringArray(R.array.metal_name);
        String[] symb = getResources().getStringArray(R.array.symbol);


        for (int i = 0; i<sciNames.length; i++) {
            metalsModel.add(new MetalsModel(sciNames[i],
                    metNames[i], symb[i],metalModelImages[i]));
        }
    }

}