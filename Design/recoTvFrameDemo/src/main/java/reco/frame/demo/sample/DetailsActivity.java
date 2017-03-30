package reco.frame.demo.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import reco.frame.demo.R;
import reco.frame.tv.view.TvImageView;

public class DetailsActivity extends Activity {

    private TvImageView mImage;
    private TextView mText;
    private TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mImage = (TvImageView)findViewById(R.id.details_icon);
        mTitle = (TextView)findViewById(R.id.details_text);
        mText = (TextView)findViewById(R.id.tv_post);
        mText.setMovementMethod(ScrollingMovementMethod.getInstance());


        Intent intent = getIntent();
        mImage.setBackgroundResource(Integer.parseInt(intent.getStringExtra("mUrl")));
        mTitle.setText(intent.getStringExtra("title"));
        mText.setText(intent.getStringExtra("text"));
    }
}
