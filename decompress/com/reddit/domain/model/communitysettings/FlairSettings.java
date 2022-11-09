// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitysettings;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0002\u0010\bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0007R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\b¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/model/communitysettings/FlairSettings;", "", "()V", "isEnabled", "", "isSelfAssignable", "(ZLjava/lang/Boolean;)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(ZLjava/lang/Boolean;)Lcom/reddit/domain/model/communitysettings/FlairSettings;", "equals", "other", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class FlairSettings
{
    private final boolean isEnabled;
    private final Boolean isSelfAssignable;
    
    public FlairSettings() {
        this(false, null);
    }
    
    public FlairSettings(final boolean isEnabled, final Boolean isSelfAssignable) {
        this.isEnabled = isEnabled;
        this.isSelfAssignable = isSelfAssignable;
    }
    
    public final boolean component1() {
        return this.isEnabled;
    }
    
    public final Boolean component2() {
        return this.isSelfAssignable;
    }
    
    public final FlairSettings copy(final boolean b, final Boolean b2) {
        return new FlairSettings(b, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlairSettings)) {
            return false;
        }
        final FlairSettings flairSettings = (FlairSettings)o;
        return this.isEnabled == flairSettings.isEnabled && f.a((Object)this.isSelfAssignable, (Object)flairSettings.isSelfAssignable);
    }
    
    @Override
    public int hashCode() {
        int isEnabled;
        if ((isEnabled = (this.isEnabled ? 1 : 0)) != 0) {
            isEnabled = 1;
        }
        final Boolean isSelfAssignable = this.isSelfAssignable;
        int hashCode;
        if (isSelfAssignable == null) {
            hashCode = 0;
        }
        else {
            hashCode = isSelfAssignable.hashCode();
        }
        return isEnabled * 31 + hashCode;
    }
    
    public final boolean isEnabled() {
        return this.isEnabled;
    }
    
    public final Boolean isSelfAssignable() {
        return this.isSelfAssignable;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("FlairSettings(isEnabled=");
        k.append(this.isEnabled);
        k.append(", isSelfAssignable=");
        return d.m(k, this.isSelfAssignable, ')');
    }
}
