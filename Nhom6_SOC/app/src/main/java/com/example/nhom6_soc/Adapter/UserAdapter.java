package com.example.nhom6_soc.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.nhom6_soc.Fragment.FragmentCart;
import com.example.nhom6_soc.Fragment.FragmentHome;
import com.example.nhom6_soc.Fragment.FragmentSave;

public class UserAdapter extends FragmentStatePagerAdapter {
    int dem = 3;

    public UserAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new FragmentHome();
            case 1 : return new FragmentCart();
            case 2 : return new FragmentSave();
            default: return new FragmentHome();
        }
    }

    @Override
    public int getCount() {
        return dem;
    }
}
