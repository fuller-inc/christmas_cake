
package jp.co.fuller.christmas_cake;

import org.taptwo.android.widget.TitleProvider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter implements TitleProvider {

    private LayoutInflater mInflater;

    private static final String[] versions = {
            "0.1"
    };
    private static final int[] images = {
            R.drawable.image
    };

    public ImageAdapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.flow_item, null);
        }
        int drawable = images[position];
        ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(drawable);
        return convertView;
    }

    @Override
    public String getTitle(int position) {
        return versions[position];
    }

}
