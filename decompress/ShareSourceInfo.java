// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.share;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.a.c;

public class ShareSourceInfo
{
    @c(LIZ = "app_name")
    public String appName;
    @c(LIZ = "img_title")
    public String imgTitle;
    @c(LIZ = "img_url")
    public ImageModel imgUrl;
    @c(LIZ = "pkg_name")
    public String pkgName;
    @c(LIZ = "schema_url")
    public String schemaUrl;
    @c(LIZ = "title")
    public String title;
    
    static {
        Covode.recordClassIndex(4962);
    }
    
    public String getAppName() {
        return this.appName;
    }
    
    public String getImgTitle() {
        return this.imgTitle;
    }
    
    public ImageModel getImgUrl() {
        return this.imgUrl;
    }
    
    public String getPkgName() {
        return this.pkgName;
    }
    
    public String getSchemaUrl() {
        return this.schemaUrl;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setAppName(final String appName) {
        this.appName = appName;
    }
    
    public void setImgTitle(final String imgTitle) {
        this.imgTitle = imgTitle;
    }
    
    public void setImgUrl(final ImageModel imgUrl) {
        this.imgUrl = imgUrl;
    }
    
    public void setPkgName(final String pkgName) {
        this.pkgName = pkgName;
    }
    
    public void setSchemaUrl(final String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }
    
    public void setTitle(final String title) {
        this.title = title;
    }
}
