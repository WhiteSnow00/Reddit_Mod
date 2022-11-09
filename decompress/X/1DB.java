// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import com.bytedance.covode.number.Covode;

public final class 1db extends 7AP
{
    static {
        Covode.recordClassIndex(10459);
    }
    
    public final 7At<TypedInput, ?> responseBodyConverter(final Type type, final Annotation[] array, final 7A7 7a7) {
        if (type != 0TX.b.class) {
            return null;
        }
        return (7At<TypedInput, ?>)1dd.LIZ;
    }
}
