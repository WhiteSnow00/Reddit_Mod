// 
// Decompiled by Procyon v0.6.0
// 

package bh2;

import eh2.c$a;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.builtins.c;

public final class b extends c
{
    public static final b f;
    
    static {
        f = new b();
    }
    
    public b() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        this.d(true);
    }
    
    public final /* bridge */ eh2.c q() {
        return (eh2.c)c$a.a;
    }
}
