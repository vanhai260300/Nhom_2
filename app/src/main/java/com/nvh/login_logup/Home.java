package com.nvh.login_logup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    ViewFlipper viewFlipper;
    GridView gridView;
    Context context;
    List<CustomGridAdapter> custListView;
    CustomGridAdapter customAdapter;
    CustomGridAdapter customItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.botton_nagivation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.music:
                        startActivity(new Intent(getApplicationContext(), CustListView.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.noti:
                        startActivity(new Intent(getApplicationContext(), Notification.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        //getviews
        gridView = findViewById(R.id.gridView);
        custListView = new ArrayList<>();
        registerForContextMenu(gridView);

        List<Product> image_details = getListData();
        final GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new CustomGridAdapter(this, image_details));

        //add Countries Data
        //populateCountriesData();


        /*customAdapter = new CustomGridAdapter(context, custListView);
        gridView.setAdapter(customAdapter);*/

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                Product country = (Product) o;
                Toast.makeText(Home.this, "Selected :"
                        + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater =getMenuInflater();
        menu.setHeaderTitle("Menu context");
        inflater.inflate(R.menu.menu_edit,menu);

    }


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.menu_add:
                Snackbar.make(findViewById(R.id.acHome),"Add",Snackbar.LENGTH_LONG).show();
                break;
            case R.id.menu_delete:
                Snackbar.make(findViewById(R.id.acHome),"Delete",Snackbar.LENGTH_LONG).show();
                custListView.remove(info.position);
                customAdapter.notifyDataSetChanged();
                break;
            case R.id.menu_update:
                Snackbar.make(findViewById(R.id.acHome),"Update",Snackbar.LENGTH_LONG).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
    private List<Product> getListData() {
        List<Product> list = new ArrayList<Product>();
        Product product1 = new Product("Sữa tươi TC đường đen", R.drawable.sp1,"2 Thanh Sơn", 98000000);
        Product product2 = new Product("Sữa tươi TC đường đen", R.drawable.sp2,"2 Thanh Sơn", 98000000);
        Product product3 = new Product("Sữa tươi TC đường đen", R.drawable.sp3,"2 Thanh Sơn", 98000000);
        Product product4 = new Product("Sữa tươi TC đường đen", R.drawable.sp4,"2 Thanh Sơn", 98000000);
        Product product5 = new Product("Sữa tươi TC đường đen", R.drawable.sp5,"2 Thanh Sơn", 98000000);
        Product product6 = new Product("Sữa tươi TC đường đen", R.drawable.sp1,"2 Thanh Sơn", 98000000);
        Product product7 = new Product("Sữa tươi TC đường đen", R.drawable.sp2,"2 Thanh Sơn", 98000000);
        Product product8 = new Product("Sữa tươi TC đường đen", R.drawable.sp3,"2 Thanh Sơn", 98000000);
        Product product9 = new Product("Sữa tươi TC đường đen", R.drawable.sp4,"2 Thanh Sơn", 98000000);
        Product product10 = new Product("Sữa tươi TC đường đen", R.drawable.sp5,"2 Thanh Sơn", 98000000);
        Product product11 = new Product("Sữa tươi TC đường đen", R.drawable.sp1,"2 Thanh Sơn", 98000000);
        Product product12 = new Product("Sữa tươi TC đường đen", R.drawable.sp3,"2 Thanh Sơn", 98000000);
        Product product13 = new Product("Sữa tươi TC đường đen", R.drawable.sp2,"2 Thanh Sơn", 98000000);
        Product product14 = new Product("Sữa tươi TC đường đen", R.drawable.sp4,"2 Thanh Sơn", 98000000);
        Product product15 = new Product("Sữa tươi TC đường đen", R.drawable.sp1,"2 Thanh Sơn", 98000000);
        Product product16 = new Product("Sữa tươi TC đường đen", R.drawable.sp5,"2 Thanh Sơn", 98000000);


        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);
        list.add(product9);
        list.add(product10);
        list.add(product11);
        list.add(product12);
        list.add(product13);
        list.add(product14);
        list.add(product15);
        list.add(product16);

        return list;
    }
/*
    public void populateCountriesData() {
        //country 1
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);

        //country 2
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);

        //country 3
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);

        //country 4
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);

        //country 5
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);

        //country 6
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);

        //country 7
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);

        //country 8
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);

        //country 9
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);

        //country 10
        customItem = new CustomItem();
        customItem.setImage(R.drawable.sp1);
        customItem.setNameProduct("Milo Dầm");
        customItem.setAddress("2 Thanh Sơn");
        customItem.setPrice(20000);
        custListView.add(customItem);
    } */
}
