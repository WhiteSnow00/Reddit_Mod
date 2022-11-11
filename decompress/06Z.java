// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 06z
{
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<List<byte[]>> LIZLLL;
    public final int LJ;
    public final String LJFF;
    
    static {
        Covode.recordClassIndex(762);
    }
    
    public 06z(final String liz, final String liziz, final String lizj) {
        07U.LIZ(liz);
        this.LIZ = liz;
        07U.LIZ(liziz);
        this.LIZIZ = liziz;
        07U.LIZ(lizj);
        this.LIZJ = lizj;
        this.LIZLLL = null;
        this.LJ = 2130903051;
        final StringBuilder sb = new StringBuilder(liz);
        sb.append("-");
        sb.append(liziz);
        sb.append("-");
        sb.append(lizj);
        this.LJFF = sb.toString();
    }
    
    public 06z(final String liz, final String liziz, final String lizj, final List<List<byte[]>> lizlll) {
        07U.LIZ(liz);
        this.LIZ = liz;
        07U.LIZ(liziz);
        this.LIZIZ = liziz;
        07U.LIZ(lizj);
        this.LIZJ = lizj;
        07U.LIZ(lizlll);
        this.LIZLLL = lizlll;
        this.LJ = 0;
        final StringBuilder sb = new StringBuilder(liz);
        sb.append("-");
        sb.append(liziz);
        sb.append("-");
        sb.append(lizj);
        this.LJFF = sb.toString();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.LIZ);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.LIZIZ);
        sb2.append(", mQuery: ");
        sb2.append(this.LIZJ);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.LIZLLL.size(); ++i) {
            sb.append(" [");
            final List list = this.LIZLLL.get(i);
            for (int j = 0; j < list.size(); ++j) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[])list.get(j), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        final StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(this.LJ);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
