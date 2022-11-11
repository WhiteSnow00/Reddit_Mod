// 
// Decompiled by Procyon v0.6.0
// 

package o3;

import android.content.IntentSender$SendIntentException;
import android.os.Handler;
import android.content.IntentSender$OnFinished;
import android.content.Intent;
import android.content.Context;
import android.content.IntentSender;
import android.content.BroadcastReceiver;

public final class c extends BroadcastReceiver
{
    public final /* synthetic */ IntentSender a;
    
    public c(final IntentSender a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        try {
            this.a.sendIntent(context, 0, (Intent)null, (IntentSender$OnFinished)null, (Handler)null);
        }
        catch (final IntentSender$SendIntentException ex) {}
    }
}
