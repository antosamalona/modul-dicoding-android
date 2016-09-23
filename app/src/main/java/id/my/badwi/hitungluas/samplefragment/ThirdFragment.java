package id.my.badwi.hitungluas.samplefragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import id.my.badwi.hitungluas.MainActivity;
import id.my.badwi.hitungluas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_third, container, false);
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        if(((MainActivity)getActivity()).getSupportActionBar() != null) {
            ((MainActivity) getActivity()).getSupportActionBar().setTitle("ThirdFragment");
            ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setHasOptionsMenu(true);
        }
        return view;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home ) {
            getFragmentManager() .popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }

}
