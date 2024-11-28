package com.example.medisight.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medisight.R
import com.example.medisight.ui.adapter.ChatAdapter
import com.example.medisight.ui.viewmodel.ChatBotViewModel
import com.google.android.material.card.MaterialCardView

class ChatBotActivity : AppCompatActivity() {
    private lateinit var chatAdapter: ChatAdapter
    private lateinit var recyclerViewMessages: RecyclerView
    private lateinit var editTextChatInput: EditText
    private lateinit var btnSendMessage: ImageButton
    private lateinit var progressBar: ProgressBar
    private lateinit var backButton: ImageButton

    private val viewModel: ChatBotViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat_bot)

        backButton = findViewById(R.id.btnBack)

        setupViews()
        setupViews()
        setupRecyclerView()
        setupCardListeners()
        observeViewModel()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun setupViews() {
        recyclerViewMessages = findViewById(R.id.recyclerViewMessages)
        editTextChatInput = findViewById(R.id.editTextChatInput)
        btnSendMessage = findViewById(R.id.btnSendMessage)
        progressBar = findViewById(R.id.progressBarLoading)

        backButton.setOnClickListener {
            finish()
        }

        btnSendMessage.setOnClickListener {
            val message = editTextChatInput.text.toString().trim()
            if (message.isNotEmpty()) {
                viewModel.sendUserMessage(message)
                editTextChatInput.text.clear()
            }
        }

    }

    private fun setupRecyclerView() {
        chatAdapter = ChatAdapter(mutableListOf())
        recyclerViewMessages.apply {
            layoutManager = LinearLayoutManager(this@ChatBotActivity)
            adapter = chatAdapter
        }
    }

    private fun setupCardListeners() {
        val cardMinorAbrasions: MaterialCardView = findViewById(R.id.cardMinorAbrasions)
        val cardMinorBurns: MaterialCardView = findViewById(R.id.cardMinorBurns)
        val cardMinorNormal: MaterialCardView = findViewById(R.id.cardMinorNormal)
        val cardMinorCuts: MaterialCardView = findViewById(R.id.cardMinorCuts)
        val cardMinorBruises: MaterialCardView = findViewById(R.id.cardMinorBruises)

        cardMinorAbrasions.setOnClickListener {
            viewModel.sendCardMessage(
                getString(R.string.injury_minor_scratch),
                getString(R.string.injury_minor_scratch_desc)
            )
        }

        cardMinorBurns.setOnClickListener {
            viewModel.sendCardMessage(
                getString(R.string.injury_burn),
                getString(R.string.injury_burn_desc)
            )
        }

        cardMinorNormal.setOnClickListener {
            viewModel.sendCardMessage(
                getString(R.string.injury_normal),
                getString(R.string.injury_normal_desc)
            )
        }

        cardMinorCuts.setOnClickListener {
            viewModel.sendCardMessage(
                getString(R.string.injury_cut),
                getString(R.string.injury_cut_desc)
            )
        }

        cardMinorBruises.setOnClickListener {
            viewModel.sendCardMessage(
                getString(R.string.injury_bruise),
                getString(R.string.injury_bruise_desc)
            )
        }
    }

    private fun observeViewModel() {
        viewModel.messages.observe(this) { messages ->
            chatAdapter = ChatAdapter(messages)
            recyclerViewMessages.adapter = chatAdapter
            recyclerViewMessages.scrollToPosition(messages.size - 1)
        }

        viewModel.isLoading.observe(this) { isLoading ->
            progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
            btnSendMessage.isEnabled = !isLoading
        }
    }

}