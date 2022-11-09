// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import java.io.FileOutputStream;

public class 181 implements 0Ht
{
    public FileOutputStream LIZ;
    
    static {
        Covode.recordClassIndex(1881);
    }
    
    @Override
    public void LIZ() {
        final FileOutputStream liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        else {
            liz.close();
        }
    }
    
    public final void LIZ(final FileOutputStream liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public void LIZ(final byte[] array, final int n, final int n2) {
        MethodCollector.i(7313);
        CTM.LIZ((Object)array);
        final FileOutputStream liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
            MethodCollector.o(7313);
            return;
        }
        liz.write(array, n, n2);
        MethodCollector.o(7313);
    }
    
    public final FileOutputStream LIZIZ() {
        final FileOutputStream liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz;
    }
    
    public void LIZJ() {
        final FileOutputStream liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        else {
            liz.close();
        }
    }
}
