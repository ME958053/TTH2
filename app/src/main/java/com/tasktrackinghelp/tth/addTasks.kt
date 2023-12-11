package com.tasktrackinghelp.tth

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun AddTask(
    viewModel : MainViewModel
) {

    Button(onClick = {
        viewModel.onAddClick() },
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.onPrimary,
            contentColor = MaterialTheme.colorScheme.primary,
        ),
        modifier = Modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(0)
            )
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    )
    {
       Text("Add Task",
           fontWeight = FontWeight.Bold,
           style = MaterialTheme.typography.headlineSmall,)
    }
    if(viewModel.isDialogShown){
        CustomDialog(
            onDismiss = { viewModel.onDismissClick() },
            onConfirm = { /*  DO Something*/},

        )
    }
}