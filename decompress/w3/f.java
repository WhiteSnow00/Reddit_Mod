// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import android.util.Base64;
import java.util.List;
import java.lang.reflect.Array;
import java.io.Serializable;
import dk2.c;

public final class f implements c
{
    public final /* synthetic */ int p;
    public int q;
    public Serializable r;
    public Serializable s;
    public Serializable t;
    public Serializable u;
    public Object v;
    
    public f() {
        this.p = 0;
        this.r = "com.google.android.gms.fonts";
        this.s = "com.google.android.gms";
        this.t = "Noto Color Emoji Compat";
        this.v = null;
        this.q = 2130903050;
        this.u = a("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat");
    }
    
    public f(final int q) {
        this.p = 1;
        final int[] r = new int[3];
        this.r = r;
        final int[] s = new int[5];
        (this.s = s)[0] = 12;
        s[1] = 8;
        s[2] = 4;
        s[s[3] = 4] = 4;
        r[0] = 8;
        r[r[1] = 2] = 2;
        this.q = q;
        final Class<Float> type = Float.TYPE;
        this.t = (float[][])Array.newInstance(type, q + 12, 2);
        this.u = (float[][][])Array.newInstance(type, 5, 2, 2);
        this.v = Array.newInstance(type, this.q, 12, 2);
    }
    
    public f(final String r, final String s, final String t, final List v) {
        this.p = 0;
        r.getClass();
        this.r = r;
        s.getClass();
        this.s = s;
        this.t = t;
        v.getClass();
        this.v = v;
        this.q = 0;
        this.u = a(r, s, t);
    }
    
    public static String a(final String s, final String s2, final String s3) {
        final StringBuilder sb = new StringBuilder(s);
        sb.append("-");
        sb.append(s2);
        sb.append("-");
        sb.append(s3);
        return sb.toString();
    }
    
    @Override
    public final String toString() {
        switch (this.p) {
            default: {
                return super.toString();
            }
            case 0: {
                final StringBuilder sb = new StringBuilder();
                final StringBuilder r = a.r("FontRequest {mProviderAuthority: ");
                r.append((String)this.r);
                r.append(", mProviderPackage: ");
                r.append((String)this.s);
                r.append(", mQuery: ");
                r.append((String)this.t);
                r.append(", mCertificates:");
                sb.append(r.toString());
                for (int i = 0; i < ((List)this.v).size(); ++i) {
                    sb.append(" [");
                    final List list = ((List)this.v).get(i);
                    for (int j = 0; j < list.size(); ++j) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[])list.get(j), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("mCertificatesArray: ");
                sb2.append(this.q);
                sb.append(sb2.toString());
                return sb.toString();
            }
        }
    }
}
