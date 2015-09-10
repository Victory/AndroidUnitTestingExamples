package org.dfhu.androidunittestingexamples;


import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import junit.framework.TestCase;

public class FullScreenActivityTest extends ActivityInstrumentationTestCase2<FullscreenActivity> {

    public FullScreenActivityTest() {
        super(FullscreenActivity.class);
    }

    public void testDummyFunction ()
    {
        FullscreenActivity activity = getActivity();
        Button button = (Button) activity.findViewById(R.id.goButton);
        assertTrue(button != null);
    }
}
