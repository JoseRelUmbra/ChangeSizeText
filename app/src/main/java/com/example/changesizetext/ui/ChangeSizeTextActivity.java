package com.example.changesizetext.ui;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.changesizetext.ChangeSizeAplication;
import com.example.changesizetext.R;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.data.model.User;
import com.example.changesizetext.databinding.ActivityChangeSizeTextBinding;

public class ChangeSizeTextActivity extends AppCompatActivity {
    private static final String TAG = "Actividad ChangeSizeText";
    ActivityChangeSizeTextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityChangeSizeTextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnSend.setOnClickListener(view ->  {
            //crear bundler
            Bundle bnd = new Bundle();
            //añadir objeto al bundler
            Message msg = new Message(((ChangeSizeAplication)getApplication()).getUser(),binding.edMessage.getText().toString(),binding.skSize.getProgress());
            bnd.putSerializable("message", msg);
            //enviar intent con el bundler
            startActivity(new Intent(this, ViewMessageActivity.class).putExtras(bnd));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"ChangeSizeTextActivity -> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ChangeSizeTextActivity -> onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ChangeSizeTextActivity -> onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"ChangeSizeTextActivity -> onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ChangeSizeTextActivity -> onDestroy()");
    }
}