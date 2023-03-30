package com.example.instagramui.main_feed_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramui.R

@Composable
fun TopBar(){
    val instaTitleFont = FontFamily(Font(R.font.instagram_logo_font))
    TopAppBar(
        title = {
            Text(
                modifier = Modifier.offset(y = 5.dp),
                text = "Instagram",
                fontSize = 35.sp,
                fontFamily = instaTitleFont
            )
        },
        backgroundColor = Color.White,
        elevation = 2.dp,
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.ic_message),
                    contentDescription = "Message",
                    tint = Color.Black
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar()
}