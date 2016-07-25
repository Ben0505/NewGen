package com.example.l31005.newgen;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by L31005 on 7/25/2016.
 */
public class HsePreviewAdapter extends PagerAdapter {

    private int[] image_resource = {R.drawable.livingroom1, R.drawable.livingroom2, R.drawable.livingroom3};
    private Context ctx;
    private LayoutInflater layoutInflater01;

    public HsePreviewAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resource.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (RelativeLayout)object);
    }

    public Object instatiateItem(ViewGroup container, int position){
        layoutInflater01 = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater01.inflate(R.layout.hsepreview_model,container, false);
        ImageView imageView1 = (ImageView) item_view.findViewById(R.id.previewPics);
        imageView1.setImageResource(image_resource[position]);

        container.addView(item_view);
        return item_view;
    }

    public void destroyItem (ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }

}
