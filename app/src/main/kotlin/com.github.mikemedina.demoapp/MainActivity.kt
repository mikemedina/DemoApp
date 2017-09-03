package com.github.mikemedina.demoapp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Toast.makeTest(this.@MainActivity, "Hello", Toast.LENGTH_LONG)
        }

        var items = ArrayList<String>()
        items.add("item 1")
        items.add("item 2")
        items.add("item 3")
        items.add("item 4")

        listView.adapter = ArrayAdapter<String>(this@MainActivity, android.R.layout.simple_list_item_1, items)
    }

    fun makeToast(view: View) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
    }

}
