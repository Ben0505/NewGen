package com.example.l31005.newgen;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchList extends Fragment {

    View vView;
    ListView listView01;

    String[] houseNames = new String[] {"The Arte", "Trellis", "Dusun one", "Toa Payoh", "Skysuite"};
    int[] previews = new int[] {R.drawable.livingroom1, R.drawable.livingroom2, R.drawable.livingroom1, R.drawable.livingroom2, R.drawable.livingroom1};
    int[] hseLatitude;
    int[] hseLongtitude;


    ListView housesList01;

    public SearchList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vView = inflater.inflate(R.layout.fragment_search_list, container, false);

        listviewAdapter();

        return vView;
    }


    public void listviewAdapter(){
        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();


        for(int i=0;i<houseNames.length;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("name",  houseNames[i]);
            hm.put("previews", Integer.toString(previews[i]) );
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "previews","name", };

        // Ids of views in listview_layout
        int[] to = { R.id.preview,R.id.pName1};

        // Instantiating an adapter to store each items
        // R.layout.model defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(vView.getContext(), aList, R.layout.model, from, to);

        // Getting a reference to listview of main.xml layout file
        listView01 = ( ListView ) vView.findViewById(R.id.listView001);

        // Setting the adapter to the listView
        listView01.setAdapter(adapter);

        // Clickable Item
        listView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent toPreviewPage = new Intent(getActivity(),HousePreview.class);
                Bundle bundle = new Bundle();
                bundle.putStringArray("name", houseNames);
                bundle.putIntArray("previews", previews);
                toPreviewPage.putExtras(bundle);
                startActivity(toPreviewPage);
            }

        });

    }




}
