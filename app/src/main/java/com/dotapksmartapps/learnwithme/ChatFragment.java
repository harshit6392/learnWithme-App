package com.dotapksmartapps.learnwithme;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import Adapter.ChatAdapter;

public class ChatFragment extends Fragment {

    String[] names = {"Naruto", "Hinata", "Anya", "Saturo Gojo", "Tanjiro Kun", "Nezuko Cha", "Uchiha Itachi", "Hatake Kakashi","Uchiha Itachi", "Hatake Kakashi"};
    int[] images = {R.drawable.n, R.drawable.h, R.drawable.anya, R.drawable.gojo, R.drawable.tanjiro, R.drawable.nezukocha, R.drawable.itachi, R.drawable.kakashi,R.drawable.itachi, R.drawable.kakashi};
    RecyclerView recyclerView;
    ChatAdapter chatAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);

        // Set up the ChatAdapter
        chatAdapter = new ChatAdapter(images,names);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(chatAdapter);

        return view;
    }
}
