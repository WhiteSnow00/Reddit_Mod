// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class MediaAdInfo
{
    @c(LIZ = "schema_url")
    public String schemaUrl;
    @c(LIZ = "title")
    public String title;
    
    static {
        Covode.recordClassIndex(4944);
    }
    
    public String getSchemaUrl() {
        return this.schemaUrl;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setSchemaUrl(final String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }
    
    public void setTitle(final String title) {
        this.title = title;
    }
}
