package com.tasktrackinghelp.tth

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    viewModel : MainViewModel
) {
       IconButton(onClick = {
           viewModel.onAddClick()
       }
           )
          {
            Icon(
                Icons.Filled.Add,
                contentDescription = "Add Button",
                modifier = Modifier
                    .size(64.dp),
                tint = MaterialTheme.colorScheme.onPrimary
            )
       }
       if(viewModel.isDialogShown){
           CustomDialog(
               onDismiss = { viewModel.onDismissClick() },
               onConfirm = { /*  DO Something*/}
           )
       }
   }
