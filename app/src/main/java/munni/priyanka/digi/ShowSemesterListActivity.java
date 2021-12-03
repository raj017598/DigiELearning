package munni.priyanka.digi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class ShowSemesterListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_semester_list);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#240b36"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        getSupportActionBar().setTitle("BCA");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void openSubjectActivity(View view) {
        Intent intent = new Intent(ShowSemesterListActivity.this,ShowSubjectListActivity.class);
        startActivity(intent);
        finish();
    }
}