package reco.frame.demo.entity;

public class AppInfo {
	/**
	 * 此属性用于数据库操作
	 */
	public int id;
	public String title;
	public String imageUrl;
	public String text;
	public String rankId;
	public int mUrl;
	public int num;

	public String getRankId() {
		return rankId;
	}

	public void setRankId(String rankId) {
		this.rankId = rankId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getmUrl() {
		return mUrl;
	}

	public void setmUrl(int mUrl) {
		this.mUrl = mUrl;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
