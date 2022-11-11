// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.google.gson.b;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.covode.number.Covode;
import com.google.gson.a;

public final class 1dr implements a
{
    static {
        Covode.recordClassIndex(10527);
    }
    
    public final boolean shouldSkipClass(final Class<?> clazz) {
        return n.LIZ((Object)clazz, (Object)SubscribeInfo.class);
    }
    
    public final boolean shouldSkipField(final b b) {
        return false;
    }
}
