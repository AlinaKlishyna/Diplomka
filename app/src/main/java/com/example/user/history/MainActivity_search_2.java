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

public class MainActivity_search_2 extends AppCompatActivity {
    MaterialSearchView searchView;
    ListView lstView;
    String mess;


    String[] lstSource = {



            "966-867 рр. – похід на в’ятичів та Волзьку Болгарію;",
            "965, 966 рр. – похід на Хозарський каганат та його розгром;",
            "967-971 рр. – похід на Болгарське царство та укладення під Доростолом мирного договору з Візантією.",
            "1141 р. – об’єднання Галицького князівства за Володимирка Володаровича (1141-1153 рр.).",
            "Найвищого розквіту і могутності Галицьке князівство досягло за часів правління Ярослава Осмомисла (1153-1187 рр.).",
            "1199 р. – Об`єднання Галицького та Волинського князівств в єдину державу Романом Мстиславичем.",
            "Роман Мстиславич (1199 - 1205 рр.) проявив себе як видатний полководець. У 1202 р. він заволодів Києвом, об`єднавши під своєю владою всю Південно-Західну Русь.",
            "1238 р. – битва під Дорогичином (завдав поразки рицарям-хрестоносцям).",
            "1245 р. в битві під Ярославом розгромив об’єднане військо угрів та поляків.",
            "1253 р. Данило Галицький прийняв корону від Папи Римського. Головну мету життя князь вбачав у визволенні Руської землі від монголо-татарських загарбників (вдала воєнна кампанія проти монгольського хана Куремси і невдала боротьба з ханом Бурундаєм).",
            "1206 р. монгольський хан Темучін, прийнявший ім`я Чінгізхан, розпочав завойовницькі походи.",
            "1223 р. – битва на річці Калка. Русько-половецькі війська зазнали нищівної поразки.",
            "1237 - 1238 рр. – монголо-татари під керівництвом хана Батия спустошили Північно-Східну Русь.",
            "1239 р. – захоплення Чернігова та Переяслава.",
            "1240 р. – захоплення Києва.",
            "1242 р. війська Батия припинили загарбницький похід на захід і повернули до пониззя Волги. Тут Батий заснував державу — Золоту Орду із столицею Сарай-Бату (біля сучасної Астрахані). Руські землі потрапили у залежність від нової держави – Золотої Орди.",
            "1362 р. – битва на Синіх Водах, між русько-литовським військом князя Ольгерда і монголами. Перемога литовців і як наслідок звільнення більшої частини території українських земель від зверхності Золотої Орди і підпорядкування її ВКЛ."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_2);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_search);
        setSupportActionBar(toolbar);
        char dm = (char) 34;
        getSupportActionBar().setTitle("Словник: "+dm+"Дати"+dm);
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

        lstView = (ListView)findViewById(R.id.lstView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,lstSource);
        lstView.setAdapter(adapter);

        mess = getResources().getString(R.string.biof_1_1);

        searchView = (MaterialSearchView)findViewById(R.id.search_view);

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {
                //If closed Search View , lstView will return default
                lstView = (ListView)findViewById(R.id.lstView);
                ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_2.this,android.R.layout.simple_list_item_1,lstSource);
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

                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_2.this,android.R.layout.simple_list_item_1,lstFound);
                    lstView.setAdapter(adapter);
                }
                else{
                    //if search text is null
                    //return default
                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_2.this,android.R.layout.simple_list_item_1,lstSource);
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
