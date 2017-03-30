package reco.frame.demo.sample;

import java.util.ArrayList;
import java.util.List;

import reco.frame.demo.R;
import reco.frame.demo.adapter.DbListAdapter;
import reco.frame.demo.adapter.TvGridAdapter;
import reco.frame.demo.entity.AppInfo;
import reco.frame.tv.view.TvGridView;
import reco.frame.tv.view.TvHorizontalGridView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {
	private TvHorizontalGridView tgv_imagelist;
	private TvGridAdapter adapter;
	private List<AppInfo> appList;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View parent = inflater.inflate(R.layout.frag_a, container, false);
//		tgv_imagelist = (TvGridView) parent.findViewById(R.id.tgv_imagelist);
		tgv_imagelist = (TvHorizontalGridView) parent.findViewById(R.id.tgv_imagelist);


		appList = new ArrayList<AppInfo>();

		getData();

		adapter = new TvGridAdapter(getActivity(), appList);
		tgv_imagelist.setAdapter(adapter);

		tgv_imagelist.setOnItemClickListener(new TvHorizontalGridView.OnItemClickListener() {
			@Override
			public void onItemClick(View item, int position) {
				Intent intent = new Intent(getActivity(),DetailsActivity.class);
				intent.putExtra("mUrl",appList.get(position).getmUrl()+"");
				intent.putExtra("text","详情页面");
				startActivity(intent);
			}
		});

		return parent;
	}

	public void getData() {
		AppInfo app1 = new AppInfo();
		app1.title = "蒜泥拌豆角";
		app1.mUrl = R.drawable.cc;
		appList.add(app1);

		AppInfo app2 = new AppInfo();
		app2.title = "虾仁烩丝瓜";
		app2.mUrl = R.drawable.ee;
		appList.add(app2);

		AppInfo app3 = new AppInfo();
		app3.title = "银耳炖木瓜";
		app3.mUrl = R.drawable.gg;
		appList.add(app3);

		AppInfo app4 = new AppInfo();
		app4.title = "绣球鲈鱼";
		app4.mUrl = R.drawable.dd;
		appList.add(app4);

		AppInfo app5 = new AppInfo();
		app5.title = "猪腱肉煲菜干汤";
		app5.mUrl = R.drawable.aa;
		appList.add(app5);

		AppInfo app6 = new AppInfo();
		app6.title = "酸辣肚丝汤";
		app6.mUrl = R.drawable.ff;
		appList.add(app6);

		AppInfo app7 = new AppInfo();
		app7.title = "香酥鸭";
		app7.mUrl = R.drawable.hh;
		appList.add(app7);

		AppInfo app8 = new AppInfo();
		app8.title = "盐煎丸子";
		app8.mUrl = R.drawable.bb;
		appList.add(app8);

		AppInfo app9 = new AppInfo();
		app9.title = "醋焖黄花鱼";
		app9.mUrl = R.drawable.ii;
		appList.add(app9);

		AppInfo app10 = new AppInfo();
		app10.title = "大葱烧海参";
		app10.mUrl = R.drawable.jj;
		appList.add(app10);

		AppInfo app11 = new AppInfo();
		app11.title = "家常蒸卤面";
		app11.mUrl = R.drawable.kk;
		appList.add(app11);

		AppInfo app12 = new AppInfo();
		app12.title = "炸八块";
		app12.mUrl = R.drawable.ll;
		appList.add(app12);

		AppInfo app13 = new AppInfo();
		app13.title = "鸳鸯蒸饺";
		app13.mUrl = R.drawable.mm;
		appList.add(app13);

		AppInfo app14 = new AppInfo();
		app14.title = "郑州烩面";
		app14.mUrl = R.drawable.nn;
		appList.add(app14);

		AppInfo app15 = new AppInfo();
		app15.title = "芝麻羊肉粒";
		app15.mUrl = R.drawable.oo;
		appList.add(app15);
	}
}
