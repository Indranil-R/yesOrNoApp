package corp.thunder.yesorno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun yesOrNo():String{
        val arr  = arrayOf("\uD83D\uDE03 Yes !!","\uD83D\uDE45\u200D♂ No️","\uD83D\uDE15 I don't Know")
        return arr.random()
    }

    fun answer(view: View) {
        val answer = findViewById<TextView>(R.id.answer)
        val questionText = findViewById<EditText>(R.id.questionText)
        val question = questionText.editableText.toString()
        if(question.isNotEmpty()&&question.isNotBlank()){
            answer.text="${yesOrNo()}"
        }
        if(question.isEmpty()||question.isBlank())Toast.makeText(this,"Please enter your question",Toast.LENGTH_SHORT).show()

    }
}