package ironyard.com.contactandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {

    ArrayAdapter<String> contacts;

    ListView list;
    EditText text;
    EditText phoneText;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);
        text = (EditText) findViewById(R.id.editText);
        phoneText = (EditText) findViewById(R.id.phoneText);
        addButton = (Button) findViewById(R.id.button);

        contacts = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(contacts);

        addButton.setOnClickListener(this);
        list.setOnItemLongClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String contact = text.getText().toString();
        String contact1 = phoneText.getText().toString();
        contacts.add(contact);
        contacts.add(contact1);
        text.setText("");
        phoneText.setText("");

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        String contact = contacts.getItem(position);
        contacts.remove(contact);
        return true;
    }
}
