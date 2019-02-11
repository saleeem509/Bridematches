package com.vvvinfotech.saleem.bridematches;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    Tablayout tablayout;
    RecyclerView recyclerView;
    BridesAdapter bridesAdapter;
    List<Bride> brideList;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool);
        getSupportActionBar(toolbar);
        TabLayout tablayout = findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new MatchesFragment(), "Matches");
        adapter.AddFragment(new NewMatches(), "NewMatches");
        adapter.AddFragment(new PremiumMembers(), "PremiumMembers");
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
        brideList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
//        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        bridesAdapter = new BridesAdapter(this,brideList);
        recyclerView.setAdapter(bridesAdapter);

        brideList = new ArrayList<>();
        brideList.add(
                new Bride(

                        1,
                        "Divya",
                        "25 yrs",
                        "Kammas",
                        "Hyderabad",
                        R.drawable.divya));
        brideList.add(
                new Bride(

                        2,
                        "Deepika",
                        "22 yrs",
                        "Reddy",
                        "Vijayawada",
                        R.drawable.deepika));
        brideList.add(
                new Bride(

                        3,
                        "Disha",
                        "23 yrs",
                        "Kapu",
                        "wrangal",
                        R.drawable.disha));

        brideList.add(
                new Bride(

                        4,
                        "Geethika",
                        "24 yrs",
                        "Mudiraj",
                        "Guntur",
                        R.drawable.gethika));
        brideList.add(
                new Bride(

                        5,
                        "Navya",
                        "25 yrs",
                        "Kapu",
                        "Khammamm",
                        R.drawable.navya));
        brideList.add(
                new Bride(

                        6,
                        "Pinky",
                        "25 yrs",
                        "shetti",
                        "Vizag",
                        R.drawable.pinky));
        brideList.add(
                new Bride(

                        7,
                        "Ramya",
                        "25 yrs",
                        "Rajus",
                        "Karimnagar",
                        R.drawable.ramya));
        brideList.add(
                new Bride(

                        8,
                        "Sahasra",
                        "24 yrs",
                        "Padmashali",
                        "Godavari",
                        R.drawable.sahasra));
        brideList.add(
                new Bride(

                        9,
                        "Sony",
                        "25 yrs",
                        "Kammas",
                        "Ameerpet",
                        R.drawable.sony));
        brideList.add(
                new Bride(

                        10,
                        "Swapna",
                        "25 yrs",
                        "Reddys",
                        "Ananthapur",
                        R.drawable.swapna));

    }
        private void getSupportActionBar (Toolbar toolbar){
        }
    }

