// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import com.google.android.exoplayer2.ParserException;

public final class k
{
    public static void a(final String s, final boolean b) throws ParserException {
        if (b) {
            return;
        }
        throw ParserException.createForMalformedContainer(s, null);
    }
}
