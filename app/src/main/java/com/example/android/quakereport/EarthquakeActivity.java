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
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Quake> earthquakes = new ArrayList<Quake>();
        earthquakes.add(new Quake("1.3", "San Francisco", "23.7.2018"));
        earthquakes.add(new Quake("3.2", "London", "15.2.2018"));
        earthquakes.add(new Quake("2.1", "Tokyo", "5.1.2018"));
        earthquakes.add(new Quake("4.3", "Mexico City", "1.4.2018"));
        earthquakes.add(new Quake("1.9", "Moscow", "14.8.2018"));
        earthquakes.add(new Quake("3.1", "Rio de Janeiro", "7.9.2018"));
        earthquakes.add(new Quake("0.6", "Paris", "30.7.2018"));

        QuakeAdapter quakeAdapter = new QuakeAdapter(this, earthquakes);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(quakeAdapter);
    }
}
