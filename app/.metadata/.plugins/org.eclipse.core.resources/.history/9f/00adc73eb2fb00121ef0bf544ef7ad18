package com.example.sympmeds.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sympmeds.SymptomList;

public class SymptomListTest extends ActivityInstrumentationTestCase2<SymptomList> {
    private SymptomList mActivity;		// the activity under test
    private TextView mViewInstr;			// the activity's TextView (for the instructions)
    private Spinner mSpinner;	//the activity's Spinner (for the list of symptoms)
    private Button mButtonSearch;	//the activity's Search button
    private Button mButtonNearestPharmacy;	//the activity's Nearest Pharmacy button
    
	/**
	 * @
	 */
	public SymptomListTest() {
		super(SymptomList.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
        mActivity = this.getActivity(); //MainActivity
        mViewInstr = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.sympInstr_textView);
        mSpinner = (Spinner) mActivity.findViewById(com.example.sympmeds.R.id.symptom_spinner);
        mButtonSearch = (Button) mActivity.findViewById(com.example.sympmeds.R.id.search_button);
        mButtonNearestPharmacy = (Button) mActivity.findViewById(com.example.sympmeds.R.id.sympListNearest_button);
	}

	/* 
	 * makes sure the textViews under test later are not null
	 */
    public void testPreconditions() {
    	assertNotNull(mViewInstr);
    	assertNotNull(mSpinner);
        assertNotNull(mButtonSearch);
        assertNotNull(mButtonNearestPharmacy);
    }
    
	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
