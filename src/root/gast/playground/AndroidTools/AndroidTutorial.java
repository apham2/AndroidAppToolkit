package root.gast.playground.AndroidTools;

import root.gast.playground.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AndroidTutorial extends Activity{
	
	protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.android_tutorial);
    }

    public void onLaunchAndroidTutorialLinkClick(View view)
    {
    	Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.coreservlets.com/android-tutorial/"));
    	startActivity(browserIntent);
    }
	
}
