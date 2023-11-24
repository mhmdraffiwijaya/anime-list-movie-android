package com.raffi.myapplication

object HeroesData {
    private val heroNames = arrayOf("Bleach",
        "Isekai Quartet",
        "Kimi No Nawa",
        "Sword Art Online",
        "Kanojo",
        "Isekai Smartphone",
        "Jujutsu Kaisen",
        "Black Clover",
        "Haikyu",
        "Yamada Kun",
        "Kuroko No Basuke",
        "Kimetsu No Yaiba",
        "Atack On Titan",
        "Naruto Shipuden",
        "One Piece",
        "Tate No Yuusha",
        "One Puch Man",
        "Tokyou Revenger",
        "Tokyou Ghoul",
        "Gintama",)

    private val heroJudul = arrayOf("Action",
        "Comedy, Action",
        "Romance",
        "Action, Adventure",
        "Romance, Hareem",
        "Action, Hareem, Magic",
        "Action",
        "Adventure, Action",
        "Sport",
        "Magic, Hareem",
        "Sport",
        "Action",
        "Action, Adventure",
        "Adventure, Action",
        "Adventure",
        "Hareem, Magic",
        "Comedy, Action",
        "School, Action",
        "Action, Horror",
        "Comedy, Action")
    private val heroDetails = arrayOf("12 Episode\n\n Published in 2012 " ,
        "12 Episode\n\n Published in 2018",
        "24 Episode\n\n Published in 2017",
        "23 Episode\n\n Published in 2012",
        "25 Episode\n\n Published in 2020",
        "12 Episode\n\n Published in 2018",
        "16 Episode\n\n Published in 2013",
        "24 Episode\n\n Published in 2017",
        "23 Episode\n\n Published in 2019",
        "12 Episode\n\n Published in 2011",
        "23 Episode\n\n Published in 2018",
        "13 Episode\n\n Published in 2021",
        "12 Episode\n\n Published in 2013",
        "25 Episode\n\n Published in 2015",
        "22 Episode\n\n Published in 2020",
        "23 Episode\n\n Published in 2019",
        "12 Episode\n\n Published in 2012",
        "16 Episode\n\n Published in 2014",
        "12 Episode\n\n Published in 2016",
        "24 Episode\n\n Published in 2015")
    private val heroesImages = intArrayOf(R.drawable.bleach,
        R.drawable.jujutsu,
        R.drawable.sao,
        R.drawable.tokyo,
        R.drawable.boruto,
        R.drawable.h,
        R.drawable.slime,
        R.drawable.kiminonawa,
        R.drawable.w,
        R.drawable.black,
        R.drawable.k,
        R.drawable.kb,
        R.drawable.t,
        R.drawable.tate,
        R.drawable.tatee,
        R.drawable.ise,
        R.drawable.isee,
        R.drawable.rt,
        R.drawable.rtt,
        R.drawable.qw,
        )

    val listData:ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices){
                val hero = Hero()
                hero.name = heroNames[position]
                hero.judul = heroJudul[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                list.add((hero))
            }
            return list
        }
}