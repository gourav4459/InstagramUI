package com.example.instagramui.main_feed_screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.instagramui.R
import com.example.instagramui.model.User

@Composable
fun MainFeedScreen(){

    val users = listOf(
        User(
            profilePic = painterResource(R.drawable.jon_snow),
            username = "jon_snow",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.jon_snow_post),
            likeCount = 168000,
            commentCount = 2345,
            caption = "A lone wolf"
        ),
        User(
            profilePic = painterResource(R.drawable.arya_stark),
            username = "arya_stark",
            location = "Bristol , United Kingdom",
            postPic = painterResource(R.drawable.arya_stark_post),
            likeCount = 23300,
            commentCount = 4655,
            caption = "A mind needs books as a sword needs a whetstone ,if it's to keep its edge"
        ),
        User(
            profilePic = painterResource(R.drawable.bran_stark),
            username = "bran_stark",
            location = "Surrey, United Kingdom",
            postPic = painterResource(R.drawable.bran_stark_post),
            likeCount = 12345,
            commentCount = 823,
            caption = "Chaos is a ladder"
        ),
        User(
            profilePic = painterResource(R.drawable.daenerys_targaryen),
            username = "queen_daenerys",
            location = "London, United Kingdom",
            postPic = painterResource(R.drawable.daenerys_targaryen_post),
            likeCount = 1843903,
            commentCount = 9765,
            caption = "Daenerys Stormborn of House Targaryen,the First of Her Name,Queen of the Andals and the First Men,Protector of the Seven Kingdoms,the Mother of Dragons "
        ),
        User(
            profilePic = painterResource(R.drawable.jorah_mormont),
            username = "jorah_mormont",
            location = "London , United Kingdom",
            postPic = painterResource(R.drawable.jorah_mormont_post),
            likeCount = 1680,
            commentCount = 245,
            caption = "Tonight"
        ),
        User(
            profilePic = painterResource(R.drawable.rob_stark),
            username = "robb_Stark",
            location = "Copenhagen,Denmark",
            postPic = painterResource(R.drawable.robb_stark_post),
            likeCount = 32890,
            commentCount = 4553,
            caption = "This is about Survival"
        ),
        User(
            profilePic = painterResource(R.drawable.sansa_stark),
            username = "sansa_Stark",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.sansa_stark_post),
            likeCount = 5678080,
            commentCount = 324255,
            caption = "Did you bend the knee to save the North or because you love her?"
        ),
        User(
            profilePic = painterResource(R.drawable.tyrian_lannister),
            username = "tyrian_Lannister",
            location = "Morristown , New Jersey",
            postPic = painterResource(R.drawable.tyrian_lannister_post),
            likeCount = 7128638,
            commentCount = 24565,
            caption = "I believe in our Queen"
        ),
    )
    Scaffold(
        backgroundColor = Color.White,
        topBar = {
                 TopBar()
        },
        bottomBar = {
            BottomBar()
        }
    ){
        innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ){
            item { 
                LazyRow{
                    items(users){ user ->
                        StoryWidget(user = user)
                    }
                }
            }
            item{ Divider() }
            items(users){user->
                PostWidget(user = user)
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}