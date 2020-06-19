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

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * Fragment that displays a day of the week.
 */
public class WeekdayFragment extends Fragment {
    private String day;

    /**
     * This method is used to create a custom fragment
     *
     * @param whichDay is a string saying one of the days of the week
     * @return the custom fragment with the day
     */
    public static WeekdayFragment createInstance(String whichDay) {
        // Create the fragment
        WeekdayFragment fragment = new WeekdayFragment();
        // Create a bundle instance
        Bundle args = new Bundle();
        // Add the string with the day to the fragment bundle
        args.putString("DAY", whichDay);
        // Set the bundle in the fragment
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // If the fragment bundle was created and set successfully, get the day string
        day = getArguments() != null ? getArguments().getString("DAY") : null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weekday, container, false);
        // Get the text view where the name of the day will be displayed
        TextView dayText = view.findViewById(R.id.weekday_text_view);
        // Set the text of the view to the day that was added to the fragment
        dayText.setText(day);
        return view;
    }
}
