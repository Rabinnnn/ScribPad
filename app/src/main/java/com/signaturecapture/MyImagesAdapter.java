package com.signaturecapture;

//import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.List;


public class MyImagesAdapter extends RecyclerView.Adapter<MyImagesAdapter.ViewHolder>{
    private MyImagesData[] imagesdata;
    private Context context;
   // private List<Symptoms> symptoms;
    private List<Upload> uploads;


    FirebaseStorage storage;
    StorageReference storageReference;


    // RecyclerView recyclerView;
   /* public MyImagesAdapter(Context context,MyImagesData[] imagesdata)
    {
        this.imagesdata = imagesdata;
        this.context = context;
    } */

    public MyImagesAdapter(Context context, List<Upload> uploads) {
        this.uploads = uploads;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();
        final MyImagesData myImagesData = imagesdata[position];

        Upload upload = uploads.get(position);

        holder.textView.setText(imagesdata[position].getDescription());
       // holder.imageView.setImageResource(listdata[position].getImgId());
        Glide.with(context).load(upload.getUrl()).into(holder.imageView1);



      /*  storageRef.child("symptoms/" + Search_Existing_Records.name.getText().toString()).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri urs) {
                // Got the download URL for 'users/me/profile.png'
                Glide.with(holder.imageView1.getContext())
                        .load(urs)
                        .override(Target.SIZE_ORIGINAL)

                       // .override(200, 200)
                        .into(holder.imageView1);


            }
        });

       storageRef.child("treatment/" + Search_Existing_Records.name.getText().toString()).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri urt) {
                // Got the download URL for 'users/me/profile.png'
                Glide.with(holder.imageView1.getContext())
                        .load(urt)
                        .override(Target.SIZE_ORIGINAL)

                        // .override(200, 200)
                        .into(holder.imageView1);

            }
        });

        storageRef.child("notes/" + Search_Existing_Records.name.getText().toString()).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri urn) {
                // Got the download URL for 'users/me/profile.png'
                Glide.with(holder.imageView1.getContext())
                        .load(urn)
                        .override(Target.SIZE_ORIGINAL)

                        // .override(200, 200)
                        .into(holder.imageView1);

            }
        });  */

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Context context = holder.relativeLayout.getContext();

                // Intent intent = new Intent(context, Displayed_Patients_Records2.class);
                //  context.startActivity(intent);
                Toast.makeText(view.getContext(),"click on item: "+myImagesData.getDescription(),Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public int getItemCount() {
        return uploads.size();

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView1,imageView2,imageView3;
        public TextView textView;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView1 = (ImageView) itemView.findViewById(R.id.imageView1);
           // this.imageView2 = (ImageView) itemView.findViewById(R.id.imageView2);
           // this.imageView3 = (ImageView) itemView.findViewById(R.id.imageView3);

            this.textView = (TextView) itemView.findViewById(R.id.textView);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}