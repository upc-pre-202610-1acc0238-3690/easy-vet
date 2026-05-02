package pe.edu.upc.easyshop.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.upc.easyshop.R
import pe.edu.upc.easyshop.presentation.components.FilledButton
import pe.edu.upc.easyshop.presentation.theme.AppTheme

@Composable
fun Login(modifier: Modifier = Modifier) {

    val email = remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    val isVisible = remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.dog),
            contentDescription = null,
            modifier = Modifier.size(width = 240.dp, height = 360.dp)
        )

        OutlinedTextField(
            value = email.value,
            onValueChange = {
                email.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            placeholder = {
                Text("Email")
            }
        )

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            visualTransformation = if (isVisible.value)
                VisualTransformation.None
            else PasswordVisualTransformation(),
            trailingIcon = {
                IconButton(
                    onClick = {
                        isVisible.value = !isVisible.value
                    }
                ) {
                    Icon(
                        if (isVisible.value) Icons.Default.Visibility else
                            Icons.Default.VisibilityOff,
                        contentDescription = null
                    )
                }
            },
            placeholder = {
                Text("Password")
            }
        )

        FilledButton(onClick = {

        }, text = "Login")
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    AppTheme {
        Login()
    }
}