package com.example.videoplayer

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val videoView : VideoView = findViewById(R.id.videoViewLocal)
        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.preview)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()


        val videoUrl = "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1"
        val videoView1 : VideoView = findViewById(R.id.videoViewOnline)
        val uri = Uri.parse(videoUrl)
        videoView1.setVideoURI(uri)
        val mediaController1 = MediaController(this)
        mediaController1.setAnchorView(videoView1)
        mediaController1.setMediaPlayer(videoView1)
        videoView1.setMediaController(mediaController1)
        videoView1.start()
    }
}