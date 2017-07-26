package com.example.onlyu.startup
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.text.BreakIterator
import java.text.ChoiceFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun select (view: View) {
        //choise is the button
        var choise = view as Button
        var cellid = 0
        when (choise.id) {
            R.id.tic11 -> cellid = 1
            R.id.tic12 -> cellid = 2
            R.id.tic13 -> cellid = 3
            R.id.tic21 -> cellid = 4
            R.id.tic22 -> cellid = 5
            R.id.tic23 -> cellid = 6
            R.id.tic31 -> cellid = 7
            R.id.tic32 -> cellid = 8
            R.id.tic33 -> cellid = 9
        }
        Log.d("cellid :", cellid.toString())
        palayGame(cellid, choise)

    }

       var user1=ArrayList<Int>()
        var user2=ArrayList<Int>()
        var Active=1



        fun palayGame (cellid:Int,choise:Button){
            if (Active==1) {
                choise.text="X"
                choise.setBackgroundColor(R.color.a)
                user1.add(cellid)
                Active=2

                }
            else
                {
                    choise.text="o"
                    choise.setBackgroundColor(R.color.wite)
                    user2.add(cellid)
                    Active=1
                }
            choise.isEnabled=false
            CheckWiner()

            }
        @Suppress("UNUSED_EXPRESSION")
        fun CheckWiner (){
            var winer=-1
            //الصفوف
            if (user1.contains(1) && user1.contains(2) && user1.contains(3)){
                winer=1
            }
            if (user2.contains(1) && user2.contains(2) && user2.contains(3)){
                winer=2
            }
            if (user1.contains(4) && user1.contains(5) && user1.contains(6)){
                winer=1
            }
            if (user2.contains(4) && user2.contains(5) && user2.contains(6)){
                winer=2
            }
            if (user1.contains(7) && user1.contains(8) && user1.contains(9)){
                winer=1
            }
            if (user2.contains(7) && user2.contains(8) && user2.contains(9)){
                winer=2
            }
            //الاعمدة
            if (user1.contains(1) && user1.contains(4) && user1.contains(7)){
                winer=1
            }
            if (user1.contains(2) && user1.contains(5) && user1.contains(8)){
                winer=1
            }
            if (user1.contains(3) && user1.contains(6) && user1.contains(9)){
                winer=1
            }
            //ــــــــــــــــــــــــــــــــــــــــــــــــــــــ
            if (user2.contains(1) && user2.contains(4) && user2.contains(7)){
                winer=2
            }
            if (user2.contains(2) && user2.contains(5) && user2.contains(8)){
                winer=2
            }
            if (user2.contains(3) && user2.contains(6) && user2.contains(9)){
                winer=2
            }
            if (winer!=-1){

                if (winer==1){
                    Toast.makeText(this,"player one won",Toast.LENGTH_LONG).show()


                }
                else{
                    Toast.makeText(this,"player two won",Toast.LENGTH_LONG).show()

                }

            }



        }

}


