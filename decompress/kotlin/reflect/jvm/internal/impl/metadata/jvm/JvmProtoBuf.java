// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.l;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

public final class JvmProtoBuf
{
    public static final GeneratedMessageLite.e<ProtoBuf$Constructor, JvmProtoBuf.JvmProtoBuf$JvmMethodSignature> a;
    public static final GeneratedMessageLite.e<ProtoBuf$Function, JvmProtoBuf.JvmProtoBuf$JvmMethodSignature> b;
    public static final GeneratedMessageLite.e<ProtoBuf$Function, Integer> c;
    public static final GeneratedMessageLite.e<ProtoBuf$Property, JvmProtoBuf.JvmProtoBuf$JvmPropertySignature> d;
    public static final GeneratedMessageLite.e<ProtoBuf$Property, Integer> e;
    public static final GeneratedMessageLite.e<ProtoBuf$Type, List<ProtoBuf$Annotation>> f;
    public static final GeneratedMessageLite.e<ProtoBuf$Type, Boolean> g;
    public static final GeneratedMessageLite.e<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> h;
    public static final GeneratedMessageLite.e<ProtoBuf$Class, Integer> i;
    public static final GeneratedMessageLite.e<ProtoBuf$Class, List<ProtoBuf$Property>> j;
    public static final GeneratedMessageLite.e<ProtoBuf$Class, Integer> k;
    public static final GeneratedMessageLite.e<ProtoBuf$Class, Integer> l;
    public static final GeneratedMessageLite.e<ProtoBuf$Package, Integer> m;
    public static final GeneratedMessageLite.e<ProtoBuf$Package, List<ProtoBuf$Property>> n;
    
    static {
        final ProtoBuf$Constructor defaultInstance = ProtoBuf$Constructor.getDefaultInstance();
        final JvmProtoBuf.JvmProtoBuf$JvmMethodSignature defaultInstance2 = JvmProtoBuf.JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        final JvmProtoBuf.JvmProtoBuf$JvmMethodSignature defaultInstance3 = JvmProtoBuf.JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        final WireFormat$FieldType message = WireFormat$FieldType.MESSAGE;
        a = GeneratedMessageLite.newSingularGeneratedExtension((l)defaultInstance, (Object)defaultInstance2, (l)defaultInstance3, (Internal.b)null, 100, message, (Class)JvmProtoBuf.JvmProtoBuf$JvmMethodSignature.class);
        b = GeneratedMessageLite.newSingularGeneratedExtension((l)ProtoBuf$Function.getDefaultInstance(), (Object)JvmProtoBuf.JvmProtoBuf$JvmMethodSignature.getDefaultInstance(), (l)JvmProtoBuf.JvmProtoBuf$JvmMethodSignature.getDefaultInstance(), (Internal.b)null, 100, message, (Class)JvmProtoBuf.JvmProtoBuf$JvmMethodSignature.class);
        final ProtoBuf$Function defaultInstance4 = ProtoBuf$Function.getDefaultInstance();
        final Integer value = 0;
        final WireFormat$FieldType int32 = WireFormat$FieldType.INT32;
        c = GeneratedMessageLite.newSingularGeneratedExtension((l)defaultInstance4, (Object)value, (l)null, (Internal.b)null, 101, int32, (Class)Integer.class);
        d = GeneratedMessageLite.newSingularGeneratedExtension((l)ProtoBuf$Property.getDefaultInstance(), (Object)JvmProtoBuf.JvmProtoBuf$JvmPropertySignature.getDefaultInstance(), (l)JvmProtoBuf.JvmProtoBuf$JvmPropertySignature.getDefaultInstance(), (Internal.b)null, 100, message, (Class)JvmProtoBuf.JvmProtoBuf$JvmPropertySignature.class);
        e = GeneratedMessageLite.newSingularGeneratedExtension((l)ProtoBuf$Property.getDefaultInstance(), (Object)value, (l)null, (Internal.b)null, 101, int32, (Class)Integer.class);
        f = GeneratedMessageLite.newRepeatedGeneratedExtension((l)ProtoBuf$Type.getDefaultInstance(), (l)ProtoBuf$Annotation.getDefaultInstance(), (Internal.b)null, 100, message, false, (Class)ProtoBuf$Annotation.class);
        g = GeneratedMessageLite.newSingularGeneratedExtension((l)ProtoBuf$Type.getDefaultInstance(), (Object)Boolean.FALSE, (l)null, (Internal.b)null, 101, WireFormat$FieldType.BOOL, (Class)Boolean.class);
        h = GeneratedMessageLite.newRepeatedGeneratedExtension((l)ProtoBuf$TypeParameter.getDefaultInstance(), (l)ProtoBuf$Annotation.getDefaultInstance(), (Internal.b)null, 100, message, false, (Class)ProtoBuf$Annotation.class);
        i = GeneratedMessageLite.newSingularGeneratedExtension((l)ProtoBuf$Class.getDefaultInstance(), (Object)value, (l)null, (Internal.b)null, 101, int32, (Class)Integer.class);
        j = GeneratedMessageLite.newRepeatedGeneratedExtension((l)ProtoBuf$Class.getDefaultInstance(), (l)ProtoBuf$Property.getDefaultInstance(), (Internal.b)null, 102, message, false, (Class)ProtoBuf$Property.class);
        k = GeneratedMessageLite.newSingularGeneratedExtension((l)ProtoBuf$Class.getDefaultInstance(), (Object)value, (l)null, (Internal.b)null, 103, int32, (Class)Integer.class);
        l = GeneratedMessageLite.newSingularGeneratedExtension((l)ProtoBuf$Class.getDefaultInstance(), (Object)value, (l)null, (Internal.b)null, 104, int32, (Class)Integer.class);
        m = GeneratedMessageLite.newSingularGeneratedExtension((l)ProtoBuf$Package.getDefaultInstance(), (Object)value, (l)null, (Internal.b)null, 101, int32, (Class)Integer.class);
        n = GeneratedMessageLite.newRepeatedGeneratedExtension((l)ProtoBuf$Package.getDefaultInstance(), (l)ProtoBuf$Property.getDefaultInstance(), (Internal.b)null, 102, message, false, (Class)ProtoBuf$Property.class);
    }
}
