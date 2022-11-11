// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import com.bumptech.glide.j;
import android.util.Log;
import n3.a;
import android.content.Context;

public final class e implements c
{
    @Override
    public final b build(final Context context, final b.a a) {
        final boolean b = a.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            String s;
            if (b) {
                s = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            }
            else {
                s = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", s);
        }
        Object o;
        if (b) {
            o = new d(context, (j.c)a);
        }
        else {
            o = new k();
        }
        return (b)o;
    }
}
