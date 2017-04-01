package reco.frame.demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import reco.frame.demo.R;
import reco.frame.demo.entity.AppInfo;
import reco.frame.tv.view.TvImageView;
import reco.frame.tv.view.component.TvBaseAdapter;

public class TvFragmentCAdapter extends TvBaseAdapter {

	
	private List<AppInfo> appList;
	private LayoutInflater inflater;
	
	public TvFragmentCAdapter(Context context, List<AppInfo> appList){
		this.inflater=LayoutInflater.from(context);
		this.appList=appList;
	}
	
	@Override
	public int getCount() {
		return appList.size();
	}

	@Override
	public Object getItem(int position) {
		return appList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View contentView, ViewGroup parent) {
		ViewHolder holder=null;
		if (contentView==null) {
			contentView=inflater.inflate(R.layout.item_fragmentcgrid, null);
			holder=new ViewHolder();
			holder.tv_title=(TextView) contentView.findViewById(R.id.tv_title);
			holder.tiv_icon=(TvImageView) contentView.findViewById(R.id.tiv_icon);
			holder.tv_rank_id = (TextView)contentView.findViewById(R.id.Tv_rank_id);
			contentView.setTag(holder);
		}else{
			holder=(ViewHolder) contentView.getTag();
		}
		
		AppInfo app=appList.get(position);
		holder.tv_title.setText(app.getTitle());
//		holder.tiv_icon.setBackgroundResource(R.drawable.icon_reco);
		holder.tiv_icon.setBackgroundResource(app.getmUrl());
		holder.tv_rank_id.setText(app.getRankId());
		//holder.tiv_icon.configImageUrl(app.imageUrl);
		
		return contentView;
	}
	
	public void addItem(AppInfo item) {
		appList.add(item);
	}

	public void clear() {
		appList.clear();
	}

	public void flush(List<AppInfo> appListNew) {
		appList = appListNew;
	}

	
	static class ViewHolder{
		TextView tv_title;
		TvImageView tiv_icon;
		TextView tv_rank_id;
	}
}
