package ru.surf.nikita_makarov;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

    public class MyAdapter extends BaseAdapter
    {

        ArrayList<String> data = new ArrayList<>();
        Context context;

        public MyAdapter(Context context, ArrayList<String> arr)
        {
            if (arr != null)
            {
                data = arr;
            }
            this.context = context;
        }

        @Override
        public int getCount()
        {
            // TODO Auto-generated method stub
            return data.size();
        }

        @Override
        public Object getItem(int num)
        {
            // TODO Auto-generated method stub
            return data.get(num);
        }

        @Override
        public long getItemId(int arg0)
        {
            return arg0;
        }

        @Override
        public View getView(int i, View someView, ViewGroup arg2)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            if (someView == null)
            {
                someView = inflater.inflate(R.layout.item, arg2, false);
            }
            someView.setBackgroundColor(Color.HSVToColor(new float[]{i,1f,1f}));
            return someView;
        }
    }
