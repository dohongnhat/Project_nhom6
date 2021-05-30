package com.example.nhom6_soc.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.nhom6_soc.Fragment.FragmentAdminItemView;
import com.example.nhom6_soc.Fragment.FragmentHome;

public class AdminAdapter extends FragmentStatePagerAdapter {
    int dem = 3;

    public AdminAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new FragmentHome();
            case 1 : return new FragmentAdminItemView();
            default: return new FragmentHome();
        }
    }

    @Override
    public int getCount() {
        return dem;
    }
}