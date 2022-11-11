// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import java.io.InputStream;

public class 17z implements 0Ht
{
    public InputStream LIZ;
    
    static {
        Covode.recordClassIndex(1875);
    }
    
    public int LIZ(final byte[] array, int read) {
        MethodCollector.i(19847);
        CTM.LIZ((Object)array);
        final InputStream liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        read = liz.read(array, 0, read);
        MethodCollector.o(19847);
        return read;
    }
    
    @Override
    public void LIZ() {
        final InputStream liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        liz.close();
    }
    
    public final void LIZ(final InputStream liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
}
