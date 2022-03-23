package com.example.recyclerexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerexample.databinding.TicketItemBinding

class TicketsAdapter(var tickets: List<Ticket>)
    : RecyclerView.Adapter<TicketsAdapter.TicketsHolder>() {
    override fun getItemCount(): Int {
        return tickets.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketsHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = TicketItemBinding.inflate(
            inflater,
            parent,
            false
        )

        return TicketsHolder(binding)
    }


    override fun onBindViewHolder(holder: TicketsHolder, position: Int) {
        holder.bind(tickets[position])
    }



    class TicketsHolder(
        private val binding: TicketItemBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(ticket: Ticket){
            with(binding){
                ticketNumber.text = ticket.flightNumber
                departureTime.text = ticket.startTime
                departurePlace.text = ticket.startPlace
                arrivalTime.text = ticket.endTime
                arrivalPlace.text = ticket.endPlace
                flightDate.text = ticket.date
                flightTime.text = ticket.flightTime
            }
        }
    }



}