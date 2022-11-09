// 
// Decompiled by Procyon v0.6.0
// 

package androidx.browser.customtabs;

import java.util.NoSuchElementException;
import java.util.List;
import android.net.Uri;
import android.os.RemoteException;
import X.04s;
import android.os.Bundle;
import X.011;
import X.012;
import X.13j;
import com.bytedance.covode.number.Covode;
import android.os.IBinder$DeathRecipient;
import android.os.IBinder;
import java.util.Map;
import android.app.Service;

public abstract class CustomTabsService extends Service
{
    public final Map<IBinder, IBinder$DeathRecipient> LIZ;
    
    static {
        Covode.recordClassIndex(553);
    }
    
    public CustomTabsService() {
        this.LIZ = new 13j<IBinder, IBinder$DeathRecipient>();
        new 012.a() {
            static {
                Covode.recordClassIndex(554);
            }
            
            public final int LIZ(final 011 011, final String s, final Bundle bundle) {
                final CustomTabsService liz = CustomTabsService.this;
                new 04s(011);
                return liz.LJI();
            }
            
            public final Bundle LIZ(final String s, final Bundle bundle) {
                return CustomTabsService.this.LIZLLL();
            }
            
            public final boolean LIZ(final long n) {
                return CustomTabsService.this.LIZ();
            }
            
            public final boolean LIZ(final 011 011) {
                final 04s 04s = new 04s(011);
                try {
                    final IBinder$DeathRecipient binder$DeathRecipient = (IBinder$DeathRecipient)new IBinder$DeathRecipient() {
                        static {
                            Covode.recordClassIndex(555);
                        }
                        
                        public final void binderDied() {
                            CustomTabsService.this.LIZ(04s);
                        }
                    };
                    final Map<IBinder, IBinder$DeathRecipient> liz = CustomTabsService.this.LIZ;
                    monitorenter(liz);
                    try {
                        011.asBinder().linkToDeath((IBinder$DeathRecipient)binder$DeathRecipient, 0);
                        CustomTabsService.this.LIZ.put(011.asBinder(), (IBinder$DeathRecipient)binder$DeathRecipient);
                        monitorexit(liz);
                        return CustomTabsService.this.LIZIZ();
                    }
                    finally {
                        try {
                            monitorexit(liz);
                        }
                        catch (final RemoteException ex) {
                            return false;
                        }
                    }
                }
                catch (final RemoteException ex2) {}
            }
            
            public final boolean LIZ(final 011 011, final int n, final Uri uri, final Bundle bundle) {
                final CustomTabsService liz = CustomTabsService.this;
                new 04s(011);
                return liz.LJII();
            }
            
            public final boolean LIZ(final 011 011, final Uri uri) {
                final CustomTabsService liz = CustomTabsService.this;
                new 04s(011);
                return liz.LJFF();
            }
            
            public final boolean LIZ(final 011 011, final Uri uri, final Bundle bundle, final List<Bundle> list) {
                final CustomTabsService liz = CustomTabsService.this;
                new 04s(011);
                return liz.LIZJ();
            }
            
            public final boolean LIZ(final 011 011, final Bundle bundle) {
                final CustomTabsService liz = CustomTabsService.this;
                new 04s(011);
                return liz.LJ();
            }
        };
    }
    
    public abstract boolean LIZ();
    
    public final boolean LIZ(final 04s 04s) {
        try {
            synchronized (this.LIZ) {
                final IBinder liz = 04s.LIZ();
                liz.unlinkToDeath((IBinder$DeathRecipient)this.LIZ.get(liz), 0);
                this.LIZ.remove(liz);
                return true;
            }
        }
        catch (final NoSuchElementException ex) {
            return false;
        }
    }
    
    public abstract boolean LIZIZ();
    
    public abstract boolean LIZJ();
    
    public abstract Bundle LIZLLL();
    
    public abstract boolean LJ();
    
    public abstract boolean LJFF();
    
    public abstract int LJI();
    
    public abstract boolean LJII();
}
