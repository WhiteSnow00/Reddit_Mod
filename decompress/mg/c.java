// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.util.Iterator;
import java.util.HashSet;
import android.content.Context;
import android.util.Log;
import java.io.Serializable;
import ig.h0;
import java.io.File;
import android.content.res.AssetManager;

public final class c
{
    public final f a;
    
    public c(final f a) {
        this.a = a;
    }
    
    public static final int b(final AssetManager assetManager, final File file) {
        final int intValue = (int)h0.d((Object)assetManager, "addAssetPath", (Class)Integer.class, (Class)String.class, (Serializable)file.getPath());
        final StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(intValue);
        Log.d("SplitCompat", sb.toString());
        return intValue;
    }
    
    public final void a(final Context context, final HashSet set) {
        synchronized (this) {
            final AssetManager assets = context.getAssets();
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                b(assets, (File)iterator.next());
            }
        }
    }
}
