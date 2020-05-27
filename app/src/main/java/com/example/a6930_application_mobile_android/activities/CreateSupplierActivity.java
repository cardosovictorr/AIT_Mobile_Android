package com.example.a6930_application_mobile_android.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a6930_application_mobile_android.R;

public class CreateSupplierActivity extends AppCompatActivity {

    //the add button will be implemented to add the information in the database
    //Button addButton;
    Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_supplier);

        cancelButton = findViewById(R.id.cancelButton);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMainPageUserIntent = new Intent(CreateSupplierActivity.this,OptionsPageActivity.class);

                startActivity(goToMainPageUserIntent);
            }
        });



    }
}
