package com.akirackix.messageandapplyforloanpart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.wallet.Wallet


class WalletRecyclerViewerAdapter (val wallet:List<Wallet>):RecyclerView.Adapter<WalletViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_of_money,parent,false)
        return WalletViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return wallet.size
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = wallet[position]
        holder.tvSalary.text=wallet.tvSalary
        holder.tvCash3.text = wallet.tvCash3
        holder.tvdate.text = wallet.tvdate
    }
}

class WalletViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    val tvCash3 = itemView.findViewById<TextView>(R.id.tvCash3)
    val tvdate = itemView.findViewById<TextView>(R.id.tvdate)
}
