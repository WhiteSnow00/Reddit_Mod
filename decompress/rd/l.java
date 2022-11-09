// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import java.util.concurrent.ConcurrentHashMap;

public final class l
{
    public static final i b;
    public static l c;
    public ConcurrentHashMap<String, String> a;
    
    static {
        b = new i("LibraryVersion", "", 0);
        l.c = new l();
    }
    
    public l() {
        this.a = new ConcurrentHashMap<String, String>();
    }
}
