package com.example.hnshousing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hnshousing.ui.theme.HNSHousingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HNSHousingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LandingOptions()
                }
            }
        }
    }
}

@Composable
fun LandingOptions() {
    Column (
        modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            // Add onClick action here
        },
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.teal_700)))
        {
            Text(text = stringResource(id = R.string.electrical), color = Color.White)
        }

        Button(onClick = {
            // Add onClick action here
        },
            modifier = Modifier
                .height(100.dp)
                .padding(top = 10.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.teal_700))) {
            Text(text = stringResource(R.string.plumbing), color = Color.White)
        }

        Button(onClick = {
            // Add onClick action here
        },
            modifier = Modifier
                .height(100.dp)
                .padding(top = 10.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.teal_700))) {

            Text(
                text = stringResource(R.string.funiture_text),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HNSHousingTheme {
        LandingOptions()
    }
}