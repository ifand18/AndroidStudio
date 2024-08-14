
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diskominfo.ragem.Screen
import com.diskominfo.ragem.components.CButton
import com.diskominfo.ragem.components.CTextField

@Composable
fun LupaPasswordScreen(
    onNavigate: (Screen) -> Unit
) {
    Surface (
        color = Color.White
    ){

        Box(modifier = Modifier.fillMaxSize()){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)

            ){

                Spacer(modifier = Modifier.height(80.dp))

                Text(text = "Lupa Password?",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                    ),
                    modifier = Modifier
                        .padding(bottom = 24.dp)
                        .align(Alignment.Start)
                )

                Text(text = "Kami akan mengirimkan 4 digit kode OTP ke nomer telepon atau alamat email anda di bawah ini ",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Black
                    ),
                    modifier = Modifier
                        .padding(bottom = 24.dp)
                )

                CTextField(hint = "Masukkan Email/No.Telp Anda", value = "")

                Spacer(modifier = Modifier.height(20.dp))

                CButton(text = "Kirim", onClick = {
                    onNavigate(Screen.OTP)
                })

            }

        }


    }
}