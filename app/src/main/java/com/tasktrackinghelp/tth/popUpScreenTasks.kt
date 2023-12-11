package com.tasktrackinghelp.tth

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun popUpScreenTasks(
    viewModel : MainViewModel
) {

    IconButton(onClick = {
        viewModel.onAddClick() }
    )
    {
        Icon(
            Icons.Filled.Menu,
            contentDescription = "Add Button",
            modifier = Modifier
                .size(64.dp),
            tint = MaterialTheme.colorScheme.primary
        )
    }
    if(viewModel.isDialogShown){
        menuDialog(
            onDismiss = { viewModel.onDismissClick() },
            onConfirm = { /*  DO Something*/}
        )
    }
}
