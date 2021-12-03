package munni.priyanka.digi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class ShowSubjectListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_subject_list);
        getSupportActionBar().setTitle("Subject");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#2C3D43"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
    }

    public void openNotesActivity(View view) {
        Intent intent = new Intent(ShowSubjectListActivity.this,NotesofActivity.class);
        startActivity(intent);
        finish();
    }
}