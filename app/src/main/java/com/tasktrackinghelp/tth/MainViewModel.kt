package com.tasktrackinghelp.tth

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.time.LocalDate

class MainViewModel : ViewModel(){
    var events = mutableStateListOf<Event>()
    fun addEvent(event: Event) {
        events.add(event)
        Log.d("MainViewModel", "Event added: $event, $events",)
    }
    var selectedDate by mutableStateOf(LocalDate.now())
        private set

    fun onDateSelected(date: LocalDate) {
        selectedDate = date
        onAddClick()
    }

    var isDialogShown by mutableStateOf(false)


    fun onAddClick(){
        isDialogShown = true
    }

    fun onDismissClick(){
        isDialogShown = false
    }
}