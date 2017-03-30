package reco.frame.demo.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import reco.frame.demo.R;
import reco.frame.tv.view.TvImageView;

public class DetailsActivity extends Activity {

    private TvImageView mImage;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mImage = (TvImageView)findViewById(R.id.details_icon);
        mText = (TextView)findViewById(R.id.details_text);

        Intent intent = getIntent();
        mImage.setBackgroundResource(Integer.parseInt(intent.getStringExtra("mUrl")));
        mText.setText(intent.getStringExtra("text"));
    }
}
