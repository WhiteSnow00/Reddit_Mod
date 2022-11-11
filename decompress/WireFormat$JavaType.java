// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

public enum WireFormat$JavaType
{
    BOOLEAN((Object)Boolean.FALSE), 
    BYTE_STRING((Object)c.f), 
    DOUBLE((Object)0.0), 
    ENUM((Object)null), 
    FLOAT((Object)0.0f), 
    INT((Object)0), 
    LONG((Object)0L), 
    MESSAGE((Object)null), 
    STRING((Object)"");
    
    private final Object defaultDefault;
    
    private WireFormat$JavaType(final Object defaultDefault) {
        this.defaultDefault = defaultDefault;
    }
}
