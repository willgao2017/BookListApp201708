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
package com.example.android.booklistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.android.booklistapp.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * An {@link BookAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Book} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BookAdapter extends ArrayAdapter<com.example.android.booklistapp.Book> {


    //@BindView(R.id.primary_location) TextView primaryLocationView;
    //primaryLocationView.setText(bookTitle);
    //TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.primary_location);

    public BookAdapter(Context context, List<com.example.android.booklistapp.Book> books) {
        super(context, 0, books);
    }

    /**
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        com.example.android.booklistapp.Book currentBook = getItem(position);

        String bookAuthor = currentBook.getAuthor();
        String bookTitle = currentBook.getTitle();

        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.primary_location);
        //@BindView(R.id.primary_location) TextView primaryLocationView;
        primaryLocationView.setText(bookTitle);

        TextView locationOffsetView = (TextView) listItemView.findViewById(R.id.location_offset);
        locationOffsetView.setText(bookAuthor);

        return listItemView;
    }}
*/

///**
    @Override public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.book_item, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        com.example.android.booklistapp.Book currentBook = getItem(position);

        String bookAuthor = currentBook.getAuthor();
        String bookTitle = currentBook.getTitle();

        holder.primaryLocationView.setText(bookAuthor);
        holder.locationOffsetView.setText(bookTitle);

        // etc...

        return view;
    }

    static class ViewHolder {
        @BindView(R.id.primary_location) TextView primaryLocationView;
        @BindView(R.id.location_offset) TextView locationOffsetView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
 //*/