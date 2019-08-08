package meysam.androiddatabinding.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import meysam.androiddatabinding.R;
import meysam.androiddatabinding.databinding.ActivityMainBinding;
import meysam.androiddatabinding.model.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // before Data Binding
        /*
        setContentView(R.layout.activity_main);
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewLast = findViewById(R.id.textViewLast);
        textViewName.setText("Meysam");
        textViewLast.setText("Keshvari");
        */

        // after Data Binding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // without POJO
        /*
        binding.textViewName.setText("Meysam");
        binding.textViewLast.setText("Keshvari");
        */
        // with POJO
        Person person = new Person("Meysam","Keshvari");
        binding.setPerson(person);
    }
}
