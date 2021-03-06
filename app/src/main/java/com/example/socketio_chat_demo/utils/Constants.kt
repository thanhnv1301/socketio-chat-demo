package com.example.socketio_chat_demo.utils

object Constants {
    const val SOCKET_SERVER_URL = "http://192.168.1.211:3000"

    enum class ValidateType {
        ValidateDone, EmptyUserName, EmptyEmail, EmptyPassword, EmptyMessage, EmptyNameRoom, InvalidPassword
    }

    const val SUBSCRIBE = "subscribe"
    const val UNSUBSCRIBE = "unsubscribe"
    const val USER_CHAT_HISTORY = "userWithChatHistory"
    const val UPDATE_CHAT = "updateChat"
    const val NEW_MESSAGE = "newMessage"
    const val TYPING = "typing"
    const val STOP_TYPING = "stopTyping"
    const val UPLOAD_MEDIA = "uploadMedia"

    const val TEXT_TYPE = "text"
    const val IMAGE_TYPE = "image"
}