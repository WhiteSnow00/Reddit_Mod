// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import android.database.Cursor;
import android.content.Context;
import X.15h;
import X.0CC;
import android.os.Handler;
import X.15i;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import X.5WL;
import X.0CE;
import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import android.content.ContentProvider;

public class ProcessLifecycleOwnerInitializer extends ContentProvider
{
    static {
        Covode.recordClassIndex(1208);
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        return 0;
    }
    
    public String getType(final Uri uri) {
        return null;
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        return null;
    }
    
    public boolean onCreate() {
        final Context context = this.getContext();
        if (!0CE.LIZ.getAndSet(true)) {
            Object o = context.getApplicationContext();
            if (5WL.LIZIZ) {
                if (o == null) {
                    o = 5WL.LIZ;
                }
            }
            ((Application)o).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new 0CE.a());
        }
        final Context context2 = this.getContext();
        final 15i ljiiiizz = 15i.LJIIIIZZ;
        ljiiiizz.LJ = new Handler();
        ljiiiizz.LJFF.LIZ(0CC.a.ON_CREATE);
        Object o2 = context2.getApplicationContext();
        if (5WL.LIZIZ) {
            if (o2 == null) {
                o2 = 5WL.LIZ;
            }
        }
        ((Application)o2).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new 15h(ljiiiizz));
        return true;
    }
    
    public Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        return null;
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        return 0;
    }
}
