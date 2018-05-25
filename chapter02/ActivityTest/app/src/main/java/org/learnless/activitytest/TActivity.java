package org.learnless.activitytest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 18.5.24.
 */

public class TActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "TActivity";

    private Button mBuuton1;

    public static Intent newIntent(Context context, boolean data1) {
        return new Intent(context, TActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mBuuton1 = findViewById(R.id.first_button_finish);
        mBuuton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.first_button_finish:
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;

            default: break;
        }
    }
}
