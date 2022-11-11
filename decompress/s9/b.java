// 
// Decompiled by Procyon v0.6.0
// 

package s9;

import java.io.FileNotFoundException;
import p9.f;
import p9.f$a;
import android.util.Log;
import android.content.Context;
import android.net.Uri;
import java.io.FileDescriptor;

public final class b
{
    public FileDescriptor a;
    
    public b(final Uri uri, final Context context, final f1.b b, final a a) {
        try {
            this.a = context.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor();
        }
        catch (final FileNotFoundException ex) {
            Log.e("b", "Unable to find file", (Throwable)ex);
            f.a(((f$a)a).a, (Exception)ex);
        }
    }
}
