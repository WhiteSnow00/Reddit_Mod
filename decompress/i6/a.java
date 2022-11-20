// 
// Decompiled by Procyon v0.6.0
// 

package i6;

import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;
import b6.j;

public final class a extends c<Boolean>
{
    public static final String i;
    
    static {
        i = j.e("BatteryChrgTracker");
    }
    
    public a(final Context context, final m6.a a) {
        super(context, a);
    }
    
    public final Object a() {
        final IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        final Context b = super.b;
        Object value = null;
        final Intent registerReceiver = b.registerReceiver((BroadcastReceiver)null, intentFilter);
        boolean b2 = false;
        if (registerReceiver == null) {
            j.c().b(a.i, "getInitialState - null intent received", new Throwable[0]);
        }
        else {
            final int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                b2 = true;
            }
            value = b2;
        }
        return value;
    }
    
    @Override
    public final IntentFilter e() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
    
    @Override
    public final void f(final Intent intent) {
        final String action = intent.getAction();
        if (action == null) {
            return;
        }
        final j c = j.c();
        final String i = a.i;
        int n = 1;
        c.a(i, String.format("Received %s", action), new Throwable[0]);
        Label_0157: {
            switch (action) {
                case "android.intent.action.ACTION_POWER_CONNECTED": {
                    n = 3;
                    break Label_0157;
                }
                case "android.os.action.CHARGING": {
                    n = 2;
                    break Label_0157;
                }
                case "android.os.action.DISCHARGING": {
                    break Label_0157;
                }
                case "android.intent.action.ACTION_POWER_DISCONNECTED": {
                    n = 0;
                    break Label_0157;
                }
                default:
                    break;
            }
            n = -1;
        }
        switch (n) {
            case 3: {
                this.b((Object)Boolean.TRUE);
                break;
            }
            case 2: {
                this.b((Object)Boolean.TRUE);
                break;
            }
            case 1: {
                this.b((Object)Boolean.FALSE);
                break;
            }
            case 0: {
                this.b((Object)Boolean.FALSE);
                break;
            }
        }
    }
}
