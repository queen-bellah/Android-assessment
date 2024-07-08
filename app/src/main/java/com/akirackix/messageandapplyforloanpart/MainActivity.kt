package com.akirackix.messageandapplyforloanpart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirackix.messageandapplyforloanpart.databinding.ActivityMainBinding
import com.google.android.gms.wallet.Wallet

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        showWallet()

    }
    fun showWallet(){
        val item= Wallet("Salary","40000","1 June 2024")
        val item1= Wallet("Rent","16000","2 June 2024")
        val item3= Wallet("Water","2400","4 June 2024")
        val item4= Wallet("Electricity","600","5 June 2024")
        val item5= Wallet("Internet","2500","6 Jule 2024")
        val item6= Wallet("Shopping","3500","7 Jule 2024")
        val item7= Wallet("Bus Fare","500","8 Jule 2024")
        val item8= Wallet("Water bill","400","9 July 2024")
        val item9= Wallet("Token","300","10 July 2024")

        val wallet= listOf(item,item3,item4,item5,item6,item7,item8,item9,item1)
        val walletAdapter = WalletRecyclerViewerAdapter(wallet)
        binding.rvWallet.adapter = walletAdapter

    }
}




