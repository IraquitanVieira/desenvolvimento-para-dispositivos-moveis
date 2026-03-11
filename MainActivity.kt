package edu.app.iraki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.R
import com.example.iraki.ui.theme.IrakiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IrakiTheme{
            }
        }

    }
}
data class Message( val body: String, val author: String)

@Composable
fun MessageCard(msg: Message) {
    Image(
        painter = painterResource(id = R.drawable.),
        contentDescription = "imagem de perfil",
        modifier = Modifier
            .size(49.dp)
            .clip(CircleShape)
    )
    Spacer(modifier = Modifier.width(10.dp))
    Column{
        Text(text = msg.author)
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = msg.body)
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    Column{
        MessageCard(msg = Message(autr))
    }
}
