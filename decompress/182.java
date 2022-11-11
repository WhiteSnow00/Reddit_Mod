// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import java.io.Writer;

public class 182 implements 0Ht
{
    public final Writer LIZ;
    
    static {
        Covode.recordClassIndex(1887);
    }
    
    public 182(final Writer liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ() {
        this.LIZ.close();
    }
    
    public final void LIZ(final CharSequence charSequence) {
        CTM.LIZ((Object)charSequence);
        this.LIZ.append(charSequence);
    }
    
    public final void LIZ(final String s) {
        MethodCollector.i(6790);
        CTM.LIZ((Object)s);
        this.LIZ.write(s);
        MethodCollector.o(6790);
    }
}
