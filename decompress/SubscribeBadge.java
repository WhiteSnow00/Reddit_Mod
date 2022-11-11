// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.bytedance.android.live.base.model.ImageModel;

public class SubscribeBadge
{
    @c(LIZ = "origin_img")
    public ImageModel originImage;
    @c(LIZ = "preview_img")
    public ImageModel previewImage;
    
    static {
        Covode.recordClassIndex(4972);
    }
    
    public ImageModel getOriginImage() {
        return this.originImage;
    }
    
    public ImageModel getPreviewImage() {
        return this.previewImage;
    }
    
    public void setOriginImage(final ImageModel originImage) {
        this.originImage = originImage;
    }
    
    public void setPreviewImage(final ImageModel previewImage) {
        this.previewImage = previewImage;
    }
}
