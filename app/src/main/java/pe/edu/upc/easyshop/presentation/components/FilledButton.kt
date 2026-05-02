package pe.edu.upc.easyshop.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.upc.easyshop.presentation.theme.AppTheme

@Composable
fun FilledButton(
    onClick: () -> Unit,
    text: String
) {

    Button(
        onClick = onClick, modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        Text(text = text, modifier = Modifier.padding(vertical = 8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun FilledButtonPreview() {
    AppTheme {
        FilledButton(onClick = {}, text = "Create account")

    }
}