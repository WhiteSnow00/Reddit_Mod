// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import java.util.List;
import java.util.ArrayList;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import com.bytedance.covode.number.Covode;

public final class 1da extends 7C3
{
    public static final a LIZ;
    public final 7C3 LIZIZ;
    
    static {
        Covode.recordClassIndex(10457);
        LIZ = new a((byte)0);
    }
    
    public 1da(final 7C3 liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
    }
    
    public final 7Ah<?, ?> LIZ(final Type type, final Annotation[] array, final 7A7 7a7) {
        int i = 0;
        Annotation[] array2;
        if (array == null) {
            array2 = new Annotation[0];
        }
        else {
            array2 = array;
        }
        final ArrayList list = new ArrayList();
        while (i < array2.length) {
            final Annotation annotation = array2[i];
            if (annotation instanceof 0yd) {
                list.add(annotation);
            }
            ++i;
        }
        final 0yd 0yd = (0yd)Qsi.LJIIJJI((List)list);
        if (0yd == null) {
            return (7Ah<?, ?>)this.LIZIZ.LIZ(type, array, 7a7);
        }
        final 7Ah liz = this.LIZIZ.LIZ(type, array, 7a7);
        Object o;
        if (liz != null) {
            n.LIZIZ((Object)liz, "");
            o = new 1de((X.7Ah<Object, Object>)liz, 0yd.LIZ(), 0yd.LIZIZ());
        }
        else {
            o = null;
        }
        return (7Ah<?, ?>)o;
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(10458);
        }
        
        public final 1da LIZ(final 7C3 7c3) {
            CTM.LIZ((Object)7c3);
            return new 1da(7c3);
        }
    }
}
