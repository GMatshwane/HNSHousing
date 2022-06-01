package com.example.hnshousing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hnshousing.ui.theme.HNSHousingTheme

class Details : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HNSHousingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FunctionDetails(2)
                }
            }
        }
    }
}

@Composable
fun FunctionDetails(index: Int) {

    var selectedFunction : String;
    val arr: Array<String> = when(index) {
        1 -> {
            selectedFunction = stringResource(R.string.electrical);
            arrayOf(
                "Frequent electrical surges",
                "Circuit breaker tripping frequently",
                "Lights too bright or dim",
                "Light bulbs burning out too often"
            )
        }

        2 -> {
            selectedFunction = stringResource(R.string.plumbing);
            arrayOf(
                "Water leakage",
                "Broken kitchen pipe",
                "No water going into the toilet bowl",
                "No water coming from the shower head"
            )
        }

        else -> {
            selectedFunction = stringResource(R.string.funiture_text);
            arrayOf(
                "Broken TV stand",
                "Broken living room table"
            )
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()

    ) {

        Text(
            text = selectedFunction,
            modifier = Modifier
                .padding(0.dp, 20.dp)
                .align(Alignment.CenterHorizontally),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.teal_700)
        )

        Column(
            modifier = Modifier
                .wrapContentSize(Alignment.Center)
                .padding(10.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                ) {
            for (issue in arr) {
                Text(
                    text = issue,
                    color = colorResource(R.color.gray),
                    modifier = Modifier
                        .padding(10.dp, 30.dp, 10.dp,0.dp),

                   )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FunctionDetailsPreview() {
    HNSHousingTheme {
        FunctionDetails(1)
    }
}