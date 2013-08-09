package com.example.sympmeds.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sympmeds.SymptomList;

public class B_SymptomListTest extends ActivityInstrumentationTestCase2<SymptomList> {
    private SymptomList mActivity;		// the activity under test
    private TextView mViewSympInstr;			// the activity's TextView (for the instructions)
    private Spinner mSpinnerSymp;	//the activity's Spinner (for the list of symptoms)
    private Button mButtonSearch;	//the activity's Search button
    private static final int SYMPTOM_COUNT = 15;
    
	/**
	 * @
	 */
	public B_SymptomListTest() {
		super(SymptomList.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp(); // calls the superclass's setUp()
		
		//initialize the activity and any widgets
        mActivity = this.getActivity(); //MainActivity
        mViewSympInstr = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.sympInstr_textView);
        mSpinnerSymp = (Spinner) mActivity.findViewById(com.example.sympmeds.R.id.symptom_spinner);
        mButtonSearch = (Button) mActivity.findViewById(com.example.sympmeds.R.id.search_button);
	}

	/* 
	 * makes sure all the widgets are not null
	 */
    public void testPreconditions() {
    	assertNotNull(mViewSympInstr);
    	assertNotNull(mSpinnerSymp);
        assertNotNull(mButtonSearch);
    }
    
    /*
     * makes sure Search button is clickable
     */
    public void testSearchButton() {
    	assertTrue(mButtonSearch.callOnClick());
    }    
    
    /*
     * makes sure the Symptoms spinner is the correct size
     */
    public void testSympSpinner() {
    	assertEquals(mSpinnerSymp.getCount(), SYMPTOM_COUNT);
    }
    
	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
