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
        val item= Wallets("Salary","40000","4 June 2024")
        val item1= Wallets("Rent","16000","4 June 2024")
        val item3= Wallets("Water","2400","4 June 2024")
        val item4= Wallets("Electricity","600","4 June 2024")
        val item5= Wallets("Internet","2500","4 June2024")
        val item6= Wallets("Shopping","3500","4 June 2024")
        val item7= Wallets("Gas","500","4 June 2024")
        val item8= Wallets("Outings","400","4 June 2024")
        val item9= Wallets("Spicies","300","4 June 2024")

        val wallet= listOf(item,item3,item4,item5,item6,item7,item8,item9,item1)
        val walletAdapter = WalletRecyclerViewerAdapter(wallet)
        binding.rvWallet.adapter = walletAdapter

    }
}




