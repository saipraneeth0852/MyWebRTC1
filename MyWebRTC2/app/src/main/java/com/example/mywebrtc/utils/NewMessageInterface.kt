package com.example.mywebrtc.utils

import com.example.mywebrtc.models.MessageModel

interface NewMessageInterface {
    fun onNewMessage(message: MessageModel)
}