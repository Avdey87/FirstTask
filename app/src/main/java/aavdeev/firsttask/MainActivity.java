package aavdeev.firsttask;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mQueryInputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQueryInputView = findViewById(R.id.ed_text);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTextExists()) {
                    showMessage(mQueryInputView.getText().toString());
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra(SecondActivity.MESSAGE, mQueryInputView.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private boolean isTextExists() {
        return !TextUtils.isEmpty(mQueryInputView.getText());
    }

    private void showMessage(@NonNull String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

}
