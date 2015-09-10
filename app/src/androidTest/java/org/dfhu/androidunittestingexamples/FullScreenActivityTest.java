package org.dfhu.androidunittestingexamples;


import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

public class FullScreenActivityTest extends ActivityInstrumentationTestCase2<FullscreenActivity> {

    public FullscreenActivity mActivity;
    public Button mGoButton;

    public FullScreenActivityTest() {
        super(FullscreenActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mActivity = getActivity();
        mGoButton = (Button) mActivity.findViewById(R.id.goButton);
    }

    public void testDummyFunction ()
    {
        assertTrue(mGoButton != null);
    }
}
