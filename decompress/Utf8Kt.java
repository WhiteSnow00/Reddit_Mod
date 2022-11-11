// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.logging.internal;

import java.io.EOFException;
import sg2.e;
import jk2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003" }, d2 = { "Ljk2/c;", "", "isProbablyUtf8", "logging-interceptor" }, k = 2, mv = { 1, 6, 0 })
public final class Utf8Kt
{
    public static final boolean isProbablyUtf8(final c c) {
        e.f((Object)c, "<this>");
        try {
            final c c2 = new c();
            long g = c.g;
            if (g > 64L) {
                g = 64L;
            }
            c.r(0L, c2, g);
            int i = 0;
            while (i < 16) {
                final int n = i + 1;
                if (c2.e1()) {
                    break;
                }
                final int h = c2.H();
                i = n;
                if (!Character.isISOControl(h)) {
                    continue;
                }
                final boolean whitespace = Character.isWhitespace(h);
                i = n;
                if (!whitespace) {
                    return false;
                }
            }
            return true;
        }
        catch (final EOFException ex) {
            return false;
        }
    }
}
