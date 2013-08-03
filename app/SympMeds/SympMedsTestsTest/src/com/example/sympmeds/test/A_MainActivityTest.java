package com.example.sympmeds.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import com.example.sympmeds.MainActivity;

public class A_MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity mActivity;		// the activity under test
    private TextView mViewWelcome;			// the activity's TextView (for the welcome and disclaimer)
    private Button mButtonStart;	//the activity's Start button
    private String original;	// the original string the textViews have before starting up
    
	/**
	 * @
	 */
	public A_MainActivityTest() {
		super(MainActivity.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
        mActivity = this.getActivity(); //MainActivity
        mViewWelcome = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.welcom_textView);
        mButtonStart = (Button) mActivity.findViewById(com.example.sympmeds.R.id.start_button);
        original = mActivity.getString(com.example.sympmeds.R.string.welcome);	//the starting string of the textViews
	}

	/* 
	 * makes sure the textViews under test later are not null
	 */
    public void testPreconditions() {
        assertNotNull(mViewWelcome);
        assertNotNull(mButtonStart);
    }
    
    /*
     * makes sure the welcome_textView is not changed
     */
    public void testTextWelcome() {
    	assert(original.equals((String)mViewWelcome.getText()));
    }
    
	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
