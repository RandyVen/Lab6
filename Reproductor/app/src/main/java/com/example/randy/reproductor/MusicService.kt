package com.example.randy.reproductor

import android.app.Service

import android.content.Intent
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder


class MusicService( ): Service(), MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener  {
    override fun onBind(intent: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(mp: MediaPlayer?, what: Int, extra: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCompletion(mp: MediaPlayer?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onPrepared(mp: MediaPlayer?) {
        mp!!.start()
    }
    private lateinit var player: MediaPlayer
    private lateinit var songs: ArrayList<Song>
    var songPosition: Int=0


    inner class MusicBinder : Binder() {
        internal val service: MusicService
            get() = this@MusicService
    }





}