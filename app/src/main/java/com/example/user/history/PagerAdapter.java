package com.example.user.history;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    Integer tabnumber=3;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position){
        return super.getPageTitle(position);

    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                BlankFragment_1 one = new BlankFragment_1();

                return one;
            case 1:
                BlankFragment_2 two = new BlankFragment_2();
                return two;
            case 2:
                BlankFragment_3 three = new BlankFragment_3();
                return three;
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}

