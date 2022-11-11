// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.R;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.ParameterizedType;
import kotlin.jvm.internal.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import com.bytedance.covode.number.Covode;

public final class 1dW extends 7C3
{
    public static final b LIZ;
    
    static {
        Covode.recordClassIndex(10426);
        LIZ = new b((byte)0);
    }
    
    public final 7Ah<?, ?> LIZ(Type liz, final Annotation[] array, final 7A7 7a7) {
        CTM.LIZ((Object)liz, (Object)array, (Object)7a7);
        if (n.LIZ((Object)EL0.class, (Object)7CF.LIZ(liz)) ^ true) {
            return null;
        }
        if (liz instanceof ParameterizedType) {
            final ParameterizedType parameterizedType = (ParameterizedType)liz;
            int i = 0;
            liz = 7CF.LIZ(0, parameterizedType);
            final ArrayList list = new ArrayList();
            while (i < array.length) {
                final Annotation annotation = array[i];
                if (annotation instanceof 0yd) {
                    list.add(annotation);
                }
                ++i;
            }
            final 0yd 0yd = (0yd)Qsi.LJIIJJI((List)list);
            n.LIZIZ((Object)liz, "");
            return (7Ah<?, ?>)new a(liz, 0yd);
        }
        throw new IllegalStateException("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
    }
    
    public static final class b
    {
        static {
            Covode.recordClassIndex(10430);
        }
        
        public final 1dW LIZ() {
            return new 1dW((byte)0);
        }
    }
    
    public static final class a implements 7Ah<R, EL0<? extends R>>
    {
        public final Type LIZ;
        public final 0yd LIZIZ;
        
        static {
            Covode.recordClassIndex(10427);
        }
        
        public a(final Type liz, final 0yd liziz) {
            CTM.LIZ((Object)liz);
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        public final Type LIZ() {
            return this.LIZ;
        }
    }
}
