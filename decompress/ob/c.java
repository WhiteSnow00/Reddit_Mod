// 
// Decompiled by Procyon v0.6.0
// 

package ob;

import com.google.android.exoplayer2.ParserException;
import ag0.a;
import java.io.IOException;
import android.util.Log;
import bd.s;
import db.e;

public final class c
{
    public static boolean a(final e e) throws IOException {
        final s s = new s(8);
        final int a = c.a.a(e, s).a;
        if (a != 1380533830 && a != 1380333108) {
            return false;
        }
        e.h(s.a, 0, 4, false);
        s.B(0);
        final int c = s.c();
        if (c != 1463899717) {
            final StringBuilder sb = new StringBuilder(34);
            sb.append("Unsupported form type: ");
            sb.append(c);
            Log.e("WavHeaderReader", sb.toString());
            return false;
        }
        return true;
    }
    
    public static a b(int a, final e e, final s s) throws IOException {
        a a2 = c.a.a(e, s);
        while (true) {
            final int a3 = a2.a;
            if (a3 == a) {
                return a2;
            }
            a.u(39, "Ignoring unknown WAV chunk: ", a3, "WavHeaderReader");
            final long n = a2.b + 8L;
            if (n > 2147483647L) {
                a = a2.a;
                final StringBuilder sb = new StringBuilder(51);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(a);
                throw ParserException.createForUnsupportedContainerFeature(sb.toString());
            }
            e.n((int)n);
            a2 = c.a.a(e, s);
        }
    }
    
    public static final class a
    {
        public final int a;
        public final long b;
        
        public a(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public static a a(final e e, final s s) throws IOException {
            e.h(s.a, 0, 8, false);
            s.B(0);
            return new a(s.c(), s.h());
        }
    }
}
