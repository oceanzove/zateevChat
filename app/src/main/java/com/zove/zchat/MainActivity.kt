package com.zove.zchat

import android.graphics.Paint.Align
import android.media.Image
import android.os.Bundle
import android.os.Message
import android.provider.MediaStore.Images
import android.text.Html.ImageGetter
import android.widget.ImageView
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.waterfallPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zove.zchat.R.drawable.matrix
import com.zove.zchat.ui.theme.ZchatTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZchatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Messanger()
                }
            }
        }
    }
}

@Composable
fun Messanger( modifier: Modifier = Modifier) {
    Column {
        Card (modifier = Modifier
            .wrapContentWidth()
            .padding(top = 10.dp)
            .padding(16.dp)
        ) {
            Row (
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            ) {
                Text(text = "Ты веришь в судьбу, Нео?")
            }
            Row (
                modifier = Modifier
                    .padding(start = 16.dp, bottom = 5.dp, top = 2.dp)
                    .alpha(0.5f)
            ) {
                Text(modifier = Modifier,  color = Color.Black, fontSize = 10.sp, text = "00:00")
            }

        }

    }

    Column(modifier = Modifier.padding(top = 50.dp), horizontalAlignment = Alignment.End) {
        Card (modifier = Modifier
            .wrapContentWidth()
            .padding(top = 20.dp)
            .padding(16.dp)
            .align(Alignment.End)
        ) {
            Row (
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                    .align(Alignment.End)
            ) {
                Text(text = "Нет")
            }
            Row (
                modifier = Modifier
                    .padding(start = 16.dp, bottom = 5.dp, top = 2.dp)
                    .alpha(0.5f)
            ) {
                Text(modifier = Modifier,  color = Color.Black, fontSize = 10.sp, text = "01:00")
            }
        }
    }

    Column (modifier = Modifier.padding(top = 120.dp)) {
        Card (modifier = Modifier
            .wrapContentWidth()
            .padding(top = 20.dp)
            .padding(16.dp)
        ) {
            Row (
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            ) {
                Text(text = "Почему?")
            }
            Row (
                modifier = Modifier
                    .padding(start = 16.dp, bottom = 5.dp, top = 2.dp)
                    .alpha(0.5f)
            ) {
                Text(modifier = Modifier,  color = Color.Black, fontSize = 10.sp, text = "02:00")
            }
        }
    }

    Column (modifier = Modifier.padding(top = 190.dp), horizontalAlignment = Alignment.End) {
        Card (modifier = Modifier
            .padding(top = 20.dp)
            .padding(16.dp)
            .width(250.dp)
        ) {
            Row (
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                    .align(Alignment.End)
            ) {
                Text(text = "Неприятно думать, что тобой манипулируют")
            }
            Row (
                modifier = Modifier
                    .padding(start = 16.dp, bottom = 5.dp, top = 2.dp)
                    .alpha(0.5f)
            ) {
                Text(modifier = Modifier,  color = Color.Black, fontSize = 10.sp, text = "03:03")
            }
        }
    }
}




