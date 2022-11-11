// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import com.google.common.collect.ImmutableCollection$a;
import com.google.common.collect.ImmutableList$a;
import java.util.Collection;
import com.google.common.primitives.Ints;
import a4.e2;
import android.media.AudioAttributes$Builder;
import android.media.AudioFormat$Builder;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

public final class e
{
    public static final e c;
    public static final e d;
    public static final int[] e;
    public final int[] a;
    public final int b;
    
    static {
        c = new e(new int[] { 2 }, 8);
        d = new e(new int[] { 2, 5, 6 }, 8);
        e = new int[] { 5, 6, 18, 17, 14, 7, 8 };
    }
    
    public e(int[] copy, final int b) {
        if (copy != null) {
            copy = Arrays.copyOf(copy, copy.length);
            Arrays.sort(this.a = copy);
        }
        else {
            this.a = new int[0];
        }
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        if (!Arrays.equals(this.a, e.a) || this.b != e.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final String string = Arrays.toString(this.a);
        final StringBuilder sb = new StringBuilder(a81.e.h(string, 67));
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(b);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
    
    public static final class a
    {
        public static int[] a() {
            final ImmutableList$a builder = ImmutableList.builder();
            for (final int encoding : xa.e.e) {
                if (e2.l(new AudioFormat$Builder().setChannelMask(12).setEncoding(encoding).setSampleRate(48000).build(), new AudioAttributes$Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    ((ImmutableCollection$a)builder).c((Object)encoding);
                }
            }
            ((ImmutableCollection$a)builder).c((Object)2);
            return Ints.g1((Collection)builder.f());
        }
    }
}
