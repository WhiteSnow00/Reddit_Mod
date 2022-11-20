// 
// Decompiled by Procyon v0.6.0
// 

package wh2;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal$a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;

public final class b
{
    public static final b$a A;
    public static final b$a B;
    public static final b$a C;
    public static final b$a D;
    public static final b$a E;
    public static final b$a F;
    public static final b$a G;
    public static final b$a H;
    public static final b$a I;
    public static final b$a J;
    public static final b$a K;
    public static final b$a L;
    public static final b$a M;
    public static final b$a a;
    public static final b$a b;
    public static final b$a c;
    public static final b.b$b d;
    public static final b.b$b e;
    public static final b.b$b f;
    public static final b$a g;
    public static final b$a h;
    public static final b$a i;
    public static final b$a j;
    public static final b$a k;
    public static final b$a l;
    public static final b$a m;
    public static final b$a n;
    public static final b.b$b o;
    public static final b$a p;
    public static final b$a q;
    public static final b$a r;
    public static final b$a s;
    public static final b$a t;
    public static final b$a u;
    public static final b$a v;
    public static final b$a w;
    public static final b$a x;
    public static final b$a y;
    public static final b$a z;
    
    static {
        b = wh2.b.c.a((c<?>)(a = wh2.b.c.b()));
        final b$a b$a = c = wh2.b.c.b();
        final b.b$b b$b = d = new b.b$b(1, (Internal$a[])ProtoBuf$Visibility.values());
        final ProtoBuf$Modality[] values = ProtoBuf$Modality.values();
        final int n2 = 1 + ((c)b$b).b;
        final b.b$b b$b2 = e = new b.b$b(n2, (Internal$a[])values);
        l = wh2.b.c.a((c<?>)(k = wh2.b.c.a((c<?>)(j = wh2.b.c.a((c<?>)(i = wh2.b.c.a((c<?>)(h = wh2.b.c.a((c<?>)(g = wh2.b.c.a((c<?>)(f = new b.b$b(((c)b$b2).b + n2, (Internal$a[])ProtoBuf$Class$Kind.values())))))))))))));
        n = wh2.b.c.a((c<?>)(m = wh2.b.c.a((c<?>)b$b)));
        final b.b$b b$b3 = o = new b.b$b(n2 + ((c)b$b2).b, (Internal$a[])ProtoBuf$MemberKind.values());
        w = wh2.b.c.a((c<?>)(v = wh2.b.c.a((c<?>)(u = wh2.b.c.a((c<?>)(t = wh2.b.c.a((c<?>)(s = wh2.b.c.a((c<?>)(r = wh2.b.c.a((c<?>)(q = wh2.b.c.a((c<?>)(p = wh2.b.c.a((c<?>)b$b3)))))))))))))));
        F = wh2.b.c.a((c<?>)(E = wh2.b.c.a((c<?>)(D = wh2.b.c.a((c<?>)(C = wh2.b.c.a((c<?>)(B = wh2.b.c.a((c<?>)(A = wh2.b.c.a((c<?>)(z = wh2.b.c.a((c<?>)(y = wh2.b.c.a((c<?>)(x = wh2.b.c.a((c<?>)b$b3)))))))))))))))));
        I = wh2.b.c.a((c<?>)(H = wh2.b.c.a((c<?>)(G = wh2.b.c.a((c<?>)b$a)))));
        L = wh2.b.c.a((c<?>)(K = wh2.b.c.a((c<?>)(J = wh2.b.c.a((c<?>)b$b2)))));
        M = wh2.b.c.b();
    }
    
    public static void a(final int n) {
        final Object[] array = new Object[3];
        Label_0073: {
            Label_0068: {
                if (n != 1) {
                    if (n == 2) {
                        array[0] = "kind";
                        break Label_0073;
                    }
                    if (n != 5) {
                        if (n != 6) {
                            if (n == 8) {
                                break Label_0068;
                            }
                            if (n != 9) {
                                if (n != 11) {
                                    array[0] = "visibility";
                                    break Label_0073;
                                }
                                break Label_0068;
                            }
                        }
                        array[0] = "memberKind";
                        break Label_0073;
                    }
                }
            }
            array[0] = "modality";
        }
        array[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (n) {
            default: {
                array[2] = "getClassFlags";
                break;
            }
            case 10:
            case 11: {
                array[2] = "getAccessorFlags";
                break;
            }
            case 7:
            case 8:
            case 9: {
                array[2] = "getPropertyFlags";
                break;
            }
            case 4:
            case 5:
            case 6: {
                array[2] = "getFunctionFlags";
                break;
            }
            case 3: {
                array[2] = "getConstructorFlags";
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
    }
    
    public abstract static class c<E>
    {
        public final int a;
        public final int b;
        
        public c(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public static b$a a(final c<?> c) {
            return new b$a(c.a + c.b);
        }
        
        public static b$a b() {
            return new b$a(0);
        }
    }
}
