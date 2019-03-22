package com.lolin.deemon_face.quito;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TipsFragment extends Fragment {


    public TipsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate (R.layout.fragment_tips, container, false);

        String[] Tips = {"First Tip",
                "Second Tip",
                "Third Tip",
                "Fourth Tip"};

        ListView listView = view.findViewById (R.id.Tips_listView);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String> (
                getActivity (),
                android.R.layout.simple_list_item_1,
                Tips

        );

        listView.setAdapter (listViewAdapter);
        // Inflate the layout for this fragment
        return view;
    }

}
