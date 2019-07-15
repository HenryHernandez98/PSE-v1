package techo.apps.isi.uca.com.android_aps.ui.adapters;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;
import techo.apps.isi.uca.com.android_aps.R;
import techo.apps.isi.uca.com.android_aps.models.ExperienceModel;
import techo.apps.isi.uca.com.android_aps.utilities.Util;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;


/**
 * Created by Henry Hernandez on 04/05/2018.
 */

public class ExperienceFromDatabaseAdapter extends RecyclerView.Adapter<ExperienceFromDatabaseAdapter.ViewHolder> {

    private RealmResults<ExperienceModel> eDataset;
   // private Context context;



    public static class ViewHolder extends RecyclerView.ViewHolder{
        //for show
        public TextView date;
        public LinearLayout item;
        public Context context;

        public ViewHolder(View view, Context _context) {
            super(view);
           date = view.findViewById(R.id.date);

            context = _context;
        }
    }

    public ExperienceFromDatabaseAdapter (RealmResults<ExperienceModel> myDatabase){
        eDataset= myDatabase;
    }
        @Override
        public ExperienceFromDatabaseAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.experience_item, parent, false);

        return new ExperienceFromDatabaseAdapter.ViewHolder(view, parent.getContext());
    }

        @Override
        public void onBindViewHolder(final ExperienceFromDatabaseAdapter.ViewHolder holder, final int position) {
        //ExperienceModel experienceModel = experiences.get(position);
        ExperienceModel experienceModel = eDataset.get(position);

        //Only one how to example
        Log.i("date", experienceModel.getDate());
        holder.date.setText(experienceModel.getDate());

        holder.item.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                new MaterialDialog.Builder(holder.context)
                        .content("¿Borrar el registro?")
                        .positiveText("Borrar")
                        .negativeText("No")
                        .onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick( MaterialDialog dialog,  DialogAction which) {
                                remoteItemFromDatabase(eDataset.get(position));
                            }
                        })
                        .show();


                return true;
            }
        });



    }



    @Override
    public int getItemCount() {
        return eDataset.size();
    }

    private void remoteItemFromDatabase(ExperienceModel experienceModel) {
        Realm realm = Realm.getDefaultInstance();

        realm.beginTransaction();
        experienceModel.deleteFromRealm();
        realm.commitTransaction();
    }


}
