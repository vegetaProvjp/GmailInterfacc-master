package com.example.gmailinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ProductModel> listMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listMail = new ArrayList<>();
        listMail.add(new ProductModel("Hey Nguyen, your new personal recommendations are here!","Here are 15 freshly picked courses — chosen for your unique interests","Udemy","15:08","U"));
        listMail.add(new ProductModel("Is Facebook still coded in PHP?","Yes and no. Facebook was initially coded in pure, vanilla PHP, but over the years, the social media giant needed more capabilities to support their burgeoning user base,","Quora","06:12","Q"));
        listMail.add(new ProductModel("MEGA is missing you!","We notice that you haven’t used your MEGA account recently. We would love to see you back!","MEGA","16:35","M"));
        listMail.add(new ProductModel("Trick or Treat! Pngtree has prepared Halloween Surprise for u","1000+ Free Images，Pngtree has prepared for you","BOOK","19:01","B"));
        listMail.add(new ProductModel("Why aren’t you using Golang?\n","At work, I work in “the enterprise”, and Go isn’t in that space. I do use tools that are written in Go, but I haven’t written original code.", "Quora Digest","14:12","Q"));
        listMail.add(new ProductModel("Educational Codeforces","The goal of educational rounds is to practice and educate, rather than to compete. You can read the details in this post dedicated to them.","CODEFOURCES","06:02","E"));
        listMail.add(new ProductModel("Sang, your top recommendation is.","Truly a data visionary! Hans Rosling was a master at consuming information and then rearranging it into a larger picture that viewers can easily comprehend. Watching this talk will help spark your wisdom.","TED Recommends","21:35","W"));
        listMail.add(new ProductModel("Hey Nguyen, your new personal recommendations are here!","Here are 15 freshly picked courses — chosen for your unique interests","Udemy","15:08","U"));
        listMail.add(new ProductModel("Is Facebook still coded in PHP?","Yes and no. Facebook was initially coded in pure, vanilla PHP, but over the years, the social media giant needed more capabilities to support their burgeoning user base,","Quora","06:12","Q"));
        listMail.add(new ProductModel("MEGA is missing you!","We notice that you haven’t used your MEGA account recently. We would love to see you back!","MEGA","16:35","M"));
        listMail.add(new ProductModel("Last hours to retry your apps for free","We’ve reset the clock on product trials provided as part of your free Adobe Creative Cloud membership,  ","Adobe Creative Cloud" ,"15:00","A"));
        listMail.add(new ProductModel("Trick or Treat! Pngtree has prepared Halloween Surprise for u","1000+ Free Images，Pngtree has prepared for you","BOOK","19:01","B"));
        ListViewAdapter adapter = new ListViewAdapter(listMail);
        ListView listView =findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}