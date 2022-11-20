// 
// Decompiled by Procyon v0.6.0
// 

package wh2;

import ng2.e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import java.util.List;

public final class f
{
    public static final f b;
    public final List<ProtoBuf$VersionRequirement> a;
    
    static {
        b = new f((List<ProtoBuf$VersionRequirement>)EmptyList.INSTANCE);
    }
    
    public f(final List<ProtoBuf$VersionRequirement> a) {
        this.a = a;
    }
    
    public static final class a
    {
        public static f a(final ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            f b;
            if (protoBuf$VersionRequirementTable.getRequirementCount() == 0) {
                b = f.b;
            }
            else {
                final List requirementList = protoBuf$VersionRequirementTable.getRequirementList();
                e.e((Object)requirementList, "table.requirementList");
                b = new f(requirementList);
            }
            return b;
        }
    }
}
