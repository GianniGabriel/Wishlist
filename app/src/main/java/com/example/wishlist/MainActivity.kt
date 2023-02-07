package com.example.wishlist

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var itemNameEditText: EditText
    private lateinit var itemPriceEditText: EditText
    private lateinit var itemUrlEditText: EditText
    private lateinit var submitButton: Button
    private lateinit var itemListLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemNameEditText = findViewById(R.id.item_name_edit_text)
        itemPriceEditText = findViewById(R.id.item_price_edit_text)
        itemUrlEditText = findViewById(R.id.item_url_edit_text)
        submitButton = findViewById(R.id.submit_button)
        itemListLayout = findViewById(R.id.item_list_layout)

        submitButton.setOnClickListener {
            val itemName = itemNameEditText.text.toString()
            val itemPrice = itemPriceEditText.text.toString()
            val itemUrl = itemUrlEditText.text.toString()

            if (itemName.isNotEmpty() && itemPrice.isNotEmpty() && itemUrl.isNotEmpty()) {
                val itemTextView = TextView(this)
                itemTextView.text = "$itemName - $itemPrice"
                itemListLayout.addView(itemTextView)
            }
        }
    }
}
