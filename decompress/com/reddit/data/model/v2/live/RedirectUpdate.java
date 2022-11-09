// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v2.live;

import com.squareup.moshi.n;

public abstract class RedirectUpdate
{
    public abstract void resolve(final RedirectUpdater p0);
    
    public static class Redirect extends RedirectUpdate
    {
        public RedirectPayload payload;
        
        @Override
        public void resolve(final RedirectUpdater redirectUpdater) {
            redirectUpdater.onRedirect(this.payload.getLink());
        }
    }
    
    public static class RedirectPayload
    {
        @n(name = "redirect")
        public String link;
        
        public String getLink() {
            return this.link;
        }
    }
}
