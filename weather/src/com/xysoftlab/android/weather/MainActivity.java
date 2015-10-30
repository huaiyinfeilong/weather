package com.xysoftlab.android.weather;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Calendar;
import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

	void InitializeDayButtons()
	{
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek, month, day;
		ArrayList buttonTextList = new ArrayList();
		for (int i = 0; i < 7; i++)
		{
			calendar.add(Calendar.DAY_OF_YEAR, i);
			dayOfWeek = calendar.get(Calendar.DAY_OF_YEAR);
			month = calendar.get(Calendar.MONTH) + 1;
			day = calendar.get(Calendar.DAY_OF_YEAR);
			String buttonText；
			switch (dayOfWeek)
			{
			case 1:
				buttonText = String.format("周一 %d月%d日", month, day);
			break;
			case 2:
			break;
			case 3:
			break;
			case 4:
			break;
			case 5:
			break;
			case 6:
			break;
			case 7:
			break;
			}
			buttonTextList.add(buttonText);
		}

	}
}
