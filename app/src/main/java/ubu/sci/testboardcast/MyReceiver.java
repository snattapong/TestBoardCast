package ubu.sci.testboardcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Toast.makeText(context,"Boot Completed",Toast.LENGTH_SHORT).show();
        }
        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){

            boolean no_connected = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false);
            if(no_connected){
                Toast.makeText(context,"No connected",Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(context,"Connected",Toast.LENGTH_LONG).show();
            }
            // Toast.makeText(context, "Actvity Changed", Toast.LENGTH_SHORT).show();
        }
    }
}
