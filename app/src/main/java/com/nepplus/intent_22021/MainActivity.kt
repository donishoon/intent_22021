package com.nepplus.intent_22021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    1000 이라는 숫자가, 닉네임을 가지러 가는 거다. 구별하기.
    val REQ_CODE_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMove.setOnClickListener {

//            다른 화면으로 이동하기

            val myintent = Intent (this, DoonActivity::class.java)
            startActivity(myintent)

            btnEditNickname.setOnClickListener {
                val myIntent = Intent(this, EditNicknameActivity::class.java)

                startActivityForResult(myIntent, 1000 )

            }

        }

        btnSend.setOnClickListener {

//            1. 입력된 메세지를 변수에 저장
            val inputMessage = edtMessage.text.toString()

//            2. 메세지를 "들고" ViewMessage 화면으로 이동
            val myIntent = Intent(this, ViewMessageActivity::class.java)

//            myIntent
            myIntent.putExtra("msg", inputMessage)

            startActivity(myIntent)
        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        다른 화면에서 결과를 받아서 돌아오면 종류와 무관하게 무조건 실행되는 코드 영역 (함수)

//        닉네임을 받으러 다녀온게 맞는지? => 대처방안만 코딩

        if ( requestCode == REQ_CODE_NICKNAME ) {


//            확인 버튼을 누른게 맞는지?

            if ( resultCode == RESULT_OK ){

//                닉네임 변경도 맞고 확인도 맞다면 첨부된 닉네임을 추출해서 UI에 반영

                val newNickname = data?.getStringExtra("nick")
                txtNickname.text = newNickname

            }

        }



    }


}