// 
// Decompiled by Procyon v0.6.0
// 

package fi2;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import java.util.ArrayList;
import yh2.e;

public interface c
{
    public static final a a = c.a.a;
    
    void a(final ch2.c p0, final e p1, final ArrayList p2);
    
    ArrayList b(final LazyJavaClassDescriptor p0);
    
    void c(final LazyJavaClassDescriptor p0, final e p1, final ArrayList p2);
    
    void d(final ch2.c p0, final ArrayList p1);
    
    ArrayList e(final ch2.c p0);
    
    public static final class a
    {
        public static final a a;
        public static final fi2.a b;
        
        static {
            a = new a();
            b = new fi2.a(EmptyList.INSTANCE);
        }
    }
}
