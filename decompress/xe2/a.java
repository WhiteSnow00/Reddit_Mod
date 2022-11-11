// 
// Decompiled by Procyon v0.6.0
// 

package xe2;

import org.json.JSONObject;

public final class a implements Runnable
{
    public final /* synthetic */ JSONObject f;
    
    public a(final JSONObject f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        xe2.f.b(xe2.f.a("", this.f));
    }
}
