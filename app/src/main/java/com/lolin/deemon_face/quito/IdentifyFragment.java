package com.lolin.deemon_face.quito;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class IdentifyFragment extends Fragment {

    Button imageButton;

    public IdentifyFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View RootView =  inflater.inflate (R.layout.fragment_identify,container,false);
        imageButton = RootView.findViewById (R.id.identify_takeImage);

        //camera open
        imageButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });


        return RootView;

        // Inflate the layout for this fragment...


//        return inflater.inflate (R.layout.fragment_identify, container, false);

    }


}
