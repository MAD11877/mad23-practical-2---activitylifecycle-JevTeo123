package sg.edu.np.mad.mad_practical_3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView txt;
    ImageView image;

    public CustomViewHolder(View itemView){
        super(itemView);
        txt = itemView.findViewById(R.id.textView2);
        image = itemView.findViewById(R.id.imageView);
    }
}
