package com.tasktrackinghelp.tth

import android.content.res.Configuration.UI_MODE_TYPE_NORMAL
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.BorderStroke

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tasktrackinghelp.tth.ui.theme.TTHTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TTHTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Title(modifier: Modifier = Modifier) {
        Surface (
            modifier = Modifier
                .fillMaxSize()
        ){
            Column{
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFA84166),
                            shape = RoundedCornerShape(bottomEnd = 12.dp, bottomStart = 12.dp)
                        )
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "NavBar",
                        fontSize = 16.sp,
                        modifier = modifier.fillMaxWidth(),
                        color = Color(0xFFf7eae8)
                    )
                    Text(
                        text = "Welcome",
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFf7eae8)
                    )
                }
                Box {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "Tasks of the Week",
                            modifier = Modifier
                                .padding(18.dp),
                            fontSize = 24.sp,
                            color = Color(0xFFa84165),
                            fontWeight = FontWeight.SemiBold,
                        )
                        Tasks(onClick = { /* TODO */ })
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .background(
                                color = Color(0xFFA84166).copy(alpha = 0.8f)
                            )
                            .padding(24.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row (
                            modifier = modifier
                                .fillMaxWidth()

                                .padding(vertical = 4.dp, horizontal = 8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                        Text("Footer", fontSize = 16.sp)
                            Text(text = "Footer", fontSize = 16.sp)
                    }
                    }
                }
            }
        }
    }

@Composable
fun Tasks(modifier: Modifier = Modifier, onClick: () -> Unit){
    val days = listOf<String>(
        "Today",
        "Tomorrow",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        items(days.chunked(2)) { rowOfDays ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                for (day in rowOfDays) {
                    Button(

                        onClick = onClick,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .padding(8.dp),
                                shape = RoundedCornerShape(10),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFf3c9d9),
                                    contentColor = Color(0xFFa84165))
                    ) {
                        Column (
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Text(
                                text = day,
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(vertical = 8.dp)
                            )
                            Text(
                                text = "01/01/2024",
                                fontSize = 12.sp,
                                modifier = Modifier
                                    .padding(8.dp)
                            )
                            Text(
                                text = "# of Tasks: 5",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(top = 20.dp, bottom = 8.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun HomePage(modifier: Modifier = Modifier) {
    Title()
}
@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "TTH preview")
@Composable
fun GreetingPreview() {
    TTHTheme {
        HomePage()
    }
}