// 
// Decompiled by Procyon v0.6.0
// 

package bb;

import android.media.MediaDrmResetException;

public final class e
{
    public static boolean a(final Throwable t) {
        return t instanceof MediaDrmResetException;
    }
}
