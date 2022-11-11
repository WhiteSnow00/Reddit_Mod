// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import gj2.t;
import android.net.Uri;
import android.os.Handler;
import kotlinx.coroutines.channels.AbstractChannel;
import hg2.j;
import gj2.e;
import android.database.ContentObserver;

public final class r1 extends ContentObserver
{
    public final /* synthetic */ e<j> a;
    
    public r1(final AbstractChannel a, final Handler handler) {
        this.a = (e<j>)a;
        super(handler);
    }
    
    public final void onChange(final boolean b, final Uri uri) {
        ((t<j>)this.a).e(j.a);
    }
}
