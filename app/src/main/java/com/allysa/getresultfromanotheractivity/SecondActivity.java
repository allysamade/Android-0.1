package com.allysa.getresultfromanotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView txtMsgObj;
    private Intent fromFirstAct;
    private String msg;
    private String reply;
    private Intent intent_reply;

    private EditText inReplyObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtMsgObj = (TextView) findViewById(R.id.txtMsg);

        fromFirstAct = getIntent();
        msg = fromFirstAct.getStringExtra("msg");

        txtMsgObj.setText(msg);

        inReplyObj = (EditText) findViewById(R.id.inReply);
    }

    public void reply (View v){
        intent_reply = new Intent();
        reply = inReplyObj.getText().toString();
        intent_reply.putExtra("replyMsg",reply);


        setResult(RESULT_OK, intent_reply);
        finish();
        //startActivity(intent_reply);
    }
}
