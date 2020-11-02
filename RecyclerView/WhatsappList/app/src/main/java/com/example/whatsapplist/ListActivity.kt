package com.example.whatsapplist

import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val userContactList = mutableListOf<UserContact>()

        val userContact01 = UserContact("Teste","Maria Helena","A que horas vc vai chegar?","10:40 AM ", 3)
        val userContact02 = UserContact("Teste","Sandro","Blz","08:41 AM ", 1)
        val userContact03 = UserContact("Teste","Rosinha","Compra 2","5 dias", 0)
        val userContact04 = UserContact("Teste","Luiza","É sempre o mesmo","15:40 PM ", 0)
        val userContact05 = UserContact("Teste","Pe","Não","15:40 PM ", 0)
        val userContact06 = UserContact("Teste","Tia Fer","3","15:40 PM ", 8)
        val userContact07 = UserContact("Teste","Mãe","A que horas vc vai chegar?","Hoje", 1)
        val userContact08 = UserContact("Teste","Pai","Mais tarde","15:40 PM ", 5)
        val userContact09 = UserContact("Teste","Tici S2","Sem chances.","11:40 AM ", 0)
        val userContact10 = UserContact("Teste","Cido","ok","Ontem", 0)
        val userContact11 = UserContact("Teste","Luciano","Vou acampar esse final de semana","15:40 PM ", 3)
        val userContact12 = UserContact("Teste","Beatriz Soares","Me liga depois do almoço","3 dias", 3)
        val userContact13 = UserContact("Teste","Adriano","Bora!","15:40 PM ", 0)
        val userContact14 = UserContact("Teste","Sala 23 - Turma 1","kkk","14:10 PM ", 10)
        val userContact15 = UserContact("Teste","Tio Marcos","Só no Natal","18:02 PM ", 0)


        userContactList.add(userContact01)
        userContactList.add(userContact02)
        userContactList.add(userContact03)
        userContactList.add(userContact04)
        userContactList.add(userContact05)
        userContactList.add(userContact06)
        userContactList.add(userContact07)
        userContactList.add(userContact08)
        userContactList.add(userContact09)
        userContactList.add(userContact10)
        userContactList.add(userContact11)
        userContactList.add(userContact12)
        userContactList.add(userContact13)
        userContactList.add(userContact14)
        userContactList.add(userContact15)

        findViewById<RecyclerView>(R.id.rvListUserContact).apply {
            layoutManager = LinearLayoutManager(this@ListActivity)
            adapter = MainAdapter(userContactList)
        }


    }
}