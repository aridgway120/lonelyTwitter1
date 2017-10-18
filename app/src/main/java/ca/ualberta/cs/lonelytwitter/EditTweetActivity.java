package ca.ualberta.cs.lonelytwitter;


import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class EditTweetActivity extends Activity {

    private String date;
    private String message;
    private TextView dateText;
    private TextView messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Bundle extras = getIntent().getExtras();

        date = extras.getString("date");
        message = extras.getString("message");

        dateText = (TextView) findViewById(R.id.textViewDate);
        messageText = (TextView) findViewById(R.id.textViewMessage);

        dateText.setText("Date: " + date);
        messageText.setText("Message: " + message);
    }
}
