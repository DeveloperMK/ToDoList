package com.michael.todolist;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.michael.todolist.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class Sharing extends AppCompatActivity {

//    Button button;

//    String theList = go.getStringExtra("TheList");

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sharing);
//
//        Bundle extras = getIntent().getExtras();
//        final String theList;
//        theList = extras.getString("theList");
//
//
//        button = findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
//                ClipData clip = ClipData.newPlainText("label", theList);
//                if (clipboard == null || clip == null) return;
//                clipboard.setPrimaryClip(clip);
//            }
//        });
//
//    }
}

// holder.yourTextView.getText().tostring()