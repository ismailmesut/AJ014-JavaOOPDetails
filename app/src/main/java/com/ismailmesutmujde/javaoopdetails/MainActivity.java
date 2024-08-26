package com.ismailmesutmujde.javaoopdetails;

import static com.ismailmesutmujde.javaoopdetails.Cat.typeName;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Cat("Cat1", "Yellow","Brown");
        Cat cat2 = new Cat();
        cat2.name = "Cat2";
        System.out.println(cat2.name);
        //System.out.println(typeName);
        System.out.println(cat.typeName);
        cat.speakCat();
        cat.speakCatStatic();
    }

    public void test() {

    }
}