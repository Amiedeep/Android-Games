package com.mycompany.androidgames;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import Fragments.AddPlayerNamesFragment;


public class HomeActivity extends ActionBarActivity {

    public static String PLAYER1_NAME;
    public static String PLAYER2_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        ListView listView = (ListView) findViewById(R.id.games_list_view);
//        addAndShowGames(listView);
        addItemsToNavigationDrawer();
//        ((LinearLayout)this.findViewById(R.id.home_activity)).setVisibility(LinearLayout.GONE);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.drawable.navigation_drawer_button, R.string.hello_world, R.string.app_name);
        drawerLayout.setDrawerListener(drawerToggle);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        ((DrawerLayout)this.findViewById(R.id.drawer_layout)).setVisibility(DrawerLayout.VISIBLE);
//        getSupportActionBar().hi
//        getSupportActionBar().hi


    }

    public void addItemsToNavigationDrawer() {
        getSupportActionBar();
        ListView listView = (ListView) findViewById(R.id.left_drawer);
        ArrayList<String> drawerListNames = new ArrayList<>();
        System.out.println("hiiiiiiiiiiiiii");
        drawerListNames.add("Play Sudoku");
        drawerListNames.add("play TicTacToe");
//        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_view_adapter, R.id.list_view_adapter, drawerListNames);
        listView.setAdapter(arrayAdapter);
    }

    public void addAndShowGames(ListView listView) {
        ArrayList<String> gameNames = new ArrayList<>();
        gameNames.add("Tic Tac Toe");
        gameNames.add("Sudoku");
        gameNames.add("Image Puzzle");
        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(this, R.layout.list_view_adapter, R.id.list_view_adapter, gameNames);


        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //here parent is ListView...view is i think textView..
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position) == "Tic Tac Toe") {

//                    FragmentTransaction fragmentTransaction = getFragmentManager ().beginTransaction();
//                    AddPlayerNamesFragment fragment = new AddPlayerNamesFragment();
//                    fragmentTransaction.add(R.id.home_activity, fragment);
//                    fragmentTransaction.commit();
                    setContentView(R.layout.fragment_add_player_names);
//                    getSupportActionBar().hide(); to hide action bar....


                }
//                System.out.println("****s******************************"+parent+"##########################");
//                System.out.println("**********************************"+view+"##########################");
//                System.out.println("**********************************"+position+"##########################");
//                System.out.println("**********************************"+id+"##########################");
            }


        });

    }

    public void getPlayerNames(View view) {
        EditText editText = (EditText) findViewById(R.id.player1_name);
        String player1_name = editText.getText().toString();
        editText = (EditText) findViewById(R.id.player2_name);
        String player2_name = editText.getText().toString();
        Intent intent = new Intent(this, TicTacToe.class);
        intent.putExtra(PLAYER1_NAME, player1_name);
        intent.putExtra(PLAYER2_NAME, player2_name);
        startActivity(intent);

//        System.out.println("************************"+player1_name+"************"+player2_name);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        System.out.println(menu);
        getMenuInflater().inflate(R.menu.menu_home, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }


    //    public void startGame(View view) {
//
//    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_home, menu);
//        return true;
//    }

//    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
//        if(id == R.id.navigation_drawer_button_id) {
//
//        }

        return super.onOptionsItemSelected(item);
    }
}
