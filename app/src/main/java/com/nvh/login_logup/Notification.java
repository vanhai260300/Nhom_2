package com.nvh.login_logup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Notification extends Activity {
    TextView thong_bao,logout;
    Button btnsave,btnhome,btnlist,btnnotification,btnperson;
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        BottomNavigationView bottomNavigationView = findViewById(R.id.botton_nagivation);
        bottomNavigationView.setSelectedItemId(R.id.noti);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.music:
                        startActivity(new Intent(getApplicationContext(), CustListView.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.noti:
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });


        //Listview
        lv = (ListView) findViewById(R.id.list_foods);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","1h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","30p"));
        arr_bean.add(new ListViewBean(R.drawable.now,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Highland Coffee tặng bạn ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","3h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new ListViewBean(R.drawable.now,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","10p"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Highland Coffee tặng bạn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.now,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Highland Coffee tặng bạn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));

        adapter=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(adapter);




    }


}