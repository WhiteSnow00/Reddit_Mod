// 
// Decompiled by Procyon v0.6.0
// 

package q;

import android.os.BaseBundle;
import android.app.PendingIntent;
import android.os.Parcelable;
import android.os.IBinder;
import androidx.core.app.BundleCompat;
import android.os.Bundle;
import a.a$a;
import android.content.Intent;

public final class i
{
    public final Intent a;
    
    public i(final Intent a) {
        this.a = a;
    }
    
    public static final class a
    {
        public final Intent a;
        public final q.a b;
        public boolean c;
        
        public a() {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new q.a();
            this.c = true;
        }
        
        public a(final k k) {
            final Intent a = new Intent("android.intent.action.VIEW");
            this.a = a;
            this.b = new q.a();
            this.c = true;
            if (k != null) {
                a.setPackage(k.c.getPackageName());
                final a$a a$a = (a$a)k.b;
                a$a.getClass();
                final PendingIntent d = k.d;
                final Bundle bundle = new Bundle();
                BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", (IBinder)a$a);
                if (d != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)d);
                }
                a.putExtras(bundle);
            }
        }
        
        public final i a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                final Bundle bundle = new Bundle();
                BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", (IBinder)null);
                this.a.putExtras(bundle);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.c);
            final Intent a = this.a;
            final Integer a2 = this.b.a;
            final Bundle bundle2 = new Bundle();
            if (a2 != null) {
                ((BaseBundle)bundle2).putInt("android.support.customtabs.extra.TOOLBAR_COLOR", (int)a2);
            }
            a.putExtras(bundle2);
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            return new i(this.a);
        }
    }
}
