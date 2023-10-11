package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier.background(Color(0xFFE7FFF0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(Color(0xFF4B5957))
        )
        Text(
            text = stringResource(R.string.full_name),
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(6.dp)
        )
        Text(
            text = stringResource(R.string.title),
            color = Color(0xFF5BBA86),
            fontWeight = FontWeight.Bold
        )
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(30.dp)
    ) {
        Row(modifier = Modifier.padding(6.dp)){
            Image(
                painter = painterResource(R.drawable.ic_action_phone),
                contentDescription = null,
                modifier = Modifier.padding(end = 6.dp)
            )
            Text(
                text = stringResource(R.string.phone_number)
            )
        }
        Row(modifier = Modifier.padding(6.dp)){
            Image(
                painter = painterResource(R.drawable.ic_action_social_media),
                contentDescription = null,
                modifier = Modifier.padding(end = 6.dp)
            )
            Text(
                text = stringResource(R.string.social_media)
            )
        }
        Row(modifier = Modifier.padding(6.dp)) {
            Image(
                painter = painterResource(R.drawable.ic_action_email),
                contentDescription = null,
                modifier = Modifier.padding(end = 6.dp)
            )
            Text(
                text = stringResource(R.string.email)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}