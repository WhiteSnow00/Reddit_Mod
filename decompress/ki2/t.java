// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;

public final class t
{
    public static Modality a(final ProtoBuf$Modality protoBuf$Modality) {
        int n;
        if (protoBuf$Modality == null) {
            n = -1;
        }
        else {
            n = a.a[((Enum)protoBuf$Modality).ordinal()];
        }
        Modality modality;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        modality = Modality.FINAL;
                    }
                    else {
                        modality = Modality.SEALED;
                    }
                }
                else {
                    modality = Modality.ABSTRACT;
                }
            }
            else {
                modality = Modality.OPEN;
            }
        }
        else {
            modality = Modality.FINAL;
        }
        return modality;
    }
    
    public final class a
    {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;
        public static final int[] d;
        
        static {
            final int[] a2 = new int[ProtoBuf$Modality.values().length];
            a2[((Enum)ProtoBuf$Modality.FINAL).ordinal()] = 1;
            a2[((Enum)ProtoBuf$Modality.OPEN).ordinal()] = 2;
            a2[((Enum)ProtoBuf$Modality.ABSTRACT).ordinal()] = 3;
            a2[((Enum)ProtoBuf$Modality.SEALED).ordinal()] = 4;
            a = a2;
            final int[] array = new int[Modality.values().length];
            array[((Enum)Modality.FINAL).ordinal()] = 1;
            array[((Enum)Modality.OPEN).ordinal()] = 2;
            array[((Enum)Modality.ABSTRACT).ordinal()] = 3;
            array[((Enum)Modality.SEALED).ordinal()] = 4;
            final int[] array2 = new int[ProtoBuf$Visibility.values().length];
            array2[((Enum)ProtoBuf$Visibility.INTERNAL).ordinal()] = 1;
            array2[((Enum)ProtoBuf$Visibility.PRIVATE).ordinal()] = 2;
            array2[((Enum)ProtoBuf$Visibility.PRIVATE_TO_THIS).ordinal()] = 3;
            array2[((Enum)ProtoBuf$Visibility.PROTECTED).ordinal()] = 4;
            array2[((Enum)ProtoBuf$Visibility.PUBLIC).ordinal()] = 5;
            array2[((Enum)ProtoBuf$Visibility.LOCAL).ordinal()] = 6;
            final int[] b2 = new int[ProtoBuf$Class$Kind.values().length];
            b2[((Enum)ProtoBuf$Class$Kind.CLASS).ordinal()] = 1;
            b2[((Enum)ProtoBuf$Class$Kind.INTERFACE).ordinal()] = 2;
            b2[((Enum)ProtoBuf$Class$Kind.ENUM_CLASS).ordinal()] = 3;
            b2[((Enum)ProtoBuf$Class$Kind.ENUM_ENTRY).ordinal()] = 4;
            b2[((Enum)ProtoBuf$Class$Kind.ANNOTATION_CLASS).ordinal()] = 5;
            b2[((Enum)ProtoBuf$Class$Kind.OBJECT).ordinal()] = 6;
            b2[((Enum)ProtoBuf$Class$Kind.COMPANION_OBJECT).ordinal()] = 7;
            b = b2;
            final int[] array3 = new int[ClassKind.values().length];
            array3[((Enum)ClassKind.CLASS).ordinal()] = 1;
            array3[((Enum)ClassKind.INTERFACE).ordinal()] = 2;
            array3[((Enum)ClassKind.ENUM_CLASS).ordinal()] = 3;
            array3[((Enum)ClassKind.ENUM_ENTRY).ordinal()] = 4;
            array3[((Enum)ClassKind.ANNOTATION_CLASS).ordinal()] = 5;
            array3[((Enum)ClassKind.OBJECT).ordinal()] = 6;
            final int[] c2 = new int[ProtoBuf$TypeParameter$Variance.values().length];
            c2[((Enum)ProtoBuf$TypeParameter$Variance.IN).ordinal()] = 1;
            c2[((Enum)ProtoBuf$TypeParameter$Variance.OUT).ordinal()] = 2;
            c2[((Enum)ProtoBuf$TypeParameter$Variance.INV).ordinal()] = 3;
            c = c2;
            final int[] d2 = new int[ProtoBuf$Type$Argument$Projection.values().length];
            d2[((Enum)ProtoBuf$Type$Argument$Projection.IN).ordinal()] = 1;
            d2[((Enum)ProtoBuf$Type$Argument$Projection.OUT).ordinal()] = 2;
            d2[((Enum)ProtoBuf$Type$Argument$Projection.INV).ordinal()] = 3;
            d2[((Enum)ProtoBuf$Type$Argument$Projection.STAR).ordinal()] = 4;
            d = d2;
            final int[] array4 = new int[Variance.values().length];
            array4[((Enum)Variance.IN_VARIANCE).ordinal()] = 1;
            array4[((Enum)Variance.OUT_VARIANCE).ordinal()] = 2;
            array4[((Enum)Variance.INVARIANT).ordinal()] = 3;
        }
    }
}
