package reco.frame.demo.sample;

import java.util.ArrayList;
import java.util.List;

import reco.frame.demo.R;
import reco.frame.demo.adapter.TvGridAdapter;
import reco.frame.demo.entity.AppInfo;
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
	public View onCreateView(final LayoutInflater inflater, ViewGroup container,
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
				intent.putExtra("title",appList.get(position).getTitle());
				intent.putExtra("text",appList.get(position).getText());
				startActivity(intent);
			}
		});

		return parent;
	}

	public void getData() {
		AppInfo app1 = new AppInfo();
		app1.title = "蒜泥拌豆角";
		app1.mUrl = R.drawable.cc;
		app1.text = "蒜泥拌豆角是一道非常可口的凉拌菜，主要材料为大蒜和豆角。\n" +
				"大蒜[1]  所有的天然成分，纯天然、高浓缩、无异味、食用方便、易吸收。" +
				"活化细胞，促进能量产生，增加疾病抗菌能力。能去脂降压、降血糖、防癌、" +
				"调节肠胃。大蒜性温味辛，入脾、胃、肺三经脉，可行气、温胃、消积、解毒、" +
				"杀虫，治积滞、腹冷痛、泄泻、痢疾、百日咳等症状。在现代医学的研究中，" +
				"大蒜含蛋白质4.4%，含较多的维生素C、胡萝卜素、钙、磷、铁。\n" +
				"豆角[2]  含丰富维生素B、C和植物蛋白质，能使人头脑宁静.调理" +
				"消化系统，消除胸膈胀满。可防治急性肠胃炎，呕吐腹泻。有" +
				"解渴健脾、补肾止泄、益气生津的功效。";
		appList.add(app1);

		AppInfo app2 = new AppInfo();
		app2.title = "虾仁烩丝瓜";
		app2.mUrl = R.drawable.ee;
		app2.text = "准备好虾仁和丝瓜，将速冻虾仁解冻沥干水分，丝瓜去掉表皮，切成滚刀块，" +
				"把丝瓜焯水后沥干水分；锅中注入植物油，爆香姜丝。丝瓜不仅营养丰富，而且有" +
				"一定的药用价值，浑身都是宝。丝瓜中含有丰富营养成分，所含的干扰素诱生剂，" +
				"能刺激人体产生干扰素，达到抗病毒、防癌的目的。丝瓜性凉，味甘，入肝、胃经，" +
				"具有清热化痰、凉血解毒、杀虫、通经络、行血脉、利尿、下乳、止血止痛等功效。" +
				"用于痰喘、咳嗽、乳汁不通、身热烦渴、便血尿血、崩漏带下、胸胁痛、筋骨酸痛等症。" +
				"夏季常食丝瓜，能解暑除烦，生津止渴。";
		appList.add(app2);

		AppInfo app3 = new AppInfo();
		app3.title = "银耳炖木瓜";
		app3.mUrl = R.drawable.gg;
		app3.text = "银耳炖木瓜是一道美食，材 料：银耳15克，木瓜（中等大，最好是自然熏熟）1只，" +
				"北杏10克，南杏12克，冰糖适量。\n" +
				"做 法：将银耳用清水浸透发开，洗净；木瓜削皮去籽，" +
				"切成小块；南北杏仁去衣，洗净，连同银耳、冰糖一起放" +
				"入炖煲内，加适量开水炖煮20分钟后即可食用。\n" +
				"功 效：滋润养颜。经常食用能养阴润肺，使皮肤得到滋润，" +
				"防止皱纹过早出现，保持皮肤幼嫩，延缓衰老。尚可治疗燥热咳" +
				"嗽、干咳无痰、痰中带血等症。";
		appList.add(app3);

		AppInfo app4 = new AppInfo();
		app4.title = "绣球鲈鱼";
		app4.mUrl = R.drawable.dd;
		app4.text = "1.这道菜的口味清淡，很适合孩子和老人吃。除了用鲈鱼，也" +
				"可以用黄花鱼，桂花鱼等少剌的湖鱼做。选料最好用新鲜的鱼，不然会有腥味。\n" +
				"2.在取鱼骨的时侯主剌骨会有一些留在鱼肉上的，推荐使用眉夹把剌夹出来。取出" +
				"肉后，最好用手触摸鱼肉，感觉是否还有剌余留。\n" +
				"3.放葱姜水时要注意不要过量，等鱼肉把水吃进去再放第二次。" +
				"为了表现绣球的五彩缤纷，最好不要用深色酱油做腌料或是浇汁。" +
				"烧浇汁的时侯最好分两次淋入水淀粉，第一次观察看浓度够不够，" +
				"如果没达到理想程度再加第二次。如果懒得做浇汁直接蘸生抽吃也很好吃。";
		appList.add(app4);

		AppInfo app5 = new AppInfo();
		app5.title = "猪腱肉煲菜干汤";
		app5.mUrl = R.drawable.aa;
		app5.text = "1.猪腱肉切大块，放进水里煮开，捞出冲洗干净浮沫\n" +
				"2.菜干提前几个小时浸泡，挤干水分，捞出切成段，再清洗一遍\n" +
				"3.胡萝卜削皮切块，菜干挤干水分，猪腱肉飞水，蜜枣冲洗一下\n" +
				"4.把全部材料放进汤锅，加入8~10碗清水\n" +
				"5.大火煮开后，继续大火15分钟\n" +
				"6.转慢火煲2个小时\n" +
				"7.放盐调味即可享用";
		appList.add(app5);

		AppInfo app6 = new AppInfo();
		app6.title = "酸辣肚丝汤";
		app6.mUrl = R.drawable.ff;
		app6.text = "酸辣肚丝汤是汉族传统名菜，属于豫菜汤粥菜谱之一。此菜健胃，" +
				"暖身驱寒。以香菜为制作主料，酸辣肚丝汤的烹饪技巧以煮菜为主，口" +
				"味属于酸辣味。酸辣汤是河南冬令筵席必备的佳羹。豫菜烹制酸辣汤讲" +
				"究酸而不酷，辣而不烈，咸而不涩，三味相平，每一味都不能过头，才" +
				"算恰到好处，为正宗风味。\n烹饪方法\n" +
				"1. 将猪肚用盐碱搓洗干净，再用清水冲洗盐碱味，入锅煮熟，稍晾后放墩上，" +
				"厚的用刀片成两片，\n" +
				"酸辣肚丝汤制作方法照片\n" +
				"酸辣肚丝汤制作方法照片(15张)\n" +
				" 立刀切成2毫米粗，3厘米长的丝；\n" +
				"2. 肚丝在开水锅里氽一下，捞出备用；\n" +
				"3. 姜洗净，切丝；\n" +
				"4. 香菜洗净，备用；\n" +
				"5. 炒锅放旺火上，添入清汤1250毫升，下肚丝、姜丝、酱油、盐、胡椒粉、黄酒、味精，同烧；\n" +
				"6. 烧至汤沸，撇去浮沫，用醋兑湿淀粉，勾流水芡，盛入大汤碗中，淋上香油即成；\n" +
				"7. 外带香菜碟与汤同时上桌。";
		appList.add(app6);

		AppInfo app7 = new AppInfo();
		app7.title = "香酥鸭";
		app7.mUrl = R.drawable.hh;
		app7.text = "香酥鸭是一道江苏，四川，湖南等地的传统名菜，在川菜，苏菜，湘菜中均有此菜，" +
				"鸭子经调味品腌渍，再上笼蒸至熟烂，最后经油炸而成。此菜色泽红亮，口感皮脆肉酥。" +
				"以葱白、甜面酱、番茄酱佐食，味更丰富。\n" +
				"此菜注重工艺造型，讲究原料配合，形态美观，色调柔和，集松泡、酥脆、软嫩、鲜香于一" +
				"体，深受四方宾客欢迎。\n基本材料\n" +
				"主料：光鸭(1500克)。\n" +
				"辅料：葱花(80克)、粗盐(65克)、姜(130)、花椒(8克)、黄酒(少许)、桂皮(20克)、酱油(少许)、八角(8克)、小茴香(4克)。\n" +
				"制作方法\n" +
				"1)除去鸭子的内脏、翅膀、鸭脚、鸭骚、再把鸭脯处的胸骨压平，将盐抹遍鸭；\n" +
				"2)加入各种香料：桂皮、八角、小茴香、葱、姜等，上笼约蒸三小时后取出，晾干；\n" +
				"3)油锅之放置于旺火上，将鸭子放入锅内，炸后拿起；\n" +
				"4)在鸭皮上抹些黄酒和酱油，再锅内炸至呈金色；\n" +
				"6)食用时,可蘸花椒盐吃。";
		appList.add(app7);

		AppInfo app8 = new AppInfo();
		app8.title = "盐煎丸子";
		app8.mUrl = R.drawable.bb;
		app8.text = "盐煎丸子是一道菜品，主料为肉末、山药、鸡蛋、淀粉。\n做法\n" +
				"1、山药去皮洗净，切碎；姜去皮洗净切姜末。\n" +
				"2、肉末加山药、鸡蛋、淀粉、盐、葱椒、姜末、盐、料酒、酱油、鸡精搅打上劲，加香油拌匀。\n" +
				"3、将拌好的馅挤成核桃大小的丸子，放锅中小火煎至底部凝固。\n" +
				"4、将丸子翻面，按扁，再加油用中火半煎半炸至丸子金黄色，装盘撒椒盐食用。";
		appList.add(app8);

		AppInfo app9 = new AppInfo();
		app9.title = "醋焖黄花鱼";
		app9.mUrl = R.drawable.ii;
		app9.text = "醋焖黄花鱼是一道家常菜，主料是黄花鱼，配以盐、醋、木耳等烹制而成。\n" +
				"做法\n" +
				"1 将黄花鱼去鳞去鳃去内脏，洗净沥水。在鱼体两面切上横刀。\n" +
				"2 用盐擦透鱼身，再加入料酒，葱姜蒜，1勺醋腌渍20分钟。\n" +
				"3 在鱼身上拍上干粉。\n" +
				"4 煎锅放入少量的油，下入拍粉的鱼，煎至两面金黄。\n" +
				"5 下入八角炸香。\n" +
				"6 再烹入1大勺醋，岛上腌鱼的料汁。\n" +
				"7 加入酱油，糖 盐。\n" +
				"8 加入开水，没过鱼烧开。\n" +
				"9 放入泡发的木耳。烧开后转小火，焖至30分钟。\n" +
				"10 淀粉兑水成水淀粉备用。\n" +
				"11 鱼熟后盛出，\n" +
				"12 汤汁加入水淀粉烧至浓缩。\n" +
				"13 把汤汁浇在鱼上撒上香葱即可即可。";
		appList.add(app9);

		AppInfo app10 = new AppInfo();
		app10.title = "大葱烧海参";
		app10.mUrl = R.drawable.jj;
		app10.text = "大葱烧海参是河南一带的传统风味名菜，属于豫菜系。芡汁下锅，" +
				"不要马上搅动，稍等三四秒钟，再将其搅匀，淀粉糊化，使之明汁亮芡。\n制作方法\n" +
				"1. 将水发嫩小海参洗净，整个放入凉水锅中，用旺火烧开\n" +
				"大葱烧海参\n" +
				"大葱烧海参\n" +
				"，约煮5分钟捞出，沥净水。把大葱分别切成长5厘米的段（100克）和末（5克）。青蒜切成长3.3厘米的段。\n" +
				"2. 将炒锅置于旺火上，倒入植物油，烧到八成热时下入葱段，炸成金黄色时炒锅端离火中，葱段端在碗中，加入鸡汤（50克50克）、绍酒（5克）、姜汁（2.5克）、酱油（2.5克）、白糖（2.5克）和味精（1克），上屉用旺火蒸1至2分钟取出，滗去汤汁，留下葱段备用。\n" +
				"3. 将炒锅置于旺火上，倒入植物油（25克），烧到八成热时，下入白糖（25克），炒成金黄色，再下入葱末、姜末、海参煸炒几下，随即下入绍酒（10克）、鸡汤（150克）酱油（10克）、姜汁（25克）、精盐、糊葱油（20克）和味精（2.5克。）待烧开后，挪到微火上火靠5分钟，把汤汁火靠2/3，再改用旺火，边颠翻炒锅，边淋入调稀的湿淀粉勾芡，使芡汁都挂在海参上，随即倒入盘中。\n" +
				"4. 将炒锅置于旺火上，倒入糊葱油（30克），烧热后下入青蒜段和蒸好的葱段，略煸一下，撒在海参上即成。";
		appList.add(app10);

		AppInfo app11 = new AppInfo();
		app11.title = "家常蒸卤面";
		app11.mUrl = R.drawable.kk;
		app11.text = "蒸卤面是一款家常菜品，制作原料主要有细切面、豇豆、五花肉等。\n" +
				"做法\n" +
				"\n" +
				"1、将肉切成条状或块状，用老抽，五香粉，姜片，葱段，料酒腌15分钟。\n" +
				"2、用蒸锅烧水，将细切面上锅，水沸后中火蒸15分钟。\n" +
				"3、用另一灶开始炒菜。热锅倒油少许，放肉进锅，炒至五花肉出油，放入黄豆芽，加醋，番茄酱和盐适量，炒两分钟。加400毫升温水，水开后继续烧10分钟。\n" +
				"4、面蒸好后将面放入稍大容器中，打散，越散越好。\n" +
				"5、将烧好的菜连汁儿一起倒到面上，充分拌匀，让面将菜汁儿吸干。若有多余汁儿可以倒掉。\n" +
				"6、将拌好的面上蒸锅中火再蒸5分钟关火即食。\n" +
				"营养价值编辑\n" +
				"面条中含有很高的蛋白质，是维生素和矿物质的最主要来源，并且面条的纤维素含量是非常高的，要比面包的营养价值还要高出许多。面条当中含有维持神经平衡必需的维生素B1、B2、B3等，同时还含有钙、铁、磷、镁、钾等人体必需的物质，因此吃面条可以使人长寿，所以才会有“长寿面”这一说法。吃面条可以提供肌肉必需的葡萄糖，还会让人更加清醒，做事注意力更加集中，因为它能缓慢的、有规律的向大脑输送葡萄糖。面条还能够分解脂肪，因为面条是不含脂肪的，可以让胰岛素保持在正常和稳定的水平上，进而保持血糖的长期稳定。";
		appList.add(app11);

		AppInfo app12 = new AppInfo();
		app12.title = "炸八块";
		app12.mUrl = R.drawable.ll;
		app12.text = "炸八块，又名八块鸡，是河南省汉族传统名菜，属豫菜系。它由童子鸡、鸡肫、鸡肝、淀粉（蚕豆）等食材烹制而成。本地菜馆颇有韵味的“干搂炸酱不要芡，一只鸡子剁八瓣”的响堂报菜语，后半句就是指此菜而言。相传清乾隆皇帝巡视河道驻骅开封时曾领略过它的风味，由此闻名于世，至今已有近200年的历史。19世纪20年代，经开封又一新饭庄厨师刘庚莲等人的改进和提高，风味更佳。\n" +
				"制作步骤\n" +
				"1、花生米用盐炒熟去皮剁碎，葱一半切成花，余下葱和姜一起拍破。\n" +
				"2、将鸡肉去骨后，用刀背捶松，砍成4.5厘米见方的肉块，用料酒、盐、糖、葱姜、花椒、味精腌约一小时后，挑去花椒、葱和姜，再用蛋清、湿淀粉浆好，粘上碎花生米。\n" +
				"炸八块\n" +
				"炸八块\n" +
				"3、锅内放花生油烧沸，逐块下入油锅炸一下即捞出，待油锅中水分烧干时，再下入油锅炸焦酥呈金黄色，滗去油，撒花椒粉、葱花，淋香油，摆入盘中，香菜拼边即成。\n" +
				"注意事项\n" +
				"1、炸时注意火侯，炸至上色后，要用微火蹲炸，使鸡块肉熟透后，再用旺火炸至外焦里嫩，如火候掌握不当，易炸糊或内不熟；\n" +
				"2、因有过油炸制过程，需准备花生油1000克。";
		appList.add(app12);


	}
}
