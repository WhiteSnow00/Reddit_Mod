// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import al0.b;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import di2.c;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import java.util.Map;

public enum JvmPrimitiveType
{
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"), 
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"), 
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"), 
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double"), 
    FLOAT(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"), 
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"), 
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"), 
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short");
    
    private static final Map<String, JvmPrimitiveType> TYPE_BY_DESC;
    private static final Map<String, JvmPrimitiveType> TYPE_BY_NAME;
    private static final Map<PrimitiveType, JvmPrimitiveType> TYPE_BY_PRIMITIVE_TYPE;
    private static final Set<c> WRAPPERS_CLASS_NAMES;
    private final String desc;
    private final String name;
    private final PrimitiveType primitiveType;
    private final c wrapperFqName;
    
    private static /* synthetic */ void $$$reportNull$$$0(final int n) {
        String s = null;
        Label_0049: {
            if (n != 2 && n != 4) {
                switch (n) {
                    default: {
                        s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break Label_0049;
                    }
                    case 10:
                    case 11:
                    case 12:
                    case 13: {
                        break;
                    }
                }
            }
            s = "@NotNull method %s.%s must not return null";
        }
        int n2 = 0;
        Label_0099: {
            if (n != 2 && n != 4) {
                switch (n) {
                    default: {
                        n2 = 3;
                        break Label_0099;
                    }
                    case 10:
                    case 11:
                    case 12:
                    case 13: {
                        break;
                    }
                }
            }
            n2 = 2;
        }
        final Object[] array = new Object[n2];
        switch (n) {
            default: {
                array[0] = "className";
                break;
            }
            case 9: {
                array[0] = "wrapperClassName";
                break;
            }
            case 6: {
                array[0] = "primitiveType";
                break;
            }
            case 5:
            case 8: {
                array[0] = "desc";
                break;
            }
            case 3: {
                array[0] = "type";
                break;
            }
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13: {
                array[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            }
            case 1:
            case 7: {
                array[0] = "name";
                break;
            }
        }
        if (n != 2 && n != 4) {
            switch (n) {
                default: {
                    array[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
                }
                case 13: {
                    array[1] = "getWrapperFqName";
                    break;
                }
                case 12: {
                    array[1] = "getDesc";
                    break;
                }
                case 11: {
                    array[1] = "getJavaKeywordName";
                    break;
                }
                case 10: {
                    array[1] = "getPrimitiveType";
                    break;
                }
            }
        }
        else {
            array[1] = "get";
        }
        while (true) {
            switch (n) {
                default: {
                    array[2] = "isWrapperClassName";
                }
                case 2:
                case 4:
                case 10:
                case 11:
                case 12:
                case 13: {
                    final String format = String.format(s, array);
                    if (n != 2 && n != 4) {
                        switch (n) {
                            default: {
                                throw new IllegalArgumentException(format);
                            }
                            case 10:
                            case 11:
                            case 12:
                            case 13: {
                                break;
                            }
                        }
                    }
                    throw new IllegalStateException(format);
                }
                case 6:
                case 7:
                case 8:
                case 9: {
                    array[2] = "<init>";
                    continue;
                }
                case 5: {
                    array[2] = "getByDesc";
                    continue;
                }
                case 1:
                case 3: {
                    array[2] = "get";
                    continue;
                }
            }
            break;
        }
    }
    
    static {
        int i = 0;
        WRAPPERS_CLASS_NAMES = new HashSet<c>();
        TYPE_BY_NAME = new HashMap<String, JvmPrimitiveType>();
        TYPE_BY_PRIMITIVE_TYPE = new EnumMap<PrimitiveType, JvmPrimitiveType>(PrimitiveType.class);
        TYPE_BY_DESC = new HashMap<String, JvmPrimitiveType>();
        for (JvmPrimitiveType[] values = values(); i < values.length; ++i) {
            final JvmPrimitiveType jvmPrimitiveType9 = values[i];
            JvmPrimitiveType.WRAPPERS_CLASS_NAMES.add(jvmPrimitiveType9.getWrapperFqName());
            JvmPrimitiveType.TYPE_BY_NAME.put(jvmPrimitiveType9.getJavaKeywordName(), jvmPrimitiveType9);
            JvmPrimitiveType.TYPE_BY_PRIMITIVE_TYPE.put(jvmPrimitiveType9.getPrimitiveType(), jvmPrimitiveType9);
            JvmPrimitiveType.TYPE_BY_DESC.put(jvmPrimitiveType9.getDesc(), jvmPrimitiveType9);
        }
    }
    
    private JvmPrimitiveType(final PrimitiveType primitiveType, final String name, final String desc, final String s2) {
        if (primitiveType == null) {
            $$$reportNull$$$0(6);
        }
        if (name == null) {
            $$$reportNull$$$0(7);
        }
        if (desc == null) {
            $$$reportNull$$$0(8);
        }
        if (s2 == null) {
            $$$reportNull$$$0(9);
        }
        super(s, n);
        this.primitiveType = primitiveType;
        this.name = name;
        this.desc = desc;
        this.wrapperFqName = new c(s2);
    }
    
    public static JvmPrimitiveType get(final String s) {
        if (s == null) {
            $$$reportNull$$$0(1);
        }
        final JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.TYPE_BY_NAME.get(s);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError((Object)b.h("Non-primitive type name passed: ", s));
    }
    
    public static JvmPrimitiveType get(final PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(3);
        }
        final JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.TYPE_BY_PRIMITIVE_TYPE.get(primitiveType);
        if (jvmPrimitiveType == null) {
            $$$reportNull$$$0(4);
        }
        return jvmPrimitiveType;
    }
    
    public String getDesc() {
        final String desc = this.desc;
        if (desc == null) {
            $$$reportNull$$$0(12);
        }
        return desc;
    }
    
    public String getJavaKeywordName() {
        final String name = this.name;
        if (name == null) {
            $$$reportNull$$$0(11);
        }
        return name;
    }
    
    public PrimitiveType getPrimitiveType() {
        final PrimitiveType primitiveType = this.primitiveType;
        if (primitiveType == null) {
            $$$reportNull$$$0(10);
        }
        return primitiveType;
    }
    
    public c getWrapperFqName() {
        final c wrapperFqName = this.wrapperFqName;
        if (wrapperFqName == null) {
            $$$reportNull$$$0(13);
        }
        return wrapperFqName;
    }
}
