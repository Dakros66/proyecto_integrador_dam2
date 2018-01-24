package com.example.a21624926.proyectointegrador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 21624926 on 24/01/2018.
 */

public class CustomAdapter extends BaseAdapter {

private Context context;
private ArrayList<Integer> imagesArray;
private ArrayList<String> names;

    public CustomAdapter(Context context, ArrayList<Integer> imagesArray, ArrayList<String> names) {
        this.context = context;
        this.imagesArray = imagesArray;
        this.names = names;
    }

    @Override
        public int getCount() {
            return imagesArray.size();
        }

        @Override
        public Object getItem(int i) {
            return names.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
          if(view==null){
              view = View.inflate(context,R.layout.customlayout,null);
          }
            ImageView images = view.findViewById(R.id.imageView2);
            TextView text = view.findViewById(R.id.textviewNombre);
            images.setImageResource(imagesArray.get(i));
            text.setText(names.get(i));
            return view;
        }


    }



