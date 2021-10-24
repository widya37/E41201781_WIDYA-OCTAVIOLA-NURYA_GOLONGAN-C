package com.example.manajemenfile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import  android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    private int STOROGE_PERMISSION_CODE = 23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText2);
    }

    public void next(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
    startActivity(intent);
    }

    public void savePublic(View view) {
    //Permission to acces external stroge
    ActivityCompat.requestPermissions( this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STOROGE_PERMISSION_CODE);
    String info = editText.getText().toString();
    File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);// Folder Name
    File myfile = new File(folder, "myData1.txt");//Filename
    writeData(myfile, info);
    editText.setText("");

    }

    public void savePrivate(View view) {
        String info = editText.getText().toString();
        File folder = getExternalFilesDir("arvita");// Folder Name
        File myFile = new File(folder, "myData2.txt");//FIlename
        writeData(myFile, info);
        editText.setText("");
    }

    private void writeData(File myfile, String data){
        FileOutputStream fileOutputStream = null;
        try {
            System.out.println("TES");
            fileOutputStream = new FileOutputStream(myfile);
                fileOutputStream.write((data.getBytes()));
                Toast.makeText(this, "Done" + myfile.getAbsolutePath(), Toast.LENGTH_SHORT).show();
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                if (fileOutputStream != null){
                    try {
                        fileOutputStream.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }