package pe.edu.upc.easyshop.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.upc.easyshop.R
import pe.edu.upc.easyshop.presentation.components.FilledButton
import pe.edu.upc.easyshop.presentation.theme.AppTheme

@Composable
fun OnBoarding(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = null
        )

        FilledButton(onClick = {}, text = "Create account")

        OutlinedButton(
            onClick = {

            }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        ) {
            Text("Sign in", modifier = Modifier.padding(vertical = 8.dp))
        }
    }

}


@Preview(showBackground = true)
@Composable
fun OnBoardingPreview() {
    AppTheme {
        OnBoarding()
    }
}