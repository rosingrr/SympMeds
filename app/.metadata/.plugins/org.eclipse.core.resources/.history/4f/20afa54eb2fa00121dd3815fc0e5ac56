package com.example.sympmeds.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.sympmeds.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity mActivity;		// the activity under test
    private TextView mViewWelcome;			// the activity's TextView (for the symptom name)
    private String original;	// the original string the textViews have before starting up
    
	/**
	 * @
	 */
	public MainActivityTest() {
		super(MainActivity.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
        mActivity = this.getActivity(); //MainActivity
        mViewWelcome = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.welcom_textView);
        original = mActivity.getString(com.example.sympmeds.R.string.welcome);	//the starting string of the textViews
	}

	/* 
	 * makes sure the textViews under test later are not null
	 */
    public void testPreconditions() {
        assertNotNull(mViewWelcome);
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
