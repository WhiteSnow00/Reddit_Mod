// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

import java.util.regex.Pattern;
import java.util.concurrent.ConcurrentHashMap;

public final class e
{
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, String>> a;
    
    static {
        Pattern.compile("\\p{XDigit}+");
    }
    
    public e() {
        this.a = new ConcurrentHashMap<String, ConcurrentHashMap<String, String>>();
    }
}
