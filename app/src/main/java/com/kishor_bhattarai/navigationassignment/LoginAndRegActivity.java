package com.kishor_bhattarai.navigationassignment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.kishor_bhattarai.navigationassignment.adapter.ViewPagerAdapter;
import com.kishor_bhattarai.navigationassignment.fragments.LoginFragment;
import com.kishor_bhattarai.navigationassignment.fragments.RegistrationFragment;

public class LoginAndRegActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_and_reg);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragmentAndTitle(new LoginFragment(),"login");
        viewPagerAdapter.addFragmentAndTitle(new RegistrationFragment(), "register");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
