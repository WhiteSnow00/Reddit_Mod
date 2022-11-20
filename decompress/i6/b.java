// 
// Decompiled by Procyon v0.6.0
// 

package i6;

import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import m6.a;
import android.content.Context;
import b6.j;

public final class b extends c<Boolean>
{
    public static final String i;
    
    static {
        i = j.e("BatteryNotLowTracker");
    }
    
    public b(final Context context, final a a) {
        super(context, a);
    }
    
    public final Object a() {
        final IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        final Context b = super.b;
        Object value = null;
        final Intent registerReceiver = b.registerReceiver((BroadcastReceiver)null, intentFilter);
        boolean b2 = false;
        if (registerReceiver == null) {
            j.c().b(i6.b.i, "getInitialState - null intent received", new Throwable[0]);
        }
        else {
            final int intExtra = registerReceiver.getIntExtra("status", -1);
            final float n = registerReceiver.getIntExtra("level", -1) / (float)registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 1 || n > 0.15f) {
                b2 = true;
            }
            value = b2;
        }
        return value;
    }
    
    @Override
    public final IntentFilter e() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
    
    @Override
    public final void f(final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        j.c().a(b.i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        final String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.BATTERY_OKAY")) {
            if (action.equals("android.intent.action.BATTERY_LOW")) {
                this.b((Object)Boolean.FALSE);
            }
        }
        else {
            this.b((Object)Boolean.TRUE);
        }
    }
}
