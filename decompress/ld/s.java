// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import java.util.List;
import android.content.pm.PackageManager;
import android.content.Intent;
import ud.f;
import android.util.Log;
import wd.c;
import android.content.Context;

public final class s
{
    public final Context a;
    public int b;
    public int c;
    
    public s(final Context a) {
        this.c = 0;
        this.a = a;
    }
    
    public final int a() {
        synchronized (this) {
            final int c = this.c;
            if (c != 0) {
                return c;
            }
            final PackageManager packageManager = this.a.getPackageManager();
            if (wd.c.a(this.a).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
            final boolean a = f.a();
            int n = 1;
            if (!a) {
                final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null) {
                    if (queryIntentServices.size() > 0) {
                        return this.c = 1;
                    }
                }
            }
            final Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            final List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                return this.c = 2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (f.a()) {
                this.c = 2;
                n = 2;
            }
            else {
                this.c = 1;
            }
            return n;
        }
    }
}
