package com.example.hp.recycleview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String arr[]={
            "NodeJS",
            "Python",
            "Kotlin"};
    String[] countryNames={"India","China","Australia","Portugle"};
    int flags[] = {R.drawable.full_stack, R.drawable.python, R.drawable.react_fiber, R.drawable.tensorflow};
    private Spinner spinner;
    private RecyclerView recyclerView;
    private WebView webview;
    private List<Person> listPerson = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    public void initView(){
        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<DataShop> dataShops = new ArrayList<>();
        dataShops.add(new DataShop(R.drawable.full_stack, "Full Stack"));
        dataShops.add(new DataShop(R.drawable.python, "Python"));
        dataShops.add(new DataShop(R.drawable.react_fiber, "React fiber"));
        dataShops.add(new DataShop(R.drawable.tensorflow, "Tensorflow"));

        ShopAdapter shopAdapter = new ShopAdapter(dataShops, MainActivity.this);
        recyclerView.setAdapter(shopAdapter);

        spinner = (Spinner) findViewById(R.id.spinner);
        listPerson.add(new Person(R.drawable.full_stack,"Le Khanh Duy", false));
        listPerson.add(new Person(R.drawable.python,"Hugo Bui", false));
        listPerson.add(new Person(R.drawable.tensorflow,"Nguyen Hoang Quy", false));
        listPerson.add(new Person(R.drawable.react_fiber,"Tran Tien Dung", false));
        final SpinnerAdapter spinnerAdapter=new SpinnerAdapter(this,R.layout.row_spinner,listPerson);
        shopAdapter.notifyDataSetChanged();
        spinner.setAdapter(spinnerAdapter);

        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewController());
        webview.getSettings().setLoadsImagesAutomatically(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webview.loadUrl("http://www.google.com");
    }


}
