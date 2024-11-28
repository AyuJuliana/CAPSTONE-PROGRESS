package com.example.medisight.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.medisight.R
import com.example.medisight.data.model.Message
import com.example.medisight.data.model.MessageType

class ChatAdapter(private val messages: MutableList<Message>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val VIEW_TYPE_USER = 1
        private const val VIEW_TYPE_BOT = 2
        private const val VIEW_TYPE_CARD = 3
    }

    class UserMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textMessage: TextView = itemView.findViewById(R.id.textUserMessage)
    }

    class BotMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textMessage: TextView = itemView.findViewById(R.id.textBotMessage)
    }

    class CardMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardTitle: TextView = itemView.findViewById(R.id.cardTitle)
        val cardDescription: TextView = itemView.findViewById(R.id.cardDescription)
    }

    override fun getItemViewType(position: Int): Int {
        return when (messages[position].type) {
            MessageType.USER -> VIEW_TYPE_USER
            MessageType.BOT -> VIEW_TYPE_BOT
            MessageType.CARD -> VIEW_TYPE_CARD
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_USER -> UserMessageViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_user_message, parent, false)
            )

            VIEW_TYPE_BOT -> BotMessageViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_bot_message, parent, false)
            )

            VIEW_TYPE_CARD -> CardMessageViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_card_message, parent, false)
            )

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message = messages[position]
        when (holder) {
            is UserMessageViewHolder -> holder.textMessage.text = message.text
            is BotMessageViewHolder -> holder.textMessage.text = message.text
            is CardMessageViewHolder -> {
                holder.cardTitle.text = message.text.split("|")[0]
                holder.cardDescription.text = message.text.split("|")[1]
            }
        }
    }

    override fun getItemCount() = messages.size
}