import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity {

    SQLiteDatabase db;
    EditText bookName;
    Button addButton;
    ListView bookList;
    ArrayAdapter<String> adapter;
    ArrayList<String> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = openOrCreateDatabase("Library", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS Books (name VARCHAR);");

        bookName = findViewById(R.id.bookName);
        addButton = findViewById(R.id.addButton);
        bookList = findViewById(R.id.bookList);

        books = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, books);
        bookList.setAdapter(adapter);

        addButton.setOnClickListener(v -> {
            String name = bookName.getText().toString();
            if (!name.isEmpty()) {
                db.execSQL("INSERT INTO Books (name) VALUES ('" + name + "');");
                books.add(name);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
