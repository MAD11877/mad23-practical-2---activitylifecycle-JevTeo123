package sg.edu.np.mad.mad_practical_3;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class BrandViewHolder extends RecyclerView.ViewHolder {
    TextView txt;

    public BrandViewHolder(View itemView){
        super(itemView);
        txt = itemView.findViewById(R.id.textView2)
    }
}
