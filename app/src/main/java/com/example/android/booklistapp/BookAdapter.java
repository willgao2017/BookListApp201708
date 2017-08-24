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

public class BookAdapter extends ArrayAdapter<com.example.android.booklistapp.Book> {

    public BookAdapter(Context context, List<com.example.android.booklistapp.Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
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

        return view;
    }

    static class ViewHolder {
        @BindView(R.id.primary_location)
        TextView primaryLocationView;
        @BindView(R.id.location_offset)
        TextView locationOffsetView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
