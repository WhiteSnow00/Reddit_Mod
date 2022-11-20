// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

public final class f
{
    public static void a(final int n) {
        final Object[] array = new Object[3];
        if (n != 1 && n != 2) {
            if (n != 3) {
                array[0] = "propertyDescriptor";
            }
            else {
                array[0] = "memberDescriptor";
            }
        }
        else {
            array[0] = "companionObject";
        }
        array[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    array[2] = "isPropertyWithBackingFieldInOuterClass";
                }
                else {
                    array[2] = "hasJvmFieldAnnotation";
                }
            }
            else {
                array[2] = "isMappedIntrinsicCompanionObject";
            }
        }
        else {
            array[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
    }
}
