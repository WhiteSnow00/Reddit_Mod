// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.net.Uri;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import android.database.ContentObserver;

public final class 09S extends ContentObserver
{
    public final /* synthetic */ 151.b LIZ;
    
    static {
        Covode.recordClassIndex(993);
    }
    
    public 09S(final 151.b liz, final Handler handler) {
        this.LIZ = liz;
        super(handler);
    }
    
    public final void onChange(final boolean b, final Uri uri) {
        this.LIZ.LIZ();
    }
}
