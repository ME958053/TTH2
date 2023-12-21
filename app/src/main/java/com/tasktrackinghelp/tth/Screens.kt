package com.tasktrackinghelp.tth

sealed class Screens(val route : String) {
    object Home : Screens("home_route")
    object Calendar : Screens("calendar")
    object Profile : Screens("profile_route")
}