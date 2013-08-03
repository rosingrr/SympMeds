package com.example.sympmeds.test;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.TextView;

import com.example.sympmeds.DrugList;

public class C_DrugListTest extends ActivityInstrumentationTestCase2<DrugList> {

    private DrugList mActivity;		// the activity under test
    private TextView mViewName;			// the activity's TextView (for the symptom name)
    private TextView mViewDescription;			// the activity's TextView (for the symptom description)
    private String originalName;	// the original string the SymptomName textView has before starting up
    private String originalDesc;	//the original string in the SymptomDescription textView

    
	/**
	 * calls the superclass's constructor
	 */
	public C_DrugListTest() {
		super(DrugList.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp(); // calls the superclass's setUp()
		Log.d("SYMPMEDS", "super.setUp() worked");
        mActivity = this.getActivity(); //DrugList
        mActivity = this.
        Log.d("SYMPMEDS", "mActivity worked");
        mViewName = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.sympName_textView);
        Log.d("SYMPMEDS", "mViewName worked");
        mViewDescription = (TextView) mActivity.findViewById(com.example.sympmeds.R.id.sympDesc_textView);
        Log.d("SYMPMEDS", "mViewDescription worked");
        originalName = mActivity.getString(com.example.sympmeds.R.string.symptom_name);
        Log.d("SYMPMEDS", "originalName worked");
        originalDesc = mActivity.getString(com.example.sympmeds.R.string.symptom_description);
        Log.d("SYMPMEDS", "originalDesc worked");
	}

	/* 
	 * makes sure the textViews under test later are not null
	 */
    public void testPreconditions() {
    	Log.d("SYMPMEDS", "testPreconditions started");
        assertNotNull(mViewName);
        Log.d("SYMPMEDS", "mViewName worked");
        assertNotNull(mViewDescription);
    }
    
    /* 
	 * makes sure the textView with the symptom's name is updated
	 */
    public void testTextName() {
        assertFalse(originalName.equals((String)mViewName.getText()));
    }
    
    /* 
	 * makes sure the textView with the symptom's description is updated
	 */
    public void testTextDescription() {
        assertFalse(originalDesc.equals((String)mViewDescription.getText()));
    }
    
	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}

