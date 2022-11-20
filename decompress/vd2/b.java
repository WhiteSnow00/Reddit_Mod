// 
// Decompiled by Procyon v0.6.0
// 

package vd2;

import android.content.Intent;
import td2.e;
import td2.c;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class b extends BroadcastReceiver
{
    public a a;
    public final Context b;
    public final c c;
    
    public b(final Context b, final e c) {
        this.b = b;
        this.c = (c)c;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)intent, "intent");
        final int intExtra = intent.getIntExtra("state", 0);
        String s = "";
        if (intExtra == 1) {
            final String stringExtra = intent.getStringExtra("name");
            final c c = this.c;
            final StringBuilder t = a.t("Wired headset device ");
            if (stringExtra != null) {
                s = stringExtra;
            }
            t.append(s);
            t.append(" connected");
            c.d("WiredHeadsetReceiver", t.toString());
            final a a = this.a;
            if (a != null) {
                a.b();
            }
        }
        else {
            final String stringExtra2 = intent.getStringExtra("name");
            final c c2 = this.c;
            final StringBuilder t2 = a.t("Wired headset device ");
            if (stringExtra2 != null) {
                s = stringExtra2;
            }
            t2.append(s);
            t2.append(" disconnected");
            c2.d("WiredHeadsetReceiver", t2.toString());
            final a a2 = this.a;
            if (a2 != null) {
                a2.a();
            }
        }
    }
}
