package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15055494 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<FormulaItem> formulaList;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        formulaList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater
                = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);
        FormulaItem currentItem = formulaList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvFormula.setText(currentItem.getFormula());
        tvType.setText("Formula Type is:"+currentItem.getType());
        return rowView;
    }
}
