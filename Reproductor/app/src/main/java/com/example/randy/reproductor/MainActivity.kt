package com.example.randy.reproductor

import android.content.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList
import android.os.IBinder
import android.content.ComponentName
import android.content.ServiceConnection
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
private var musicBound=false
class MainActivity : AppCompatActivity() {
    private lateinit var songsArray: ArrayList<Song>
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    songsArray = ArrayList()
    val songAdpt= SongAdapter(this,songsArray)
    lista.adapter=songAdpt
    }
    private lateinit var controller:MusicControler
    private val musicConnection = object : ServiceConnection {
        private var musicSrv: MusicService?= null
        override fun onServiceConnected(name: ComponentName, service: IBinder) {
            val binder = service as MusicService.MusicBinder
            musicSrv = binder.service
            musicBound = true }
        override fun onServiceDisconnected(name: ComponentName) {
            musicBound = false
        }
    }





}