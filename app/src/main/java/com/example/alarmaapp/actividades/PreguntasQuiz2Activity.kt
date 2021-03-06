package com.example.alarmaapp.actividades

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.alarmaapp.R
import kotlinx.android.synthetic.main.activity_preguntas_quiz.*

class PreguntasQuiz2Activity : AppCompatActivity(),  View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mPreguntasList: ArrayList<Pregunta>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUsername: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntas_quiz2)

        mUsername = intent.getStringExtra(Constantes.USER_NAME)

        mPreguntasList = Constantes.getPreguntasCategoria2()
        //Log.i("Total de preguntas:", "${preguntasList.size}")
        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setQuestion(){

        val pregunta = mPreguntasList!![mCurrentPosition -1]

        defaultOptionsView()

        if(mCurrentPosition == mPreguntasList!!.size){
            btn_submit.text = "TERMINAR"
        }else{
            btn_submit.text = "ACEPTAR"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_pregunta.text = pregunta!!.pregunta
        iv_image.setImageResource(pregunta.imagen)
        tv_option_one.text = pregunta.opcionUno
        tv_option_two.text = pregunta.opcionDos
        tv_option_three.text = pregunta.opcionTres
        tv_option_four.text = pregunta.opcionCuatro
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one ->{
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two ->{
                selectedOptionView(tv_option_two, 2)
            }
            R.id.tv_option_three ->{
                selectedOptionView(tv_option_three, 3)
            }
            R.id.tv_option_four ->{
                selectedOptionView(tv_option_four, 4)
            }
            R.id.btn_submit ->{
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mPreguntasList!!.size ->{
                            setQuestion()
                        }else -> {
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(Constantes.USER_NAME, mUsername)
                        intent.putExtra(Constantes.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(Constantes.TOTAL_QUESTIONS, mPreguntasList!!.size)
                        startActivity(intent)
                        finish()
                    }
                    }
                }else{
                    val pregunta = mPreguntasList?.get(mCurrentPosition -1)
                    if(pregunta!!.RespCorrecta != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(pregunta.RespCorrecta, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mPreguntasList!!.size){
                        btn_submit.text = "TERMINAR"
                    }else{
                        btn_submit.text = "SIGUIENTE PREGUNTA"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }
}