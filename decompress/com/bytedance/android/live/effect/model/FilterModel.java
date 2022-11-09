// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.Collection;
import java.util.ArrayList;
import java.io.File;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

public class FilterModel extends LiveEffect
{
    public Effect effect;
    public FilterModel.a filterConfig;
    public int filterType;
    public LocalFilterModel localFilter;
    public List<String> tags;
    
    static {
        Covode.recordClassIndex(6411);
    }
    
    public FilterModel() {
    }
    
    public FilterModel(final Effect effect) {
        this.filterType = 2;
        this.effect = effect;
    }
    
    public boolean equals(final Object o) {
        return this == o || (o instanceof FilterModel && TextUtils.equals((CharSequence)this.getFilterId(), (CharSequence)((LiveEffect)o).getFilterId()));
    }
    
    public Effect getEffect() {
        return this.effect;
    }
    
    public String getFilterId() {
        final int filterType = this.filterType;
        if (filterType != 0 && filterType != 1) {
            if (filterType != 2) {
                return null;
            }
            final Effect effect = this.effect;
            if (effect == null) {
                return null;
            }
            return ((EffectTemplate)effect).getEffectId();
        }
        else {
            final LocalFilterModel localFilter = this.localFilter;
            if (localFilter == null) {
                return null;
            }
            return localFilter.getId();
        }
    }
    
    public String getFilterPath() {
        final int filterType = this.filterType;
        if (filterType != 0 && filterType != 1) {
            if (filterType != 2) {
                return "";
            }
            if (this.effect == null) {
                return "";
            }
            return new File(((com.ss.ugc.effectplatform.model.Effect)this.effect).getUnzipPath()).getAbsolutePath();
        }
        else {
            final LocalFilterModel localFilter = this.localFilter;
            if (localFilter == null) {
                return "";
            }
            return localFilter.getFilterFilePath();
        }
    }
    
    public int getFilterType() {
        return this.filterType;
    }
    
    public LocalFilterModel getLocalFilter() {
        return this.localFilter;
    }
    
    public String getName() {
        final int filterType = this.filterType;
        if (filterType != 0 && filterType != 1) {
            if (filterType != 2) {
                return null;
            }
            return ((com.ss.ugc.effectplatform.model.Effect)this.effect).getName();
        }
        else {
            final LocalFilterModel localFilter = this.localFilter;
            if (localFilter == null) {
                return null;
            }
            return localFilter.getName();
        }
    }
    
    public String getResourceId() {
        final int filterType = this.filterType;
        if (filterType != 0 && filterType != 1) {
            if (filterType != 2) {
                return null;
            }
            final Effect effect = this.effect;
            if (effect == null) {
                return null;
            }
            return ((EffectTemplate)effect).getResourceId();
        }
        else {
            final LocalFilterModel localFilter = this.localFilter;
            if (localFilter == null) {
                return null;
            }
            return localFilter.getId();
        }
    }
    
    public List<String> getTags() {
        return this.tags;
    }
    
    public int hashCode() {
        return this.getFilterId().hashCode();
    }
    
    public boolean isNone() {
        return this.filterType == 0;
    }
    
    public void setEffect(final Effect effect) {
        this.effect = effect;
    }
    
    public void setFilterType(final int filterType) {
        this.filterType = filterType;
    }
    
    public void setLocalFilter(final LocalFilterModel localFilter) {
        this.localFilter = localFilter;
    }
    
    public void setTags(final List<String> list) {
        (this.tags = new ArrayList<String>()).addAll(list);
    }
}
