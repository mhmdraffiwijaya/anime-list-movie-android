package com.raffi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CardActivity : AppCompatActivity() {
    private lateinit var rvHeroes:RecyclerView
    private var list:ArrayList<Hero> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        supportActionBar?.hide()

        rvHeroes =findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(HeroesData.listData)
        showRecyclerCardView()
    }
    private fun showRecylerList(){
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvHeroes.adapter = listHeroAdapter
    }

    private fun showRecyclerCardView(){
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val CardViewHeroAdapter = CardViewHeroAdapter(list)
        rvHeroes.adapter = CardViewHeroAdapter
    }
}