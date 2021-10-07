package com.example.changesizetext.ui;

import android.content.Intent;
import android.os.Binder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.changesizetext.R;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.databinding.ActivityChangeSizeTextBinding;
import com.example.changesizetext.databinding.ActivityViewMessageBinding;

public class ViewMessageActivity extends AppCompatActivity {
    ActivityViewMessageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        Message msg = (Message) getIntent().getExtras().getSerializable("message");
        binding.tvMessage.setText(msg.getMessage());
        binding.tvMessage.setTextSize(msg.getSize());

    }
}