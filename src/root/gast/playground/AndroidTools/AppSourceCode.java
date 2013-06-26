package root.gast.playground.AndroidTools;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class AppSourceCode extends Activity {
	
    public void onLaunchAndroidSourceCode(View view)
    {
    	Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.coreservlets.com/android-tutorial/"));
    	startActivity(browserIntent);
    }

}
