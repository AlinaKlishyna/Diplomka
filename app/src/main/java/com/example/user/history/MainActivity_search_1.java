package com.example.user.history;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_search_1 extends AppCompatActivity {
    MaterialSearchView searchView;
    ListView lstView;


    String[] lstSource = {


            "Аскольд — напівлегендарний варязький київський князь (860—882). Засновник Київського князівства в Наддніпрянській Україні. Згадується у «Повісті временних літ». Правив разом із Діром.",
            "Дір — напівлегендарний київський князь. Дата та причини смерті Діра невідомі. З огляду на те, що походом русів на Константинополь 860 року керував єдиний володар і швидше за все ним був Аскольд, можна вважати, що Дір помер принаймні трохи раніше (в той же час Михайло Грушевський вважав, що Дір міг правити й пізніше за Аскольда).",
            "Олег — напівлегендарний київський князь (882—912) варязького походження. Родич або соратник Рюрика. Регент при княжичу Ігору. Згідно з «Повістю минулих літ» завоював Київ, убивши місцевих правителів, варягів Аскольда і Діра; після чого промовив слова «хай буде се мати городам руським». ",
            "Ігор Рюриикович — руський князь із династії Рюриковичів. Князь київський (915—945). Згідно з «Повістю временних літ» — син варязького князя Рюрика. Основоположник київської династії князів. Ймовірно, здійснив два походи на Константинополь (941 і 944), що закінчилися укладанням русько-візантійського договору.",
            "Ольга — руська княгиня із династії Рюриковичів. Княгиня київська (945—962), дружина київського князя Ігоря Рюриковича. Мати Святослава Ігоровича. Помстилася деревлянам за загибель чоловіка (945—946).",
            "Володимир Святославич — руський князь із варязької династії Рюриковичів. Великий князь київський (979–1015), правитель і хреститель Київської Русі. Новгородський князь (970–988). Наймолодший (позашлюбний) син київського князя Святослава Ігоровича від коханки-ключниці Малки. Онук київської княгині Ольги, батько київського князя Ярослава Мудрого. ",
            "Ярослав Володимирович (983 / 987 — 17/20 лютого 1054) — руський князь із династії Рюриковичів. Великий князь київський (1015–1018, 1019–1054). Князь ростовський (988–1010) і новгородський (1010–1034). Другий син київського князя Володимира Святославича від полоцької князівни Рогніди. 988 року, за наказом батька, став намісником у Ростові. Був одружений з Інгігердою, шведською принцесою. ",
            "Володиимр Всеволодович, відомий як Володимир Мономах (давньорус. Володимеръ Всеволодовичь; 1053 — 19 травня 1125) — руський князь із династії Рюриковичів. Великий князь київський (1113-1125). Князь смоленський (1073—1078), чернігівський (1076—1077, 1078—1094) і переяславський (1094—1113). Син князя Всеволода Ярославича і візантійської княжни Марії (за іншими даними — Анни чи Анастасії) з роду Мономахів. Засновник князівської гілки Мономаховичів.  ",
            "Богдан (Зеновій-Богдан) Михайлович Хмельницький (27 грудня 1595 (6 січня 1596),  — 27 липня (6 серпня) 1657) — український військовий, політичний та державний діяч. Гетьман Війська Запорозького, очільник Гетьманщини (1648–1657). Керівник Хмельниччини — повстання проти зловживань коронної шляхти в Україні, котре переросло у загальну, очолену козацтвом, визвольну війну проти Речі Посполитої. Перший з козацьких ватажків, котрому офіційно було надано титул гетьмана. Намагався розбудувати незалежну українську державу, укладаючи протягом свого правління союзи з Кримським ханатом та Московським царством. Представник роду Хмельницьких.",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_1);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_search);
        setSupportActionBar(toolbar);
        char dm = (char) 34;
        getSupportActionBar().setTitle("Словник: "+dm+"Біографія"+dm);
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

        lstView = (ListView)findViewById(R.id.lstView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,lstSource);
        lstView.setAdapter(adapter);


        searchView = (MaterialSearchView)findViewById(R.id.search_view);

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {

                //If closed Search View , lstView will return default
                lstView = (ListView)findViewById(R.id.lstView);
                ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_1.this,android.R.layout.simple_list_item_1,lstSource);
                lstView.setAdapter(adapter);

            }
        });

        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(newText != null && !newText.isEmpty()){
                    List<String> lstFound = new ArrayList<String>();
                    for(String item:lstSource){
                        if(item.contains(newText))
                            lstFound.add(item);
                    }

                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_1.this,android.R.layout.simple_list_item_1,lstFound);
                    lstView.setAdapter(adapter);
                }
                else{
                    //if search text is null
                    //return default
                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_1.this,android.R.layout.simple_list_item_1,lstSource);
                    lstView.setAdapter(adapter);
                }
                return true;
            }

        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }
}
