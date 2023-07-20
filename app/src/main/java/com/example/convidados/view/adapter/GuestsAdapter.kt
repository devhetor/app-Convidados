package com.example.convidados.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.convidados.databinding.RowGuestBinding
import com.example.convidados.model.GuestModel
import com.example.convidados.view.viewholder.GuestViewHolder

class GuestsAdapter: RecyclerView.Adapter<GuestViewHolder>() {

    private var guestList: List<GuestModel> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestViewHolder {
        val item = RowGuestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GuestViewHolder(item)
    }

    //cola para a interface
    override fun onBindViewHolder(holder: GuestViewHolder, position: Int) {
        holder.bind(guestList[position])
    }

    //tamanho da listagem
    override fun getItemCount(): Int {
        return guestList.count()
    }

    fun updadeGuests(list: List<GuestModel>){
        guestList = list
        notifyDataSetChanged()
    }
}