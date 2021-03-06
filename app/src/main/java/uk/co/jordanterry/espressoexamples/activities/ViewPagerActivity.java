package uk.co.jordanterry.espressoexamples.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import test.nice.testproject.R;
import uk.co.jordanterry.espressoexamples.fragments.ViewPagerFragment;

public class ViewPagerActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction().add(R.id.container, ViewPagerFragment.newInstance()).commit();
		}
	}

}
