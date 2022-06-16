package mary.dev.calculatorassesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilfirstvalue:TextInputLayout
    lateinit var etfirstvalue:TextInputEditText
    lateinit var tilsecondvalue:TextInputLayout
    lateinit var etsecondvalue:TextInputEditText
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btndivision:Button
    lateinit var btnmodulus:Button
    lateinit var tvresults:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tilfirstvalue=findViewById(R.id.tilfirstvalue)
        etfirstvalue=findViewById(R.id.etfirstvalue)
        tilsecondvalue=findViewById(R.id.tilsecondvalue)
        etsecondvalue=findViewById(R.id.etsecondvalue)
        btnadd=findViewById(R.id.btnadd)
        btnsubtract= findViewById(R.id.btnsubtract)
        btndivision=findViewById(R.id.btndivision)
        btnmodulus=findViewById(R.id.btnmodulus)
        tvresults=findViewById(R.id.tvresults)


        btnadd.setOnClickListener{
            var sumup=etfirstvalue.text.toString().toInt()
            var doadd=etsecondvalue.text.toString().toInt()
            add(sumup,doadd)
        }
        btnsubtract.setOnClickListener {
            var sub=etfirstvalue.text.toString().toInt()
            var dosub=etsecondvalue.text.toString().toInt()
            subtraction(sub,dosub)
        }
        btndivision.setOnClickListener {
            var divide=etfirstvalue.text.toString().toInt()
            var dodivide=etsecondvalue.text.toString().toInt()
            divide(divide,dodivide)
        }
        btnmodulus.setOnClickListener {
            var mod=etfirstvalue.text.toString().toInt()
            var domod=etsecondvalue.text.toString().toInt()
            modulus(mod,domod)
            validatecalculation()

        }

    }
    fun add(num1:Int, num2:Int){
        var sum=num1+num2
        tvresults.text=sum.toString()
    }
    fun subtraction(num1:Int,num2:Int){
        var minus=num1-num2
        tvresults.text=minus.toString()
    }
    fun divide(num1: Int, num2: Int){
        var div=num1/num2
        tvresults.text=div.toString()
    }
    fun modulus(num1: Int,num2: Int){
        var remainder=num1%num2
        tvresults.text=remainder.toString()
    }
    fun  validatecalculation() {
        var valueone=etfirstvalue.text.toString()
        var valuetwo=etsecondvalue.text.toString()
        var error=false
        tilfirstvalue.error=null
        etfirstvalue.error=null
        tilsecondvalue.error=null

        if (valueone.isBlank()){
            tilfirstvalue.error="Value is required"
        }
        if(valuetwo.isBlank()){
            tilsecondvalue.error="Value is required"
        }
        if (!error){

        }
    }

}


