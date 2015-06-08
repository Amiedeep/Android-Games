package Fragments;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mycompany.androidgames.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddPlayerNamesFragment extends Fragment {


    public AddPlayerNamesFragment() {
        // Required empty public constructor
    }

//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.fragment_add_player_names);
//    }

//    public void onAttach(Activity activity) {
//
//        System.out.println("****************"+activity);
//    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_player_names, container, false);
    }


}
