package com.example.youtube_clone.service

import com.example.youtube_clone.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/9041aa8c-8d69-4b8f-ac4c-9fadc98ac9a3")
    fun listVideos(): Call<VideoDto>
}