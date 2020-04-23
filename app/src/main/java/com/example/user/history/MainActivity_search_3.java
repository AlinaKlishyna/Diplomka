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

public class MainActivity_search_3 extends AppCompatActivity {
    MaterialSearchView searchView;
    ListView lstView;
    String mess;


    String[] lstSource = {

            "Історія або дієпис  — наука, яка вивчає минуле людства, покладаючись при цьому на письмові та матеріальні свідчення минулих подій.",
            "Хронологія  — як загальне поняття: послідовність історичних подій у часі; часослів'я, опис і вивчення того, як саме відбувалися певні події в часі (історично).",
            "Історичне джерело можна визначити як носій історичної інформації, що виник як продукт розвитку природи й культури та відображає той чи інший бік людської діяльності.",
            "Археологія — наука, що вивчає історію людства за матеріальними залишками діяльності людей. Досліджує як окремі стародавні предмети(артефакти) так і комплекси, що відкриваються завдяки археологічним розкопкам. На основі археологічних досліджень відтворюється історія епох, які мало або зовсім, не висвітлені писемними джерелами.",
            "Цивілізація — людська спільнота, яка впродовж певного періоду часу (процес зародження, розвиток, загибель чи перетворення цивілізації) має стійкі особливі риси в соціально-політичній організації, економіці та культурі (науці, технологіях, мистецтві тощо), спільні духовні цінності та ідеали, ментальність (світогляд).",
            "Культура археологічна — стійка сукупність типів археологічних решток, об'єднаних спільною територією, які змінюються та розвиваються у взаємозв'язку. Оскільки археологічна культура змінюється в часі й просторі, розрізняють її «локальні варіанти» та «хронологічні етапи».",
            "Мезоліт , Середньокам'яна доба – епоха кам’яної доби (12,000-7,000 до н.е), що була перехідною між палеолітом і неолітом.",
            "Палеоліт — давня кам'яна доба, найдавніший період людського суспільства. Щодо тривалості палеоліту є різні думки (від 3 млн до 100—150 тис. років тому). Кінець палеоліту датується близько 13 тис. років тому (12 000 — 10 000 років до Р. Х.).",
            "Мезоліт , Середньокам'яна доба – епоха кам'яної доби (12,000-7,000 до н.е), що була перехідною між палеолітом і неолітом.",
            "Неоліт, Нова кам'яна доба — нова кам'яна доба (X–поч. III тис. до н. е.), що заступила палеоліт і мезоліт та передувала мідній добі, заключний період кам'яної доби. Неоліт став особливим етапом в історії України і людства взагалі.",
            "Неолітична революція — історичний період переходу в епоху неоліту від привласнюючого до відтворюючого типу господарства, виникнення тваринництва, землеробства. Цей процес сприяв також народженню ремесел та торгівлі.",
            "Енеоліт або халколіт — назва перехідного часу від неоліту до бронзової доби, яку застосовують археологи в звʼязку з появою й поширенням у той час виробів із міді.",
            "Бронзова доба — культурно-історичний період історії людства, який прийшов на зміну енеоліту (мідній добі) — перехідному періоду після кам'яної доби. Характеризується виготовленням і використанням бронзових знарядь праці та зброї із бронзи, появою кочового скотарства, поливного рільництва, писемності, рабовласницьких держав (кінець ІІІ — початок I тисячоліття до н. е.). ",
            "Господарство привласнююче — перша в історії форма господарювання, коли люди споживали готові продукти природи: впольовували диких тварин, збирали їстівні рослини та плоди, рибалили.",
            "Господарство відтворююче — спосіб життя, який ґрунтується на землеробстві та скотарстві. У цьому випадку люди вже споживають продукти, створені власне ними: хліб, вирощені овочі та фрукти, м'ясо та молоко свійської худоби.",
            "Колонізація — заселення незайманих земель або захоплення чужих територій із подальшим їхнім заселенням. «Внутрішня колонізація» — заселення і господарське освоєння вільних земель на кордонах власної країни. Внутрішня колонізація застосовувалась у деяких країнах для придушення національних меншин.",
            "Кочівництво, або номадизм  — характерний для минулих епох і притаманний лише окремим сучасним людностям спосіб життєдіяльності, що базується на веденні випасного скотарства, пов'язаного з великими перегонами худоби на нові місця паші та водопої й відповідними пересуваннями цілих родин людей.",
            "Курган, також Могила — високий земляний, рідше кам'яний, насип над стародавнім похованням. Є різновидом поховальних пам'ятників, має форму земляного насипу, ізольоване округле підвищення, розташоване на рівнині з різко вираженою підошовною лінією, має штучне походження.",
            "Племінний союз, племінне об'єднання — об'єднання кількох племен, особливо часто відзначається істориками у суспільствах, які перебували на стадії військової демократії (франки і тевтони у германців, антів і склавинів у слов'ян). У таких союзах вже сильно виділялася племінна знать і спостерігалося розшарування суспільства. ",
            "Князь (жіночий рід княгиня) — титул голови феодальної монархії, або будь-якої іншої політичної системи (удільного князівства), великого посадовця чи вельможі у 8—20 століттях. Споконвічно був спадковим титулом у середовищі аристократії, але з кінця 18 століття став даруватися монархом за вислугу як дворянський титул."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_3);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_search);
        setSupportActionBar(toolbar);
        char dm = (char) 34;
        getSupportActionBar().setTitle("Словник: "+dm+"Не зрозумілі мені слова"+dm);
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
                ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_3.this,android.R.layout.simple_list_item_1,lstSource);
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

                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_3.this,android.R.layout.simple_list_item_1,lstFound);
                    lstView.setAdapter(adapter);
                }
                else{
                    //if search text is null
                    //return default
                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_3.this,android.R.layout.simple_list_item_1,lstSource);
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
