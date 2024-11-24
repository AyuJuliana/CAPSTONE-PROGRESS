package com.example.medisight.ui.custom

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import com.example.medisight.R

class PasswordEditText : AppCompatEditText {
    private var isPasswordVisible = false

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    private fun init() {
        // Set the default input type for password
        inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        updatePasswordVisibility()

        // Add validation logic for password requirements
        addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                validatePassword(s)
            }

            override fun afterTextChanged(s: Editable) {}
        })
    }

    private fun validatePassword(s: CharSequence) {
        // Check if the input is not empty and validate step-by-step
        if (s.isNotEmpty()) {
            when {
                s.length < 8 -> {
                    error = context.getString(R.string.password_length_error)
                }
                !s.matches(".*[A-Z].*".toRegex()) -> {
                    error = context.getString(R.string.password_uppercase_error)
                }
                !s.matches(".*\\d.*".toRegex()) -> {
                    error = context.getString(R.string.password_digit_error)
                }
                else -> {
                    // Clear error if all conditions are met
                    error = null
                }
            }
        }
    }

    private fun updatePasswordVisibility() {
        // Set input type based on visibility flag
        inputType = if (isPasswordVisible) {
            InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
        } else {
            InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        }

        // Update the drawable for password visibility toggle
        setCompoundDrawablesWithIntrinsicBounds(
            R.drawable.ic_lock,
            0,
            if (isPasswordVisible) R.drawable.ic_hide_pass else R.drawable.ic_show_pass,
            0
        )

        // Keep cursor position at the end of the input
        setSelection(text?.length ?: 0)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        val drawableRight = compoundDrawables[2]
        if (event.action == MotionEvent.ACTION_UP && drawableRight != null) {
            // Check if the touch event is within the bounds of the visibility toggle icon
            val touchable = event.x > (width - paddingRight - drawableRight.intrinsicWidth)
            if (touchable) {
                // Toggle password visibility and update the view
                isPasswordVisible = !isPasswordVisible
                updatePasswordVisibility()
                return true
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // Set hint and alignment during the drawing phase
        hint = context.getString(R.string.password_hint)
        textAlignment = View.TEXT_ALIGNMENT_VIEW_START
    }
}
