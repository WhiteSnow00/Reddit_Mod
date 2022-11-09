// 
// Decompiled by Procyon v0.6.0
// 

package o9;

import java.util.Iterator;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.MovieBox;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import com.googlecode.mp4parser.a;
import ck.d;
import com.googlecode.mp4parser.BasicContainer;

public final class c extends BasicContainer
{
    static {
        d.a((Class)c.class);
    }
    
    public c(final a a) throws IOException {
        final o9.d d = new o9.d(new String[0]);
        this.initContainer(a, a.size(), (b)d);
    }
    
    public static String b(final byte[] array) {
        final byte[] array2 = new byte[4];
        System.arraycopy(array, 0, array2, 0, Math.min(array.length, 4));
        try {
            return new String(array2, "ISO-8859-1");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new Error("Required character encoding is missing", ex);
        }
    }
    
    public static byte[] f(final String s) {
        final byte[] array = new byte[4];
        if (s != null) {
            for (int i = 0; i < Math.min(4, s.length()); ++i) {
                array[i] = (byte)s.charAt(i);
            }
        }
        return array;
    }
    
    public final void close() throws IOException {
        super.dataSource.close();
    }
    
    public final MovieBox h() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof MovieBox) {
                return (MovieBox)box;
            }
        }
        return null;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("model(");
        sb.append(super.dataSource.toString());
        sb.append(")");
        return sb.toString();
    }
}
