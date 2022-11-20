// 
// Decompiled by Procyon v0.6.0
// 

package jh2;

import ng2.e;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;

public interface c
{
    void a();
    
    void b(final String p0, final Position p1, final String p2, final ScopeKind p3, final String p4);
    
    public static final class a implements c
    {
        public static final a a;
        
        static {
            a = new a();
        }
        
        @Override
        public final void a() {
        }
        
        @Override
        public final void b(final String s, final Position position, final String s2, final ScopeKind scopeKind, final String s3) {
            e.f((Object)s, "filePath");
            e.f((Object)position, "position");
            e.f((Object)scopeKind, "scopeKind");
        }
    }
}
