package com.example.interfacegrafica

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interfacegrafica.ui.theme.InterfaceGraficaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    var contador by remember{
        mutableStateOf(0)
    }
    Column() {
        Button(onClick = {
            contador = contador + 1
            Log.i("##### NOSSO_LOG", "Vlr do Contador = $contador")
        }) {
            Text(text = "INCREMENTA CONTADOR")
        }

        Button(onClick = {
            contador = contador - 1
            Log.i("##### NOSSO_LOG", "Vlr do Contador = $contador")
        }) {
            Text(text = "DECREMENTA CONTADOR")
        }

        Text(text = "Vlr do Contador = $contador")
        Text(text = "João Vitor de Sousa Rodrigues     RM: 22323")
    }

    Column() {

    }
    Log.i("##### NOSSO_LOG", "Vlr do Contador = $contador")
}


@Preview(showBackground = true)
@Composable
fun MinhaPreview() {
    MainScreen()
}