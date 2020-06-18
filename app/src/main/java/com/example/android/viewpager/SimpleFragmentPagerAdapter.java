/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentStateAdapter {

    public SimpleFragmentPagerAdapter(FragmentActivity fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if (position == 0) {
            return WeekdayFragment.createInstance("Monday");
        } else if (position == 1) {
            return WeekdayFragment.createInstance("Tuesday");
        } else if (position == 2) {
            return WeekdayFragment.createInstance("Wednesday");
        } else if (position == 3) {
            return WeekdayFragment.createInstance("Thursday");
        } else {
            return WeekdayFragment.createInstance("Friday");
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
