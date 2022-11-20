// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import ch2.l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;

public final class u
{
    public static final l a(final ProtoBuf$Visibility protoBuf$Visibility) {
        int n;
        if (protoBuf$Visibility == null) {
            n = -1;
        }
        else {
            n = a.b[((Enum)protoBuf$Visibility).ordinal()];
        }
        Object o = null;
        switch (n) {
            default: {
                o = c.a;
                e.e(o, "PRIVATE");
                break;
            }
            case 6: {
                o = c.f;
                e.e(o, "LOCAL");
                break;
            }
            case 5: {
                o = c.e;
                e.e(o, "PUBLIC");
                break;
            }
            case 4: {
                o = c.c;
                e.e(o, "PROTECTED");
                break;
            }
            case 3: {
                o = c.b;
                e.e(o, "PRIVATE_TO_THIS");
                break;
            }
            case 2: {
                o = c.a;
                e.e(o, "PRIVATE");
                break;
            }
            case 1: {
                o = c.d;
                e.e(o, "INTERNAL");
                break;
            }
        }
        return (l)o;
    }
    
    public static final CallableMemberDescriptor$Kind b(final ProtoBuf$MemberKind protoBuf$MemberKind) {
        int n;
        if (protoBuf$MemberKind == null) {
            n = -1;
        }
        else {
            n = a.a[((Enum)protoBuf$MemberKind).ordinal()];
        }
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.DECLARATION;
                    }
                    else {
                        callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.SYNTHESIZED;
                    }
                }
                else {
                    callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.DELEGATION;
                }
            }
            else {
                callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.FAKE_OVERRIDE;
            }
        }
        else {
            callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.DECLARATION;
        }
        return callableMemberDescriptor$Kind;
    }
    
    public final class a
    {
        public static final int[] a;
        public static final int[] b;
        
        static {
            final int[] a2 = new int[ProtoBuf$MemberKind.values().length];
            a2[((Enum)ProtoBuf$MemberKind.DECLARATION).ordinal()] = 1;
            a2[((Enum)ProtoBuf$MemberKind.FAKE_OVERRIDE).ordinal()] = 2;
            a2[((Enum)ProtoBuf$MemberKind.DELEGATION).ordinal()] = 3;
            a2[((Enum)ProtoBuf$MemberKind.SYNTHESIZED).ordinal()] = 4;
            a = a2;
            final int[] array = new int[CallableMemberDescriptor$Kind.values().length];
            array[((Enum)CallableMemberDescriptor$Kind.DECLARATION).ordinal()] = 1;
            array[((Enum)CallableMemberDescriptor$Kind.FAKE_OVERRIDE).ordinal()] = 2;
            array[((Enum)CallableMemberDescriptor$Kind.DELEGATION).ordinal()] = 3;
            array[((Enum)CallableMemberDescriptor$Kind.SYNTHESIZED).ordinal()] = 4;
            final int[] b2 = new int[ProtoBuf$Visibility.values().length];
            b2[((Enum)ProtoBuf$Visibility.INTERNAL).ordinal()] = 1;
            b2[((Enum)ProtoBuf$Visibility.PRIVATE).ordinal()] = 2;
            b2[((Enum)ProtoBuf$Visibility.PRIVATE_TO_THIS).ordinal()] = 3;
            b2[((Enum)ProtoBuf$Visibility.PROTECTED).ordinal()] = 4;
            b2[((Enum)ProtoBuf$Visibility.PUBLIC).ordinal()] = 5;
            b2[((Enum)ProtoBuf$Visibility.LOCAL).ordinal()] = 6;
            b = b2;
        }
    }
}
