package com.hishd.animationdialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hishd.animdialog.AnimDialog;

public class MainActivity extends AppCompatActivity {

    Button btnAnimSingle;
    Button btnAnimDual;
    Button btnNoAnimSingle;
    Button btnNoAnimDual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnimSingle = findViewById(R.id.btnAnimSingle);
        btnAnimDual = findViewById(R.id.btnAnimDual);
        btnNoAnimSingle = findViewById(R.id.btnNoAnimSingle);
        btnNoAnimDual = findViewById(R.id.btnNoAnimDual);

        btnAnimSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AnimDialog(MainActivity.this)
                        .createAnimatedSingleDialog()
                        .setAnimation("loading.json")
                        .setTitle("Loading Mail")
                        .setContent("Example content to illustrate a loading animation")
                        .setButton1("OK", 0, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).show();
            }
        });
        btnAnimDual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AnimDialog(MainActivity.this)
                        .createAnimatedDualDialog()
                        .setAnimation("location.json")
                        .setTitle("Loading Location")
                        .setContent("Example content to illustrate a Location animation")
                        .setButton1("OK", 0, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        .setButton2("Cancel", 0, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked Cancel", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).show();
            }
        });
        btnNoAnimSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AnimDialog(MainActivity.this)
                        .createNonAnimatedSingleDialog()
                        .setImage(getDrawable(R.drawable.profile_blank))
                        .setTitle("Loading Contacts")
                        .setContent("Example content to illustrate a sample non anim dialog.")
                        .setButton1("OK", 0, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).show();
            }
        });
        btnNoAnimDual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AnimDialog(MainActivity.this)
                        .createNonAnimatedDualDialog()
                        .setImage(getDrawable(R.drawable.dummy_image))
                        .setTitle("Loading Images")
                        .setContent("Example content to illustrate a sample non anim dialog.")
                        .setButton1("OK", 0, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        .setButton2("Cancel", 0, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked Cancel", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).show();
            }
        });
    }
}
