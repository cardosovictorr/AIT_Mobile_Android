package com.example.a6930_application_mobile_android.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.a6930_application_mobile_android.MainActivity;
import com.example.a6930_application_mobile_android.R;

public class OptionsPageActivity extends AppCompatActivity {

    ImageButton backButton;
    Button createListSupplierButton;
    Button seeYourListButton;
    Button deleteSupplierButton;
    Button searchSupplierButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_page);

        backButton = findViewById(R.id.backImageButton);
        createListSupplierButton = findViewById(R.id.createListSupplierButton);
        seeYourListButton = findViewById(R.id.seeYourListButton);
        deleteSupplierButton = findViewById(R.id.deleteSupplierButton);
        searchSupplierButton = findViewById(R.id.searchSupplierButton);

        //Button to get back to login page
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToLoginPageIntent = new Intent(OptionsPageActivity.this, MainActivity.class);

                startActivity(goToLoginPageIntent);

            }
        });

        //Button, if clicked, to see add new suppliers in the list
        createListSupplierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCreateSupplierPageIntent = new Intent(OptionsPageActivity.this,CreateSupplierActivity.class);

                startActivity(goToCreateSupplierPageIntent);
            }
        });

        //Button, if clicked, to see the list of the suppliers the user has added
        seeYourListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSeeSupplierListPageIntent = new Intent(OptionsPageActivity.this, SeeSuppliersListActivity.class);

                startActivity(goToSeeSupplierListPageIntent);
            }
        });

        //Button to go to delete screen
        deleteSupplierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDeleteSupplierPageIntent = new Intent(OptionsPageActivity.this, DeleteSupplierActivity.class);

                startActivity(goToDeleteSupplierPageIntent);
            }
        });

        //Button to Search Screen
        searchSupplierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSearchSupplierPageIntent = new Intent(OptionsPageActivity.this, SearchSupplierActivity.class);

                startActivity(goToSearchSupplierPageIntent);
            }
        });

    }
}
