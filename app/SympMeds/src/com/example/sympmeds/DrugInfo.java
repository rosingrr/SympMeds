package com.example.sympmeds;

import java.io.IOException;
import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class DrugInfo extends Activity {

	/**onCreate() is called when the DrugInfo activity is started, which is when the
	 * Get Info button from the DrugList activity is pushed.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Get the symptom from the intent; this area is not done
		Intent intent = getIntent();
		String drug = intent.getStringExtra(DrugList.DRUG_INFO);

		setContentView(R.layout.activity_drug_info);

		//open excel and get the correct sheet
		AssetManager assetManager = getResources().getAssets();
		InputStream inputStream = null;
		try{
			inputStream = assetManager.open("Database.xls");
		} catch(IOException e) {
			Log.e("SYMPMEDS", "error 1 di");
			e.printStackTrace();
		}
		//Log.i("SYMPMEDS", inputStream.toString());
		Workbook wb = null;
		try{
			try {
				wb = Workbook.getWorkbook(inputStream);
				//Log.i("SYMPMEDS", "wb = workbook worked");

			} catch (IOException e) {
				Log.e("SYMPMEDS", "error 2 di");
				e.printStackTrace();
			}
		} catch(BiffException e) {
			Log.e("SYMPMEDS", "error 3 di");
			e.printStackTrace();
		}
		try {
			inputStream.close();
			//Log.i("SYMPMEDS", "inputStream.close() worked");
		} catch (IOException e) {
			Log.e("SYMPMEDS", "error 4 di");
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet(1);
		//Log.i("SYMPMEDS", sheet.getName());
		//List<String> list = new ArrayList<String>();
		//String rowNum = sheet.getRows() + "";
		//Log.i("SYMPMEDS", rowNum);
		Log.d("SYMPMEDS", "opened file");

		//finds the correct drug
		int i;
		Cell cell;
		String text = "";
		for(i = 1; i < sheet.getRows(); i++) {
			cell = sheet.getCell(0, i);
			text = cell.getContents();
			if (drug.equals(text)) {
				break;
			}
		}
		Log.d("SYMPMEDS", "i = " + i);

		//enters strings into textViews
        TextView drugName = (TextView) findViewById(R.id.drugName_textView);
        drugName.setText(text);
        Log.d("SYMPMEDS", "text = " + text);
        cell = sheet.getCell(1, i);
        text = cell.getContents();
        TextView drugSymp = (TextView) findViewById(R.id.drugSymp_textView);
        drugSymp.setText(text);
        Log.d("SYMPMEDS", "text = " + text);
        cell = sheet.getCell(2, i);
        text = cell.getContents();
        TextView drugSideEffs = (TextView) findViewById(R.id.drugSideEffects_textView);
        drugSideEffs.setText(text);
        Log.d("SYMPMEDS", "text = " + text);
        cell = sheet.getCell(3, i);
        Log.d("SYMPMEDS", "cell worked");
        text = cell.getContents();
        Log.d("SYMPMEDS", "text = " + text);
        TextView drugDir = (TextView) findViewById(R.id.drugDirections_textView);
        Log.d("SYMPMEDS", "textview worked");
        drugDir.setText(text);
        Log.d("SYMPMEDS", "textViews worked");
	}

    /**
     * This was generated by default by Eclipse
     */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drug_info, menu);
		return true;
	}

}