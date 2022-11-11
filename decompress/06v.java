// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.OperationCanceledException;
import android.os.CancellationSignal;
import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;
import com.bytedance.covode.number.Covode;

public final class 06v
{
    static {
        Covode.recordClassIndex(742);
    }
    
    public static Cursor LIZ(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, final 06W 06W) {
        Label_0021: {
            if (06W == null) {
                final Object lizj = null;
                break Label_0021;
            }
            try {
                final Object lizj = 06W.LIZJ();
                final CancellationSignal cancellationSignal = (CancellationSignal)lizj;
                final 5an liz = new 5aq().LIZ(240004, "android/content/ContentResolver", "query", (Object)contentResolver, new Object[] { uri, array, s, array2, s2, cancellationSignal }, "android.database.Cursor", new 5dv(false));
                if (liz.LIZ) {
                    return (Cursor)liz.LIZIZ;
                }
                return contentResolver.query(uri, array, s, array2, s2, cancellationSignal);
            }
            catch (final Exception ex) {
                if (ex instanceof OperationCanceledException) {
                    throw new 06a();
                }
                throw ex;
            }
        }
    }
}
