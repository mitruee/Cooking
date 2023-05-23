package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class JapaneseActivity extends AppCompatActivity {
    List<Dish> dishes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese);

        RecyclerView recyclerView = findViewById(R.id.list_dish);

        setInitialData();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DishAdapter adapter = new DishAdapter(this, JapaneseActivity.this, dishes);
        recyclerView.setAdapter(adapter);


        findViewById(R.id.buttonBack).setOnClickListener(v -> {
            startActivity(new Intent(JapaneseActivity.this, MainActivity.class));
            finish();
        });
    }

    private void setInitialData() {

        dishes.add(new Dish("Японская", "Оякодон", "Оякодон — разновидность традиционного японского блюда донбури, представляющего собой круглую чашу с рисом, дополненную различными ингредиентами, от куска свинины или говядины до угря. Если верить источникам, оякодон придумали в Осаке около 1900 года, бросив на рис кусочки курицы с весенним луком и залив их яйцом.\n", "Репчатый лук - 1 головка.\n" + "Куриное филе - 300 г.\n" + "Рис - 0,5 стакана.\n" + "Куриное яйцо - 3 штуки.\n" + "Соевый соус - 6 ст. л.\n" + "Сахар - 2 ст. л.\n" + "Зеленый лук - 20 г.\n", "30 мин\n",
                "Репчатый лук очистить и нарезать тонкими полукольцами. На среднем огне разогреть сковороду и влить в нее шесть столовых ложек соевого соуса.\n" + "Как только соевый соус начнет кипеть, бросить в сковороду луковые полукольца и посыпать сверху сахаром. Готовить, периодически помешивая, две-три минуты.\n" + "Тем временем куриное филе нарезать небольшими кусочками — сильно измельчать мясо не нужно, готовые ломтики должны остаться сочными и плотными.\n" + "Положить курицу в сковороду и перемешать с соусом. Когда мясо побелеет с одной стороны, перевернуть аккуратно ломтики и потушить еще пару минут. Куриное филе готовится удивительно быстро: максимум три-четыре минуты.\n" +
                        "В отдельной миске вилкой или венчиком быстро взбить яйца в однородную смесь. Добавлять соль при этом не нужно — соевый соус, в котором тушится мясо, и так достаточно солон.\n" + "Вылить яичную смесь на сковороду, стараясь равномерно покрыть все мясо. Накрыть сковороду крышкой и готовить омлет три-четыре минуты, не мешая, пока яйца как следует не схватятся.\n" + "Зеленый лук измельчить. На сервировочную тарелку выложить горкой теплый рис, сваренный на пару.\n" + "Сверху на рис аккуратно выложить омлет — для удобства его можно разделить лопаткой на треугольные сегменты. Посыпать оякодон измельченным зеленым луком — и подавать горячим.\n", R.drawable.oyakodon));

        dishes.add(new Dish("Японская", "Лапша удон с курицей, вешенками и зеленым луком", "Та курица, что кладется в суп, обжаривается в сыром виде на сковороде. А куриный бульон нужно будет сварить заранее, и лучше готовить его из куриных костей. Кроме того, в суп можно добавить сваренные вкрутую яйца. В этот суп можно также добавлять сваренные вкрутую яйца и другие ингредиенты.\n", "Анис (бадьян) - 2 шт.\n" + "Лапша удон - 400 г.\n" + "Имбирь - 50 г.\n" + "Куриный бульон - 2 л.\n" + "Чеснок - 4 зубчика.\n" + "Вешенки - 200 г.\n" + "Сладкий перец - 1 шт.\n" + "Перец чили - 1 шт.\n" + "Зеленый лук - 100 г.\n" + "Куриное филе - 400 г.\n" + "Соевый соус - 50 мл.\n" +
                "Лимон - 1 шт.\n" + "Растительное масло - 50 мл.\n", "20 мин\n", "Разогреть сковородку вок и раскалить в ней растительное масло. На раскаленном масле обжарить нарезанный тонкой соломкой имбирь, нарезанную тонкими ломтиками курицу, нарезанные тонкими ломтиками грибы вешенки и мелко нарубленный чеснок. Итогом трудов должно стать такое состояние куриного мяса и грибов, при котором их уже можно было бы есть без дальнейших приключений. Грибы должны успеть пустить сок. Сок же должен успеть испариться под действием высоких температур, а вешенки обязаны приобрести приятную корич\u00ADне\u00ADвую корочку и заполонить всю кухню настырным ароматом свежеподжаренных грибов.\n" +
                "В этот момент надо добавить в сковородку соевый соус, звездочки бадьяна, мелко нарезанный сладкий перец и нарезанный тонкими кольцами перец чили, перемешать, потушить минуту и залить куриным бульоном. Варить суп пять минут.\n" + "За это время в любой подходящей кастрюльке отварить в подсоленной воде лапшу удон.\n" + "Снять с огня суп, выжать в него сок лимона, бросить стебли лука, лапшу удон, перемешать и подавать к столу.\n", R.drawable.udon));

        dishes.add(new Dish("Японская", "Омурайсу", "Без омурайсу не обходится ни одно аниме, при этом заворачивать рис с курицей в омлет — скорее британское изобретение, которое пришло в Японию вместе с карри. Рецепт прост, как все гениальное: лук, курицу и рис обжаривают, а потом заворачивают в омлет. Важно, чтобы омлет был очень воздушным, а начинка — насыщенной: для этого в рис с курицей добавляют горошек, кетчуп и соевый соус. Лучше всего есть омурайсу, полив его сверху сладким кетчупом и слегка приправив соевым соусом. Эффект от омурайсу совершенно гипнотический — съев его один раз, почти невозможно не сделать себе вторую порцию.\n", "Репчатый лук - 60 г.\n" + "Курица - 150 г.\n" +
                "Зеленый горошек - 30 г.\n" + "Вареный жасминовый рис - 360 г.\n" + "Кетчуп - 3 ст. л.\n" + "Соевый соус - 1 ст. л.\n" + "Растительное масло - 60 мл.\n" + "Куриное яйцо - 4 шт.\n" + "Сливки - 2 ст. л.\n" + "Петрушка - по вкусу.\n" + "Соль - по вкусу.\n", "25 мин\n",
                "На растительном масле обжарить измельченный лук до прозрачности, затем добавить мелко нарезанную курицу, посолить и жарить несколько минут, до готовности курицы.\n" + "Добавить рис, хорошо перемешать, разбивая комочки, затем добавить горошек, кетчуп и соевый соус, перемешать и снять с огня.\n" +
                        "Слегка взбить два яйца со столовой ложкой сливок и щепоткой соли. Вылить яйца на разогретый вок или глубокую сковородку. Пока яйца не схватились, помешать их лопаткой или палочками, как это делают в Японии, чтобы придать омлету воздушную текстуру.\n" + "Когда внизу омлет уже приготовился, а на поверхности еще остается сыроватым, выключить огонь и выложить на омлет половину жареного риса. Сложить края омлета на рис как бы заворачивая начинку в омлет. Аккуратно переложить омлет с рисом на тарелку, перевернув сковороду. Подавать с кетчупом, украсив петрушкой.\n", R.drawable.omuraisu));

        dishes.add(new Dish("Японская", "Курица терияки", "Терияки — это японская техника, обжаривание с глазированием: «тери» — это «блеск», а «яки» — жарить. Продукт в итоге должен приобрести карамельный блеск, который дает ему маринад из соевого соуса, саке (или мирина) и сахара. Для простоты можно использовать магазинный соус терияки — это специальный соус для техники терияки, в который уже входят все нужные ингредиенты.", "Куриное филе - 600 г.\n" + "Легкий соевый соус - 70 мл.\n" + "Коричневый сахар - 3 ст. л.\n" + "Имбирь - 10 г.\n" + "Репчатый лук - 50 г.\n" + "Чеснок - 2 зубчика.\n" + "Саке - 3 ст. л.\n" + "Растительное масло - 50 мл.\n" + "Кунжут - по вкусу.\n" + "Зеленый лук - по вкусу.\n", "45 мин\n",
                "На мелкой терке натереть имбирь и лук, чеснок раздавить чеснокодавкой. Смешать соевый соус, сахар, саке, имбирь, чеснок и лук.\n" + "Нарезать филе крупными кусками и положить в маринад, оставить на 30 минут.\n" + "На сковороде разогреть растительное масло и обжарить куски курицы со всех сторон до карамельной корочки. Отложить.\n" + "В ту же сковородку вылить маринад, уварить его в течение 3–4 минут. Вернуть курицу в сковороду и готовить, помешивая, еще пару минут, мясо должно покрыться соусом, как глазурью. Подавать, украсив семенами кунжута и зеленым луком.\n", R.drawable.teriyaki));
    }
}