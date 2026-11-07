package oop_00000163456_DiazRadityaHarahap.week08

fun sendNotification(message: String?) {
    if (message != null) {
        println("Sending notification: $message")
    } else {
        println("Notification is empty.")
    }
}

