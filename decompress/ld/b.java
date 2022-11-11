// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.BaseBundle;
import android.app.PendingIntent$CanceledException;
import android.app.PendingIntent;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import ve.g;
import ve.j;
import android.text.TextUtils;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import vd.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import android.content.BroadcastReceiver;

public abstract class b extends BroadcastReceiver
{
    public final ExecutorService a;
    
    public b() {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new a("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
    
    public abstract int a(final Context p0, final ld.a p1);
    
    public void b(final Bundle bundle) {
    }
    
    public final int c(final Context ex, final Intent intent) {
        if (intent.getExtras() == null) {
            return 500;
        }
        final String stringExtra = intent.getStringExtra("google.message_id");
        Label_0089: {
            if (TextUtils.isEmpty((CharSequence)stringExtra)) {
                final Object o = j.e((Object)null);
                break Label_0089;
            }
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("google.message_id", stringExtra);
            Object o = r.a((Context)ex);
            synchronized (o) {
                final int n = ((r)o).d++;
                monitorexit(o);
                o = ((r)o).b((p)new o(n, bundle));
                final int a = this.a((Context)ex, new ld.a(intent));
                try {
                    j.b((g)o, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                    return a;
                }
                catch (final TimeoutException ex) {}
                catch (final InterruptedException ex) {}
                catch (final ExecutionException ex2) {}
                final String value = String.valueOf(ex);
                final StringBuilder sb = new StringBuilder(value.length() + 20);
                sb.append("Message ack failed: ");
                sb.append(value);
                Log.w("CloudMessagingReceiver", sb.toString());
                return a;
            }
        }
    }
    
    public final int d(final Context context, final Intent intent) {
        final PendingIntent pendingIntent = (PendingIntent)intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            }
            catch (final PendingIntent$CanceledException ex) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        }
        else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            this.b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        this.a.execute(new i(this, intent, context, this.isOrderedBroadcast(), this.goAsync()));
    }
}
