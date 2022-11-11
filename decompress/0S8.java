// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import android.util.Printer;

public final class 0S8
{
    public static a LIZ;
    public static volatile b LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile Printer LIZLLL;
    
    static {
        Covode.recordClassIndex(4477);
    }
    
    public static Printer LIZ() {
        try {
            final Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer)declaredField.get(Looper.getMainLooper());
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(4478);
        }
    }
    
    public static final class b implements Printer
    {
        public List<Printer> LIZ;
        public List<Printer> LIZIZ;
        public List<Printer> LIZJ;
        public boolean LIZLLL;
        public boolean LJ;
        
        static {
            Covode.recordClassIndex(4479);
        }
        
        public b() {
            this.LIZ = new ArrayList<Printer>();
            this.LIZIZ = new ArrayList<Printer>();
            this.LIZJ = new ArrayList<Printer>();
            this.LIZLLL = false;
            this.LJ = false;
        }
        
        public final void println(final String s) {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return;
            }
            long currentTimeMillis;
            if (0S8.LIZ != null) {
                currentTimeMillis = System.currentTimeMillis();
            }
            else {
                currentTimeMillis = 0L;
            }
            if (s.charAt(0) == '>' && this.LJ) {
                for (final Printer next : this.LIZJ) {
                    if (!this.LIZ.contains(next)) {
                        this.LIZ.add(next);
                    }
                }
                this.LIZJ.clear();
                this.LJ = false;
            }
            this.LIZ.size();
            for (final Printer printer : this.LIZ) {
                if (printer != null && this != printer) {
                    printer.println(s);
                }
            }
            if (s.charAt(0) == '<' && this.LIZLLL) {
                for (final Printer next2 : this.LIZIZ) {
                    this.LIZ.remove(next2);
                    this.LIZJ.remove(next2);
                }
                this.LIZIZ.clear();
                this.LIZLLL = false;
            }
            if (0S8.LIZ != null && currentTimeMillis > 0L) {
                System.currentTimeMillis();
            }
        }
    }
}
