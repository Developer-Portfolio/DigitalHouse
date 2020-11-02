package com.example.agendadh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentsList = mutableListOf<Students>()

        val aluno01 = Students("teste","0156","Jéssica Milena", "Mobile Android")
        val aluno02 = Students("teste","1258","Fabio Tadashi", "Mobile Android")
        val aluno03 = Students("teste","1125","Guilherme Sartori", "Mobile Android")
        val aluno04 = Students("teste","3216","Victor Caldas", "Mobile Android")
        val aluno05 = Students("teste","6548","Tairo Roberto", "Mobile Android")
        val aluno06 = Students("teste","1485","Aurora Jardini", "Mobile Android")
        val aluno07 = Students("teste","1478","Jaque Esteves", "Mobile Android")
        val aluno08 = Students("teste","2856","Cássia Reinalds", "Mobile Android")
        val aluno09 = Students("teste","3698","Afonso Brito", "Mobile Android")
        val aluno10 = Students("teste","1596","Patric Lacerda", "Mobile Android")

       studentsList.add(aluno01)
       studentsList.add(aluno02)
       studentsList.add(aluno03)
       studentsList.add(aluno04)
       studentsList.add(aluno05)
       studentsList.add(aluno06)
       studentsList.add(aluno07)
       studentsList.add(aluno08)
       studentsList.add(aluno09)
       studentsList.add(aluno10)

        findViewById<RecyclerView>(R.id.rvStudentsList).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MainAdapter(studentsList)
        }


    }
}