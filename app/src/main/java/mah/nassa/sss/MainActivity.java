package mah.nassa.sss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnFragmentChange {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      fragmentManager=getSupportFragmentManager();
      fragmentTransaction=fragmentManager.beginTransaction();




    }

    @Override
    public void onFragChanged(String listener) {

        if(listener.equalsIgnoreCase("red")){
            fragmentTransaction.replace(R.id.framLayout , new RedFrag());
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}