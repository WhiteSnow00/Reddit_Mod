// 
// Decompiled by Procyon v0.6.0
// 

package i6;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import m6.a;
import android.content.Context;
import b6.j;

public final class f extends c<Boolean>
{
    public static final String i;
    
    static {
        i = j.e("StorageNotLowTracker");
    }
    
    public f(final Context context, final a a) {
        super(context, a);
    }
    
    public final Object a() {
        final Context b = super.b;
        final IntentFilter e = this.e();
        Object o = null;
        final Intent registerReceiver = b.registerReceiver((BroadcastReceiver)null, e);
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            final String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    o = Boolean.TRUE;
                }
            }
            else {
                o = Boolean.FALSE;
            }
        }
        else {
            o = Boolean.TRUE;
        }
        return o;
    }
    
    @Override
    public final IntentFilter e() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
    
    @Override
    public final void f(final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        j.c().a(f.i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        final String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                this.b((Object)Boolean.TRUE);
            }
        }
        else {
            this.b((Object)Boolean.FALSE);
        }
    }
}
