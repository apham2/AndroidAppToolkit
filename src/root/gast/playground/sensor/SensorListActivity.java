/*
 * Code adapted from Greg Milette and Adam Stroud
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package root.gast.playground.sensor;

import root.gast.playground.R;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * @author Greg Milette &#60;<a href="mailto:gregorym@gmail.com">gregorym@gmail.com</a>&#62;
 */
public class SensorListActivity extends FragmentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensor_main);

        // wire up the fragments so selector
        // can call display
        SensorDisplayFragment sensorDisplay =
                (SensorDisplayFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.frag_sensor_view);
        SensorSelectorFragment sensorSelect =
                (SensorSelectorFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.frag_sensor_select);
        sensorSelect.setSensorDisplay(sensorDisplay);
    }
}
