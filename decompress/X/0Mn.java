// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.File;
import java.util.Iterator;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0Mn
{
    public String LIZ;
    public List<a> LIZIZ;
    
    static {
        Covode.recordClassIndex(2757);
    }
    
    public 0Mn(final String liz) {
        this.LIZ = liz;
    }
    
    public 0Mn(final String liz, final List<a> liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void LIZ() {
        if (!TextUtils.isEmpty((CharSequence)this.LIZ)) {
            final List<a> liziz = this.LIZIZ;
            if (liziz != null && !liziz.isEmpty()) {
                for (final a a : this.LIZIZ) {
                    if (a != null) {
                        a.LIZ(this.LIZ);
                    }
                }
                0Mi.LIZ(this.LIZ);
            }
        }
    }
    
    public static final class a
    {
        public String LIZ;
        public File LIZIZ;
        
        static {
            Covode.recordClassIndex(2758);
        }
        
        public a(final String liz) {
            this.LIZ = liz;
        }
        
        public final void LIZ(final String s) {
            if (!TextUtils.isEmpty((CharSequence)s) && !TextUtils.isEmpty((CharSequence)this.LIZ)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(File.separator);
                sb.append(this.LIZ);
                final String string = sb.toString();
                final File liziz = new File(string);
                this.LIZIZ = liziz;
                if (liziz.exists()) {
                    0Mi.LIZ(string);
                }
            }
        }
    }
}
