package com.cabalabs.tabview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class PageAdapter extends FragmentPagerAdapter {

        private int numOfTabs;
        public PageAdapter(FragmentManager fm, int numOfTabs) {
            super(fm);
            this.numOfTabs = numOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new OBSFragment();
                case 1:
                    return new BSFragment();
                case 2:
                    return new L1_Fragment();
                case 3:
                    return new DSFragment();
                    default:
                        return null;
            }


        }

        @Override
        public int getCount() {
            return numOfTabs;
        }
}

