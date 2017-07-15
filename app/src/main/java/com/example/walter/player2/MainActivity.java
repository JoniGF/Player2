package com.example.walter.player2;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> item = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       item = new ArrayList<>();
        File f = new File(Environment.getExternalStorageDirectory()+"");
        File[] files = f.listFiles();
        for (File file : files){

            if (file.getName().contains("mp3")){
                item.addAll(file.getName());
            }
        }



        ListView list = (ListView)findViewById(R.id.list);
        ArrayAdapter<String> adp = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,item);
        list.setAdapter(adp);


      /*TextView txt = (TextView)findViewById(R.id.textView);
        txt.setText(System.getenv("SECONDARY_STORAGE"));*/
    }

    private ArrayList<String> file(String root){
        ArrayList<String> al = new ArrayList<>();
        File [] file = ;
        return al;
    }
    public static String readFileAsString(String filePath) throws java.io.IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line, results = "";
        while( ( line = reader.readLine() ) != null)
        {
            results += line;
        }
        reader.close();
        return results;

    }


}
