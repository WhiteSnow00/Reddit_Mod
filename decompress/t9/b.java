// 
// Decompiled by Procyon v0.6.0
// 

package t9;

import java.io.FileNotFoundException;
import q9.g;
import android.util.Log;
import v7.a;
import android.content.Context;
import android.net.Uri;
import java.io.FileDescriptor;

public final class b
{
    public FileDescriptor a;
    
    public b(final Uri uri, final Context context, final a a, final t9.a a2) {
        try {
            this.a = context.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor();
        }
        catch (final FileNotFoundException ex) {
            Log.e("b", "Unable to find file", (Throwable)ex);
            g.a(((g.g$a)a2).a, ex);
        }
    }
}
