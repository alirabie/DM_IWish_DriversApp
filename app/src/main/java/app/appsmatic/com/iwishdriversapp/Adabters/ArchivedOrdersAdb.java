package app.appsmatic.com.iwishdriversapp.Adabters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import app.appsmatic.com.iwishdriversapp.API.Models.ArchivedOrder;
import app.appsmatic.com.iwishdriversapp.R;

/**
 * Created by Mido PC on 8/17/2016.
 */


public class ArchivedOrdersAdb extends RecyclerView.Adapter<ArchivedOrdersAdb.vh2> {


    private List<ArchivedOrder> archivedOrders;
    private Context context;
    private float totalmount;

    public ArchivedOrdersAdb(List<ArchivedOrder> archivedOrders, Context context) {
        this.archivedOrders = archivedOrders;
        this.context = context;
    }




    @Override
    public vh2 onCreateViewHolder(ViewGroup parent, int viewType) {
        return new vh2(LayoutInflater.from(parent.getContext()).inflate(R.layout.archived_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(vh2 holder, int position) {



        //Date setup
        SimpleDateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat DesiredFormat = new SimpleDateFormat("hh:mm a", Locale.ENGLISH);
        SimpleDateFormat DateFormat=new SimpleDateFormat("yyyy/MM/dd",Locale.ENGLISH);
        Date time = null;
        try {
            time = sourceFormat.parse(archivedOrders.get(position).getAssignedDate()+"");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date date=null;
        try {
            date = sourceFormat.parse(archivedOrders.get(position).getOrderDate()+"");
        } catch (ParseException e) {
            e.printStackTrace();
        }


        String timeTv = DesiredFormat.format(time.getTime());
        String dateTv=DateFormat.format(date);


        holder.orderid.setText(archivedOrders.get(position).getOrderID() + "");
        holder.price.setText(archivedOrders.get(position).getTotalAmount()+"");
        holder.date.setText(dateTv);
        holder.time.setText(timeTv);





    }

    @Override
    public int getItemCount() {

        return archivedOrders.size();
    }










    public static class vh2 extends RecyclerView.ViewHolder{

        TextView orderid,price,time,date;


        public vh2(View itemView) {
            super(itemView);
            orderid=(TextView)itemView.findViewById(R.id.ar_order);
            price=(TextView)itemView.findViewById(R.id.ar_price);
            time=(TextView)itemView.findViewById(R.id.ar_time);
            date=(TextView)itemView.findViewById(R.id.ar_date);



        }
    }
}
