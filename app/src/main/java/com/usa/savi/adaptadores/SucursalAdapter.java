package com.usa.savi.adaptadores;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.usa.savi.R;
import com.usa.savi.modelos.Surcursal;
import java.util.ArrayList;

public class SucursalAdapter extends BaseAdapter {
    Context context;
    ArrayList<Surcursal> surcursales;
    LayoutInflater inflater;

    public SucursalAdapter(Context context, ArrayList<Surcursal> surcursales) {
        this.context = context;
        this.surcursales = surcursales;
    }

    @Override
    public int getCount() {
        return surcursales.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null){
            convertView = inflater.inflate(R.layout.grid_item, null);
        }

        ImageView imageview = convertView.findViewById(R.id.imgItem);
        TextView campo1 = convertView.findViewById(R.id.tvCampo1);
        TextView campo2 = convertView.findViewById(R.id.tvCampo2);
        TextView campo3 = convertView.findViewById(R.id.tvCampo3);
        TextView campoId = convertView.findViewById(R.id.tvId);

        Surcursal surcursal = surcursales.get(position);
        byte[] image = surcursal.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);


        campoId.setText("ID: "+surcursal.getId());
        campo1.setText(surcursal.getName());
        campo2.setText(surcursal.getDescription());
        campo3.setText(surcursal.getLocation());
        imageview.setImageBitmap(bitmap);

        return convertView;
    }
}
