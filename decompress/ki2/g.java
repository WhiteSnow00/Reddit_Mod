// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import wh2.e;
import mi2.h;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;

public interface g
{
    void a(final ProtoBuf$Function p0, final h p1, final e p2, final TypeDeserializer p3);
    
    public static final class a
    {
        public static final g$a$a a;
        
        static {
            a = new g() {
                @Override
                public final void a(final ProtoBuf$Function protoBuf$Function, final h h, final e e, final TypeDeserializer typeDeserializer) {
                    ng2.e.f((Object)protoBuf$Function, "proto");
                    ng2.e.f((Object)e, "typeTable");
                    ng2.e.f((Object)typeDeserializer, "typeDeserializer");
                }
            };
        }
    }
}
