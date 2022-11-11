// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

public enum WireFormat$FieldType
{
    BOOL(WireFormat$JavaType.BOOLEAN, 0), 
    BYTES("BYTES", 11, WireFormat$JavaType.BYTE_STRING, 2), 
    DOUBLE(WireFormat$JavaType.DOUBLE, 1), 
    ENUM(WireFormat$JavaType.ENUM, 0), 
    FIXED32(int1, 5), 
    FIXED64(long1, 1), 
    FLOAT(WireFormat$JavaType.FLOAT, 5), 
    GROUP("GROUP", 9, message, 3), 
    INT32(int1, 0), 
    INT64(long1, 0), 
    MESSAGE("MESSAGE", 10, message, 2), 
    SFIXED32(int1, 5), 
    SFIXED64(long1, 1), 
    SINT32(int1, 0), 
    SINT64(long1, 0), 
    STRING("STRING", 8, WireFormat$JavaType.STRING, 2), 
    UINT32(int1, 0), 
    UINT64(long1, 0);
    
    private final WireFormat$JavaType javaType;
    private final int wireType;
    
    static {
        final WireFormat$JavaType long1 = WireFormat$JavaType.LONG;
        final WireFormat$JavaType int1 = WireFormat$JavaType.INT;
        final WireFormat$JavaType message = WireFormat$JavaType.MESSAGE;
    }
    
    private WireFormat$FieldType(final WireFormat$JavaType javaType, final int wireType) {
        this.javaType = javaType;
        this.wireType = wireType;
    }
    
    public WireFormat$JavaType getJavaType() {
        return this.javaType;
    }
    
    public int getWireType() {
        return this.wireType;
    }
    
    public boolean isPackable() {
        return true;
    }
}
