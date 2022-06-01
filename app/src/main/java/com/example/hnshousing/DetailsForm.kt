package com.example.hnshousing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hnshousing.ui.theme.HNSHousingTheme

class DetailsForm : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HNSHousingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DetailsCaptureForm()
                }
            }
        }
    }
}

@Composable
fun DetailsCaptureForm() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(5.dp)
    ) {
        // Parent Container

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                text = "Maintenance Required",
                color = colorResource(R.color.black),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Where is the problem?",
                color = colorResource(R.color.gray),
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = text ,
                onValueChange = {
                    text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, colorResource(R.color.teal_700), RoundedCornerShape(5.dp))
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            Text(
                text = "What item is having issue?",
                color = colorResource(R.color.gray),
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = text ,
                onValueChange = {
                    text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, colorResource(R.color.teal_700), RoundedCornerShape(5.dp))
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            Text(
                text = "Describe the problem",
                color = colorResource(R.color.gray),
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = text ,
                onValueChange = {
                    text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, colorResource(R.color.teal_700), RoundedCornerShape(5.dp))
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            Text(
                text = "Tenant Details",
                color = colorResource(R.color.black),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Reference",
                color = colorResource(R.color.gray),
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = text ,
                onValueChange = {
                    text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, colorResource(R.color.teal_700), RoundedCornerShape(5.dp))
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            Text(
                text = "Address",
                color = colorResource(R.color.gray),
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = text ,
                onValueChange = {
                    text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, colorResource(R.color.teal_700), RoundedCornerShape(5.dp))
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            Text(
                text = "Name",
                color = colorResource(R.color.gray),
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = text ,
                onValueChange = {
                    text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, colorResource(R.color.teal_700), RoundedCornerShape(5.dp))
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            Text(
                text = "Contact Number",
                color = colorResource(R.color.gray),
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = text ,
                onValueChange = {
                    text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, colorResource(R.color.teal_700), RoundedCornerShape(5.dp))
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            Text(
                text = "Email",
                color = colorResource(R.color.gray),
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = text ,
                onValueChange = {
                    text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, colorResource(R.color.teal_700), RoundedCornerShape(5.dp))
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.teal_700))
                ) {
                    Text(text = "Select", color = colorResource(R.color.white))
                }

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.teal_700))
                ) {
                    Text(text = "View/Update", color = colorResource(R.color.white))
                }

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.teal_700))
                ) {
                    Text(text = "Delete", color = colorResource(R.color.white))
                }
            }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsCaptureFormPreview() {
    HNSHousingTheme {
        DetailsCaptureForm()
    }
}