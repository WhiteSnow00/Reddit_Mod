// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.model;

import com.bytedance.covode.number.Covode;

public class LocalFilterModel
{
    public int coverResId;
    public String filterFilePath;
    public String id;
    public String name;
    
    static {
        Covode.recordClassIndex(6413);
    }
    
    public LocalFilterModel() {
    }
    
    public LocalFilterModel(final String id, final int coverResId, final String name, final String filterFilePath) {
        this.id = id;
        this.coverResId = coverResId;
        this.name = name;
        this.filterFilePath = filterFilePath;
    }
    
    public int getCoverResId() {
        return this.coverResId;
    }
    
    public String getFilterFilePath() {
        return this.filterFilePath;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setCoverResId(final int coverResId) {
        this.coverResId = coverResId;
    }
    
    public void setFilterFilePath(final String filterFilePath) {
        this.filterFilePath = filterFilePath;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
}
