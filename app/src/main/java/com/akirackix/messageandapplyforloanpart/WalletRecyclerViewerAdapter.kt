package com.akirackix.messageandapplyforloanpart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirackix.messageandapplyforloanpart.databinding.ListOfMoneyBinding
import com.google.android.gms.wallet.Wallet

data class Wallets(
    var tvSalary:String,
    var tvCash3:String,
    var tvdate:String,
    var isIncome:Boolean
)
class WalletRecyclerViewerAdapter (val wallet:List<Wallets>):RecyclerView.Adapter<WalletViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        var binding = ListOfMoneyBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return WalletViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return wallet.size
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = wallet[position]
        holder.binding.tvSalary.text=wallet.tvSalary
        holder.binding.tvCash3.text = wallet.tvCash3
        holder.binding.tvdate.text = wallet.tvdate
holder.binding.apply {
        if (wallet.isIncome){
            imageView.setImageResource(R.drawable.income)
     }

    else{
        imageView.setImageResource(R.drawable.income_trx)
        }

}
    }
}

class WalletViewHolder(var binding:ListOfMoneyBinding):RecyclerView.ViewHolder(binding.root){
}
