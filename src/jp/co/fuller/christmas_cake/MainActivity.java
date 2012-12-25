
package jp.co.fuller.christmas_cake;

import org.taptwo.android.widget.TitleFlowIndicator;
import org.taptwo.android.widget.ViewFlow;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends Activity {

    private ViewFlow mViewFlow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);
        setContentView(R.layout.activity_main);

        mViewFlow = (ViewFlow) findViewById(R.id.viewflow);
        ImageAdapter adapter = new ImageAdapter(this);
        mViewFlow.setAdapter(adapter, 0);
        TitleFlowIndicator indicator = (TitleFlowIndicator) findViewById(R.id.viewflowindic);
        indicator.setTitleProvider(adapter);
        mViewFlow.setFlowIndicator(indicator);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mViewFlow.onConfigurationChanged(newConfig);
    }
}
