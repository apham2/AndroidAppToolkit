package root.gast.playground.AndroidTools;

import root.gast.playground.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AndroidWidgetActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.android_widgets);
    }
	
	public void onLaunchAndroidWidgetInfo(View view)
	{
		
        super.setContentView(R.layout.android_widgets_info);
	}
	
    public void onLaunchAndroidWidgetLinkClick(View view)
    {
    	Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://developer.android.com/reference/android/widget/package-summary.html"));
    	startActivity(browserIntent);
    }

}
