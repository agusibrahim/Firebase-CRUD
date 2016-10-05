package com.agusibrahim.firebcrud;
import android.widget.*;
import android.view.*;
import java.util.*;
import android.content.*;
import android.graphics.drawable.*;

public class userAdapter extends ArrayAdapter<User>
{
	HashMap<Integer, Drawable> gender_icon;
	public userAdapter(Context ctx, ArrayList<User> users){
		super(ctx, 0, users);
		gender_icon=new HashMap<Integer, Drawable>();
		gender_icon.put(R.id.form_gender_female, ctx.getDrawable(R.drawable.ic_gender_female));
		gender_icon.put(R.id.form_gender_male, ctx.getDrawable(R.drawable.ic_gender_male));
	}
	public static class ViewHolder{
		TextView nama;
		TextView alamat;
		ImageView gender;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		User pengguna=getItem(position);
		ViewHolder holder;
		if(convertView==null){
			holder=new ViewHolder();
			convertView=LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
			holder.nama=(TextView) convertView.findViewById(R.id.nama);
			holder.alamat=(TextView) convertView.findViewById(R.id.alamat);
			holder.gender=(ImageView) convertView.findViewById(R.id.gender);
			convertView.setTag(holder);
		}else{
			holder=(userAdapter.ViewHolder) convertView.getTag();
		}
		holder.nama.setText(pengguna.getNama());
		holder.alamat.setText(pengguna.getAlamat());
		holder.gender.setImageDrawable(gender_icon.get(pengguna.getGender()));
		return convertView;
	}
}

