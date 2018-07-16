package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;
    ArrayList<FormulaItem> alFormula;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewFormula);
        alFormula = new ArrayList<>();

        alFormula.add(new FormulaItem("Area of rectangle", "Length x Length", "Area"));
        alFormula.add(new FormulaItem("Area of triangle", "(Length of base x Length) / 2", "Area"));
        alFormula.add(new FormulaItem("Volume of Cube", "Length x Length x Length", "Volume"));

        caFormula = new CustomAdapter(this, R.layout.formula_row, alFormula);

        lvFormula.setAdapter(caFormula);
    }
}
