// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.bytedance.covode.number.Covode;

public final class 1oW extends F5g implements SRS<Throwable, String>
{
    public static final 1oW LIZ;
    
    static {
        Covode.recordClassIndex(4051);
        LIZ = new 1oW();
    }
    
    public 1oW() {
        super(1);
    }
    
    public final String LIZ(final Throwable t) {
        CTM.LIZ((Object)t);
        final StringWriter stringWriter = new StringWriter();
        t.printStackTrace(new PrintWriter(stringWriter));
        final String string = stringWriter.toString();
        n.LIZIZ((Object)string, "");
        return string;
    }
}
