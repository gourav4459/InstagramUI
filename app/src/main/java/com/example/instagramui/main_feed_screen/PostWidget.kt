package com.example.instagramui.main_feed_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramui.R
import com.example.instagramui.model.User

@SuppressLint("UnrememberedMutableState")
@Composable
fun PostWidget(
    user: User
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ){
        //yeh profile ki row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape),
                    painter = user.profilePic ,
                    contentDescription = "Profile Pic"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column{
                    Text(
                        text = user.username,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Text(
                        text = user.location,
                        fontSize = 14.sp
                    )
                }
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_more),
                    contentDescription = "More Options"
                )
            }
        }
        //phir images
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = user.postPic,
            contentDescription = "Post Pic",
            contentScale = ContentScale.FillWidth
        )
        //phir icons ki row

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){

            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                IconButton(onClick = { /*TODO*/ }) {
                    val color = mutableStateOf(Color.Red)
                    Icon(

                        painter = painterResource(R.drawable.ic_like_outline),
                        contentDescription = "Like Post",
                        tint = Color.Black,
                        modifier = Modifier.size(25.dp)
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_comment),
                        contentDescription = "Comment",
                        tint = Color.Black,
                        modifier = Modifier.size(30.dp)
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_send),
                        contentDescription = "Send Post",
                        tint = Color.Black,
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_save),
                    contentDescription = "Save Post",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(horizontal = 10.dp)
        ){
            Text(text = "${user.likeCount} likes")
            Text(
                text = buildAnnotatedString {
                    append(
                        AnnotatedString(
                            text = "${user.username} ",
                            spanStyle = SpanStyle(fontWeight = FontWeight.Bold)
                        )
                    )
                    append(
                        user.caption
                    )
                }
            )
            Text(
                text = "View all ${user.commentCount} comments",
                color = Color.DarkGray,
                fontSize = 13.sp
            )
            
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PostWidgetPrev(){
    PostWidget(
        User(
            profilePic = painterResource(R.drawable.jon_snow),
            username = "jon_snow",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.jon_snow_post),
            likeCount = 168000,
            commentCount = 2345,
            caption = "A lone wolf"
        ),
    )
}