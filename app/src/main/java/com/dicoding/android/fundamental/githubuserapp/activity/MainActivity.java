package com.dicoding.android.fundamental.githubuserapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;


import com.dicoding.android.fundamental.githubuserapp.Database.LocalData;
import com.dicoding.android.fundamental.githubuserapp.R;
import com.dicoding.android.fundamental.githubuserapp.adapter.AdapterGithubapp;
import com.dicoding.android.fundamental.githubuserapp.pojo.Pojogithub;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProfilgithub;
    private ArrayList<Pojogithub> dataModelUser = new ArrayList<>();
    private  TextView username;
    private CircleImageView profillist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProfilgithub =findViewById(R.id.rvprofilgithub);
        username = findViewById(R.id.tvusernamelist);
        profillist = findViewById(R.id.ivImage);

        rvProfilgithub.setHasFixedSize(true);
        dataModelUser.addAll(LocalData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvProfilgithub.setLayoutManager(new LinearLayoutManager(this));
        AdapterGithubapp listgithubAdapter = new AdapterGithubapp(this, dataModelUser);   //LIAT LAGI SAMA LIAT LAGI DI CONTRUCTOR BLANK DI ADAPTER
        rvProfilgithub.setAdapter(listgithubAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        MenuItem menuItem = menu.findItem(R.id.search);
        if (searchManager != null) {
//            SearchView searchView = (SearchView) (menu.findItem(R.id.search)).getActionView();
            SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setQueryHint(getResources().getString(R.string.search_hint));
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    Toast.makeText(MainActivity.this, query, Toast.LENGTH_SHORT).show();
                    return true;
                }
                @Override
                public boolean onQueryTextChange(String newText) {
                    return false;
                }
            });
        }
        return true;
    }



}
