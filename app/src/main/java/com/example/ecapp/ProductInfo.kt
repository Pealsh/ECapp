package com.example.ecapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ecapp.ui.theme.ECAppTheme

@Composable
fun ProductInfo(
    name: String,
    price: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProductName(name = name)
        ProductPrice(price = price)
    }
}

@Composable
fun ProductName(name: String) {
    Text(
        text = name,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun ProductPrice(price: Int) {
    Text(
        text = "¥%,d".format(price),
        style = MaterialTheme.typography.headlineMedium,
        color = MaterialTheme.colorScheme.primary
    )
}

@Preview(showBackground = true)
@Composable
fun ProductInfoPreview() {
    ECAppTheme {
        ProductInfo(
            name = "iPhone",
            price = 120000
        )
    }
}
