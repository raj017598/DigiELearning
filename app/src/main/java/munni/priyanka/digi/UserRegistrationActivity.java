package munni.priyanka.digi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
        getSupportActionBar().hide();
    }

    public void openLoginActivity(View view) {
        Intent intent = new Intent(UserRegistrationActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void openHomeActivity(View view) {
        Intent intent = new Intent(UserRegistrationActivity.this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
}