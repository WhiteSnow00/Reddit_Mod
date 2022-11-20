// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

import org.json.JSONObject;

public final class m
{
    public int a;
    public Object b;
    
    public m(final int a) {
        this.a = a;
    }
    
    public final JSONObject a() {
        final Object b = this.b;
        if (b instanceof JSONObject) {
            return (JSONObject)b;
        }
        return new JSONObject();
    }
}
