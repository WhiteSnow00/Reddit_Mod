// 
// Decompiled by Procyon v0.6.0
// 

package n3;

import android.os.Build$VERSION;
import android.text.TextUtils;
import android.content.LocusId;

public final class b
{
    public final String a;
    public final LocusId b;
    
    public b(final String a) {
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.a = a;
            if (Build$VERSION.SDK_INT >= 29) {
                this.b = n3.b.a.a(a);
            }
            else {
                this.b = null;
            }
            return;
        }
        throw new IllegalArgumentException("id cannot be empty");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (b.class != o.getClass()) {
            return false;
        }
        final b b2 = (b)o;
        final String a = this.a;
        if (a == null) {
            if (b2.a != null) {
                b = false;
            }
            return b;
        }
        return a.equals(b2.a);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("LocusIdCompat[");
        final int length = this.a.length();
        final StringBuilder sb = new StringBuilder();
        sb.append(length);
        sb.append("_chars");
        k.append(sb.toString());
        k.append("]");
        return k.toString();
    }
    
    public static final class a
    {
        public static LocusId a(final String s) {
            return new LocusId(s);
        }
        
        public static String b(final LocusId locusId) {
            return locusId.getId();
        }
    }
}
