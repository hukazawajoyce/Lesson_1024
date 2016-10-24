package com.hukazawa.user.lesson_1024;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class rec2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec2);
        TextView tv = (TextView) findViewById(R.id.textView2);
        Intent it =getIntent();
        String str = it.getStringExtra(Intent.EXTRA_TEXT);
        tv.setText(str);
    }

}
