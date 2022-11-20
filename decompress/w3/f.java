// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import android.util.Base64;
import java.util.List;

public final class f
{
    public final String a;
    public final String b;
    public final String c;
    public final List<List<byte[]>> d;
    public final int e;
    public final String f;
    
    public f() {
        this.a = "com.google.android.gms.fonts";
        this.b = "com.google.android.gms";
        this.c = "Noto Color Emoji Compat";
        this.d = null;
        this.e = 2130903050;
        this.f = "com.google.android.gms.fonts-com.google.android.gms-Noto Color Emoji Compat";
    }
    
    public f(final String a, final String b, final String c, final List<List<byte[]>> d) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = 0;
        final StringBuilder sb = new StringBuilder(a);
        sb.append("-");
        sb.append(b);
        sb.append("-");
        sb.append(c);
        this.f = sb.toString();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder t = a.t("FontRequest {mProviderAuthority: ");
        t.append(this.a);
        t.append(", mProviderPackage: ");
        t.append(this.b);
        t.append(", mQuery: ");
        t.append(this.c);
        t.append(", mCertificates:");
        sb.append(t.toString());
        for (int i = 0; i < this.d.size(); ++i) {
            sb.append(" [");
            final List list = this.d.get(i);
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
        sb2.append(this.e);
        sb.append(sb2.toString());
        return sb.toString();
    }
}
