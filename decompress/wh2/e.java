// 
// Decompiled by Procyon v0.6.0
// 

package wh2;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.l;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import cg.d;
import java.util.ArrayList;
import dg2.m;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import java.util.List;

public final class e
{
    public final List<ProtoBuf$Type> a;
    
    public e(final ProtoBuf$TypeTable protoBuf$TypeTable) {
        List typeList = protoBuf$TypeTable.getTypeList();
        if (protoBuf$TypeTable.hasFirstNullable()) {
            final int firstNullable = protoBuf$TypeTable.getFirstNullable();
            final List typeList2 = protoBuf$TypeTable.getTypeList();
            ng2.e.e((Object)typeList2, "typeTable.typeList");
            typeList = new ArrayList<ProtoBuf$Type>(m.u4((Iterable)typeList2, 10));
            int n = 0;
            for (final Object next : typeList2) {
                if (n < 0) {
                    d.a4();
                    throw null;
                }
                ProtoBuf$Type f;
                final ProtoBuf$Type protoBuf$Type = f = (ProtoBuf$Type)next;
                if (n >= firstNullable) {
                    final ProtoBuf$Type$b builder = protoBuf$Type.toBuilder();
                    builder.i |= 0x2;
                    builder.k = true;
                    f = builder.f();
                    if (!f.isInitialized()) {
                        throw new UninitializedMessageException((l)f);
                    }
                }
                ((ArrayList<ProtoBuf$Type>)typeList).add(f);
                ++n;
            }
        }
        ng2.e.e((Object)typeList, "run {\n        val origin\u2026 else originalTypes\n    }");
        this.a = typeList;
    }
    
    public final ProtoBuf$Type a(final int n) {
        return this.a.get(n);
    }
}
