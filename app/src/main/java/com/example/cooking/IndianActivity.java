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

public class IndianActivity extends AppCompatActivity {
    List<Dish> dishes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);

        RecyclerView recyclerView = findViewById(R.id.list_dish);

        setInitialData();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DishAdapter adapter = new DishAdapter(this, IndianActivity.this, dishes);
        recyclerView.setAdapter(adapter);


        findViewById(R.id.buttonBack).setOnClickListener(v -> {
            startActivity(new Intent(IndianActivity.this, MainActivity.class));
            finish();
        });
    }

    private void setInitialData() {

        dishes.add(new Dish("Индийская", "Роган Джош", "Ароматный карри из ягнёнка, родом из Кашмира\n", "1/2 ч. л. куркумы\n" + "1,5 ч.л соли.\n" + "1 ст.л. лимонного сока.\n" + "1,5 ч.л. пищевой соды.\n" + "2 чашки желтого гороха.\n" + "2/3 чашки (150 мл) йогурта.\n" + "1 чашка (250 мл воды).\n" + "3-4 стручка свежего острого перца\n"+ "2 ст.л. натертого свежего имбиря.\n"+ " 1 ст.л. семян горчицы, кунжута.\n"+ " 5 ст.л. натертого кокосового ореха.\n"+ "4 ст.л. листьев кориандра.\n",
                " 25 мин.\n", "Вымойте чана дал или горох и замочите его не менее, чем на 4 часа. Слейте воду. Положите в миксер вместе с йогуртом и водой. Размалывайте до образования однородной массы и, накрыв крышкой, поставьте получившееся тесто в теплое место минимум на 6 часов.\n" + "Найдите кастрюлю, в которую помещается форма для торта диаметром 20 см. Положите эту форму на дно кастрюли, установив ее на какое-нибудь кольцо, чтобы она не касалась дна. В центре кольца должно быть достаточно большое отверстие, чтобы пар доходил до дна формы. Налейте воды на 5 см в кастрюлю и доведите до кипения..\n" +
                "Разотрите свежий перец в пасту, добавив небольшое количество воды, и соедините с тестом. Затем добавьте в него имбирь, куркуму, соль, лимонный сок, топленое масло и пекарский порошок (соду). Хорошо перемешайте. Смажьте форму сливочным маслом и влейте в нее тесто. Плотно закройте кастрюлю и варите доклу на пару 20-25 мин., пока тесто не станет упругим.\n" + "Нагрейте 2 ст. л. топленого масла в маленькой кастрюле и поджарьте семена горчицы, кунжут и асафетиду. Когда семена горчицы перестанут лопаться, полейте этим соусом доклу, а сверху посыпьте кокосовым орехом и листьями кориандра. Когда пирог остынет, нарежьте его на прямоугольники или ромбы и выньте из кастрюли.\n",
                R.drawable.dokla));

        dishes.add(new Dish("Индийская", "Чечевичный суп с томатами", "Сытная густая похлебка с приятной неоднородной констистенцией.\n", "Красная чечевица - 150 г.\n" + "Зелено-коричневая чечевица - 200 г.\n" + "Консервированные помидоры кусочками - 400 г.\n" + "Чеснок - 6 зубчиков.\n" + "Репчатый лук - 1 головка.\n" + "Морковь - 1 штука.\n" + "Оливковое масло - 20 мл.\n" + "Молотый перец, соль, сушеный базилик, орегано, эстрагон - по вкусу\n", "40 мин\n", "Смешать оба вида чечевицы, залить водой и поставить на огонь. Как только вода закипит, угасить огонь до минимального, накрыть кастрюлю крышкой и оставить на двадцать-тридцать минут. Красная чечевица за это время разварится чуть сильнее зеленой — зеленая должна остаться аль денте.\n" + "Тем временем на сковороде разогреть оливковое масло, бросить целые зубчики чеснока и слегка потушить до появления аромата. Затем добавить лук, нарезанный кубиками, потушить все вместе, помешивая, до появления легкого золоти- стого оттенка..\n" +
                "Добавить к чесноку и луку натертую на крупной терке морковь, обжарить, а затем аккуратно выложить помидоры и поперчить. Хорошо все перемешать и потушить на умеренном огне, постоянно помешивая, четыре-пять минут.\n" + "Добавить овощную смесь и все специи, кроме эстрагона, в кастрюлю с чечевицей, помешать деревянной ложкой, снова довести до кипения. Варить все вместе еще пять-семь минут, в самом конце бросить щепотку эстрагона и снять с огня.\n" + "Удалить из кастрюли с супом зубчики чеснока, добавить по вкусу соль и черный молотый перец. Разлить суп по тарелкам. Украсить его при желании можно свежей порубленной зеленью или ложкой греческого йогурта, а если захочется добавить кислоты — выжать дольку лимона прямо в тарелку.\n" + "Огурцы помыть и нарезать мелкими кубиками.\n",
                R.drawable.chechevichnyi));

        dishes.add(new Dish("Индийская", "Золотое молоко", "Ему насчитывается уже более 4000 лет, его подавали еще в древней Индии.\n", "Молоко - 250 мл.\n" + "Куркума - 2 ст.л.\n" + "Вода - 150 мл.\n" + "Мёд - по желанию .\n",
                "10-15 мин\n","Наливаем в глубокий сотейник необходимое количество воды и насыпаем куркуму.\n" + "Вымыть и измельчить зеленый лук.\n" + "Перемешиваем, готовим на среднем огне 8-10 минут. За это время жидкость станет гуще. Не забываем перемешивать составляющие, чтобы заготовка не подгорела.\n" + "Выливаем получившуюся заготовку в сухую емкость.\n" + "Подогреваем свежее молоко в отдельном сотейнике, добавляем 0,5 ч.л. оранжевой пасты. При необходимости, вводим в напиток натуральный мед.\n" + "Подаем золотое молоко с куркумой сразу же.\n",
                R.drawable.gmilk));

        dishes.add(new Dish("Индийская", "Рис басмати с карри", "Очень вкусный и красивый рис.\n", "Рис басмати - 1 чашка\n" + "Вода - 1,5 чашки\n" + "Лук - 1 шт.\n" + "Морковь - 2 шт.\n" + "Масло сливочное или растительное - 50 г.\n" + "Соль.\n" + "Карри - 3 ч.л.\n", "30 мин\n", "Рис помещаем в миску, заливаем холодной водой и начинаем промывать. Меняем несколько раз воду, пока рис не перестанет выделять крахмал. Споласкиваем рис еще раз, заливаем чистой водой и оставляем мокнуть 30-60 мин. Это нужно для того, чтобы рис набух, впитал в себя воду. Тогда при варке он не превратится в кашу.\n" +
                "Рис опрокидываем в дуршлаг, чтобы лишняя вода стекла\n" + "В непригораемой кастрюльке на сливочном масле обжариваем лук и морковь, порезанные мелкими кубиками. По желанию можно использовать растительное масло.\n" + "Добавляем карри. Для меня 1 ч.л. на 100 г риса кажется оптимальным количеством (ели даже дети). Но это, конечно, уж вам решать, сколько карри добавить. Перемешиваем.\n" + "Всыпаем влажный рис и перемешиваем несколько минут. Рис должен весь пропитаться зажаркой.\n" + "Тем временем мы уже вскипятили нужное количество воды, добавили соль, не забываем попробовать. Вливаем горячую соленую воду в рис.\n" + "Закрываем крышкой и варим рис с карри на несильном огне 10 мин. За это время рис впитает воду. Крышку не поднимаем!!! Выключаем огонь и оставляем рис доходить под крышкой 20-30 мин.\n" + "Когда время прошло, можно перемешать рис. Вы увидите какой он красивый. И почувствуете его неповторимый аромат!\n",
                R.drawable.risbasmati));


        dishes.add(new Dish("Индийская", "Слоеные лепешки", "Самая слоёная лепешка в мире.\n", "Крупа манная - 250 г.\n" + "Мука - 250 г\n" + "Вода - 220 мл\n" + "Разрыхлитель - 1 ч. ложка.\n" + "Сахар - 2 ст. ложки\n" + "Соль - щепотка\n" + "Лук зелёный - 1 пучок\n" + "Укроп свежий - 1 пучок\n"
                + "Соль - 1 ч. ложка\n", "??? мин\n", "Подготавливаем продукты для слоеных лепешек из пресного теста с манкой. Смешиваем в одной чашке сливочное и растительное масла.\n" + "В манку и муку добавляем соль, сахар и разрыхлитель. Хорошо перемешиваем. Замешиваем тесто в миксере (можно руками), постепенно подливая воду.\n" +
                "Тесто получается мягким, эластичным, а также интересным, фактурным из-за манки. Накрываем тесто пленкой и даем ему отдохнуть минут 20.\n" + "Тесто делим на средние кусочки. Формируем шарики-заготовки, смазываем смесюм масел. После растягиваем руками на столе, режем на тонкие полоски\n" + "Собираем полоски в один жгут, еще раз смазываем маслом, получается заготовка, похожая на розу\n" + "Обжариваем лепешки на сухой сковороде, когда подрумянятся переворачиваем.\n" + "Чтобы у лепешечек появились слои, прямо на сковороде потревожьте их, поприжимайте с разных сторон.\n" + "Такие слоеные лепешки можно полить мёдом, вареньем. А если в самом начале не добавлять сахар, тогда их можно полить сырным соусом. Все, кто увидит и попробует такие лепешки, просто ахнет!\n",
                R.drawable.lepeshki));
    }
}