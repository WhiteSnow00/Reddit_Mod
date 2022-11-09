// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 17p implements a
{
    public final List<0H6> LIZ;
    public final int LIZIZ;
    public final 0H4 LIZJ;
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(1808);
    }
    
    public 17p(final List<0H6> liz, final int liziz, final 0H4 lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final 0H4 LIZ() {
        return this.LIZJ;
    }
    
    @Override
    public final 0H4 LIZ(final 0H4 0h4) {
        if (this.LIZIZ >= this.LIZ.size()) {
            if (0h4.LIZ == null && 0h4.LIZJ != null) {
                if (0h4.LIZIZ != null && !0h4.LIZIZ.isEmpty()) {
                    final String liziz = 0h4.LIZIZ;
                    final String lizj = 0h4.LIZJ;
                    String liz = liziz;
                    if (!lizj.isEmpty()) {
                        if (lizj.equals("/")) {
                            liz = liziz;
                        }
                        else if (lizj.charAt(0) == '/') {
                            if (liziz.equals("/")) {
                                liz = lizj;
                            }
                            else {
                                final StringBuilder sb = new StringBuilder();
                                sb.append(liziz);
                                sb.append(lizj);
                                liz = sb.toString();
                            }
                        }
                        else if (liziz.equals("/")) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(liziz);
                            sb2.append(lizj);
                            liz = sb2.toString();
                        }
                        else {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append(liziz);
                            sb3.append('/');
                            sb3.append(lizj);
                            liz = sb3.toString();
                        }
                    }
                    0h4.LIZ = liz;
                }
                else {
                    0h4.LIZ = 0h4.LIZJ;
                }
            }
            return 0h4;
        }
        if (++this.LIZLLL > 1) {
            final StringBuilder sb4 = new StringBuilder("FileResolver ");
            sb4.append(this.LIZ.get(this.LIZIZ - 1));
            sb4.append(" must call handle() exactly once");
            throw new IllegalStateException(sb4.toString());
        }
        final 17p 17p = new 17p(this.LIZ, this.LIZIZ + 1, 0h4);
        final 0H6 0h5 = this.LIZ.get(this.LIZIZ);
        final 0H4 liz2 = 0h5.LIZ((0H6.a)17p);
        if (liz2 == null) {
            final StringBuilder sb5 = new StringBuilder("resolver ");
            sb5.append(0h5);
            sb5.append(" returned null");
            throw new NullPointerException(sb5.toString());
        }
        if (liz2.LIZ != null) {
            return liz2;
        }
        final StringBuilder sb6 = new StringBuilder("resolver ");
        sb6.append(0h5);
        sb6.append(" returned a file with no body");
        throw new IllegalStateException(sb6.toString());
    }
}
