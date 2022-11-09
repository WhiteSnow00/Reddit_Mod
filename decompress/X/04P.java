// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.IBinder;
import java.util.ArrayList;
import android.net.Uri;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.os.Bundle;
import android.content.Intent;

public final class 04p
{
    public final Intent LIZ;
    public final Bundle LIZIZ;
    
    static {
        Covode.recordClassIndex(567);
    }
    
    public 04p(final Intent liz, final Bundle liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void LIZ(final Context context, final Uri data) {
        this.LIZ.setData(data);
        06x.LIZ(context, this.LIZ, this.LIZIZ);
    }
    
    public static final class a
    {
        public final Intent LIZ;
        public ArrayList<Bundle> LIZIZ;
        public Bundle LIZJ;
        public ArrayList<Bundle> LIZLLL;
        public boolean LJ;
        
        static {
            Covode.recordClassIndex(568);
        }
        
        public a() {
            this(null);
        }
        
        public a(final 04r 04r) {
            final Intent liz = new Intent("android.intent.action.VIEW");
            this.LIZ = liz;
            final IBinder binder = null;
            this.LIZIZ = null;
            this.LIZJ = null;
            this.LIZLLL = null;
            this.LJ = true;
            if (04r != null) {
                liz.setPackage(04r.LIZIZ.getPackageName());
            }
            final Bundle bundle = new Bundle();
            IBinder binder2;
            if (04r == null) {
                binder2 = binder;
            }
            else {
                binder2 = 04r.LIZ.asBinder();
            }
            bundle.putBinder("android.support.customtabs.extra.SESSION", binder2);
            liz.putExtras(bundle);
        }
        
        public final 04p LIZ() {
            final ArrayList<Bundle> liziz = this.LIZIZ;
            if (liziz != null) {
                this.LIZ.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", (ArrayList)liziz);
            }
            final ArrayList<Bundle> lizlll = this.LIZLLL;
            if (lizlll != null) {
                this.LIZ.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", (ArrayList)lizlll);
            }
            this.LIZ.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.LJ);
            return new 04p(this.LIZ, this.LIZJ);
        }
    }
}
