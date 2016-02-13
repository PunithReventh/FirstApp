package punith.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ListActivity {

    String[] Members = {"Mother", "Father", "Sister", "Grandfather", "Grandmother"};

    Integer[] imageIDs = {
            R.drawable.mom,
            R.drawable.dad,
            R.drawable.sis,
            R.drawable.grandpa,
            R.drawable.grandma
    };

    String[] Description = {"Caretaker of the family", "Breadwinner of the family", "Cutie Pie of the Family", "Mr. Knowledged and Experienced", "Mrs. Knowledged and Experienced"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AdvancedCustomArrayAdapter adapter =new AdvancedCustomArrayAdapter(this, Members, imageIDs, Description);
        setListAdapter(adapter);

    }


}
