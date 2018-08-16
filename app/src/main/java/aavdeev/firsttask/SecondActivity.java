package aavdeev.firsttask;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String MESSAGE = "MESSAGE";
    private TextView mTextView;


    private View.OnClickListener mGoogleButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q="+mTextView.getText()));
            startActivity(intent);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextView = findViewById(R.id.message);
        Button mGoogleButton = findViewById(R.id.google);

        Bundle bundle = getIntent().getExtras();
        mTextView.setText(bundle.getString(MESSAGE));

        mGoogleButton.setOnClickListener(mGoogleButtonClickListener);
    }
}
