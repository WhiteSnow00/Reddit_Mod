// 
// Decompiled by Procyon v0.6.0
// 

package gc2;

import com.sendbird.android.shadow.com.google.gson.JsonParseException;
import fc2.h;
import com.sendbird.android.shadow.com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import com.sendbird.android.shadow.com.google.gson.JsonIOException;
import com.sendbird.android.shadow.com.google.gson.JsonSyntaxException;
import java.io.EOFException;
import hc2.f$u;
import hc2.f;
import fc2.g;
import kc2.a;

public final class c
{
    public static g a(final a a) throws JsonParseException {
        boolean b;
        try {
            try {
                a.E();
                b = false;
                try {
                    final hc2.g a2 = f.a;
                    return f$u.Z0(a);
                }
                catch (final EOFException ex) {}
            }
            catch (final NumberFormatException ex2) {
                throw new JsonSyntaxException((Throwable)ex2);
            }
            catch (final IOException ex3) {
                throw new JsonIOException((Throwable)ex3);
            }
            catch (final MalformedJsonException ex4) {
                throw new JsonSyntaxException((Throwable)ex4);
            }
        }
        catch (final EOFException ex) {
            b = true;
        }
        if (b) {
            return h.f;
        }
        final EOFException ex;
        throw new JsonSyntaxException((Throwable)ex);
    }
}
