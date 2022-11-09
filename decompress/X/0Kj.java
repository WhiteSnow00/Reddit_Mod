// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.io.Reader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ByteArrayInputStream;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import com.bytedance.covode.number.Covode;

public final class 0kj
{
    public static final 0kj LIZ;
    
    static {
        Covode.recordClassIndex(7183);
        LIZ = new 0kj();
    }
    
    private final <T> T LIZ(final Class<T> clazz) {
        try {
            return clazz.newInstance();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    private <T> T LIZIZ(final Class<T> clazz, final byte[] array) {
        CTM.LIZ((Object)clazz, (Object)array);
        final T t = null;
        try {
            final 0Ta 0Ta = new 0Ta();
            0Ta.LIZ(0TX.LIZ(array));
            final 0TU<T> liz = 0ys.LIZ().LIZ(clazz);
            T liziz;
            if (liz != null) {
                liziz = liz.LIZIZ(0Ta);
            }
            else {
                liziz = null;
            }
            T liz2;
            if (liziz == null) {
                liz2 = this.LIZ(clazz);
            }
            else {
                liz2 = liziz;
            }
            return liz2;
        }
        catch (final IOException | Exception ex) {
            return t;
        }
    }
    
    public final <T> T LIZ(final Class<T> clazz, final byte[] array) {
        MethodCollector.i(10697);
        CTM.LIZ((Object)clazz);
        final T t = null;
        if (array == null) {
            MethodCollector.o(10697);
            return null;
        }
        while (true) {
            try {
                final Object liziz = this.LIZIZ((Class<Object>)clazz, array);
                Object liz;
                if (liziz == null) {
                    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
                    final Gson liziz2 = 0b8.a.LIZIZ;
                    liz = liziz2.LIZ(liziz2.LIZ((Reader)new InputStreamReader(byteArrayInputStream)), (Type)clazz);
                }
                else {
                    liz = liziz;
                }
                MethodCollector.o(10697);
                return (T)liz;
            }
            finally {
                final Object liz = t;
                continue;
            }
            break;
        }
    }
}
