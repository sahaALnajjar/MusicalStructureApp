package com.example.android.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class musicAdatper extends ArrayAdapter {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context   The current context. Used to inflate the layout file.
     * @param musicList A List of AndroidFlavor objects to display in a list
     */
    public musicAdatper(Context context, ArrayList<MusicModel> musicList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, musicList);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        MusicModel word = getItem(position);


        View listOfSongs = convertView;

        // Check if the existing view is being reused, otherwise inflate the view

        if (listOfSongs == null) {
            listOfSongs = LayoutInflater.from(getContext()).inflate(R.layout.song_layout_list, parent, false);
        }

        /** Get the {@link MusicModel} object located at this position in the list
         *
         */




        TextView nameOfSong = (TextView) listOfSongs.findViewById(R.id.title_of_song);
        nameOfSong.setText(word.getmSongTitle());





        return listOfSongs;

    }
}