// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.View;
import kotlinx.coroutines.channels.AbstractChannel;
import android.net.Uri;
import android.content.ContentResolver;
import hj2.y;
import ej2.b0;
import kotlinx.coroutines.flow.a;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import rg2.p;
import hj2.v;
import lg2.c;
import gj2.e;
import v3.g;
import android.os.Looper;
import kotlinx.coroutines.channels.BufferOverflow;
import android.provider.Settings$Global;
import hj2.a0;
import android.content.Context;
import java.util.LinkedHashMap;

public final class s1
{
    public static final LinkedHashMap a;
    
    static {
        a = new LinkedHashMap();
    }
    
    public static final a0 a(final Context context) {
        final LinkedHashMap a = s1.a;
        synchronized (a) {
            Object o;
            if ((o = a.get(context)) == null) {
                final ContentResolver contentResolver = context.getContentResolver();
                final Uri uri = Settings$Global.getUriFor("animator_duration_scale");
                final AbstractChannel g = a4.a0.g(-1, null, 6);
                o = kotlinx.coroutines.flow.a.M((hj2.e)new v((p)new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uri, new r1(g, v3.g.a(Looper.getMainLooper())), (e)g, context, (c)null)), (b0)ej2.g.b(), new StartedWhileSubscribed(0L, Long.MAX_VALUE), Settings$Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                a.put(context, o);
            }
            return (a0)o;
        }
    }
    
    public static final z0.g b(final View view) {
        sg2.e.f((Object)view, "<this>");
        final Object tag = view.getTag(2131427619);
        z0.g g;
        if (tag instanceof z0.g) {
            g = (z0.g)tag;
        }
        else {
            g = null;
        }
        return g;
    }
}
